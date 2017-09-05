package at.bachmann.sc.installer.wizard;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.nio.file.FileSystem;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Enumeration;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;

import javax.inject.Inject;

import org.eclipse.jface.wizard.Wizard;

public class SCInstallerWizard extends Wizard {

	private InstallableFeatureSelectionPage selectFeaturePage;
	private SelectInstallDirectory selectInstallDirectory;
	private AcceptLicensePage acceptLicense;

	@Inject
	public SCInstallerWizard() {
		this.setWindowTitle("Modular Installer");
	}
	@Override
	public boolean needsProgressMonitor() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public void addPages() {
		this.acceptLicense = new AcceptLicensePage("AcceptLicense");
		this.selectInstallDirectory = new SelectInstallDirectory("Zip the output");
		this.selectFeaturePage = new InstallableFeatureSelectionPage("Select features to install");
		
		// TODO add pages
		this.addPage(acceptLicense);
		this.addPage(selectInstallDirectory);
		this.addPage(selectFeaturePage);
		
	}

	@Override
	public boolean performFinish() {
		final String installPath = selectInstallDirectory.installPath();
		try {
			getContainer().run(true, true, t -> {
				// do the extraction of the installation zip
				FileSystem fileSystem = FileSystems.getDefault();
				Path eclipseToIntall = fileSystem.getPath(installPath);
				
				t.beginTask("Install Components", 100);
				t.subTask("Extract ...");
				// Open the file
				try (ZipFile file = new ZipFile("/Users/ambros/work/installer/Eclipse_oxy_java.zip")) {

					// Get file entries
					Enumeration<? extends ZipEntry> entries = file.entries();

					// We will unzip files in this folder
					if(eclipseToIntall.toFile().exists()){
						eclipseToIntall.toFile().delete();
					}
					Files.createDirectory(eclipseToIntall);

					// Iterate over entries
					while (entries.hasMoreElements()) {
						ZipEntry entry = entries.nextElement();
						// If directory then create a new directory in
						// uncompressed folder
						if (entry.isDirectory()) {
							System.out.println("Creating Directory:" + installPath + entry.getName());
							Files.createDirectories(fileSystem.getPath(installPath + entry.getName()));
						}
						// Else create the file
						else {
							InputStream is = file.getInputStream(entry);
							String uncompressedFileName = installPath + entry.getName();
							Path uncompressedFilePath = fileSystem.getPath(uncompressedFileName);
							Path path = Files.createFile(uncompressedFilePath);
							if (entry.getName().endsWith("/eclipse")){
								path.toFile().setExecutable(true);
							}
							FileOutputStream fos = new FileOutputStream(uncompressedFileName);
							
							byte[] bytes = new byte[4024];
							int length;
							while ((length = is.read(bytes)) >= 0) {
								fos.write(bytes, 0, length);
							}
							is.close();
							fos.close();
							
							
							System.out.println("Written :" + entry.getName());
						}
					}
				} catch (IOException e) {
					e.printStackTrace();
				}

				// install the feature from an p2 update site
				// ./eclipse -application org.eclipse.equinox.p2.director
				// -repository http://download.eclipse.org/releases/oxygen
				// -installIU org.eclipse.cdt.feature.group -tag AddCDT
				// -noSplash
				t.subTask("Install ...");
				ProcessBuilder p2DirectorProcessBuilder = new ProcessBuilder(
						new File(eclipseToIntall.toFile(), "Eclipse_oxy_java.app/Contents/MacOS/eclipse")
								.getAbsolutePath(),
						"-application", "org.eclipse.equinox.p2.director", "-repository",
						" http://download.eclipse.org/releases/oxygen", "-installIU", "org.eclipse.cdt.feature.group",
						"-tag", "AddCDT", "-noSplash");
				Process installer;
				try {
					installer = p2DirectorProcessBuilder.start();
					installer.waitFor();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				t.done();
				// zip the installation

			});
		} catch (InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return true;
	}

}
