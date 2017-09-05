package at.bachmann.sc.installer.wizard;

import java.util.Arrays;
import java.util.List;

import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.provider.ReflectiveItemProviderAdapterFactory;
import org.eclipse.emf.edit.provider.resource.ResourceItemProviderAdapterFactory;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryContentProvider;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider;
import org.eclipse.jface.layout.GridDataFactory;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.dialogs.ContainerCheckedTreeViewer;

import at.bachmann.sc.installer.model.installer.InstallableComponent;
import at.bachmann.sc.installer.model.installer.InstallerFactory;
import at.bachmann.sc.installer.model.installer.Software;
import at.bachmann.sc.installer.model.installer.util.InstallerAdapterFactory;

public class InstallableFeatureSelectionPage extends WizardPage {

	private ComposedAdapterFactory adapterFactory;

	public InstallableFeatureSelectionPage(String pageName) {
		super(pageName);

	}

	public InstallableFeatureSelectionPage(String pageName, String title, ImageDescriptor titleImage) {
		super(pageName, title, titleImage);
	}

	@Override
	public void createControl(Composite parent) {

		Composite container = new Composite(parent, SWT.NONE);
		container.setLayoutData(GridDataFactory.fillDefaults().grab(true,true).create());
		
		GridLayout gridLayout = new GridLayout(1,false);
		container.setLayout(gridLayout);
		
		org.eclipse.swt.widgets.Label label = new org.eclipse.swt.widgets.Label(container,SWT.NONE);
		label.setText("Select Installable Components:");
		
		ContainerCheckedTreeViewer checkedTreeViewer = new ContainerCheckedTreeViewer(container,SWT.BORDER);
		checkedTreeViewer.getTree().setLayoutData(GridDataFactory.fillDefaults().grab(true,true).create());
		
		adapterFactory = new ComposedAdapterFactory(ComposedAdapterFactory.Descriptor.Registry.INSTANCE);

		adapterFactory.addAdapterFactory(new ResourceItemProviderAdapterFactory());
		adapterFactory.addAdapterFactory(new InstallerAdapterFactory());
		adapterFactory.addAdapterFactory(new ReflectiveItemProviderAdapterFactory());
		
		checkedTreeViewer.setLabelProvider(new AdapterFactoryLabelProvider(adapterFactory));
		checkedTreeViewer.setContentProvider(new AdapterFactoryContentProvider(adapterFactory));
		
		Software software = InstallerFactory.eINSTANCE.createSoftware();
		software.setName("Solution Center");
		
		createInstallableComp(software,"CDT",Arrays.asList("org.eclipse.cdt.feature.group")); InstallerFactory.eINSTANCE.createInstallableComponent();
		createInstallableComp(software,"CDT",Arrays.asList("org.eclipse.cdt.feature.group")); InstallerFactory.eINSTANCE.createInstallableComponent();
		createInstallableComp(software,"CDT",Arrays.asList("org.eclipse.cdt.feature.group")); InstallerFactory.eINSTANCE.createInstallableComponent();
		createInstallableComp(software,"CDT",Arrays.asList("org.eclipse.cdt.feature.group")); InstallerFactory.eINSTANCE.createInstallableComponent();
		createInstallableComp(software,"CDT",Arrays.asList("org.eclipse.cdt.feature.group")); InstallerFactory.eINSTANCE.createInstallableComponent();
		createInstallableComp(software,"CDT",Arrays.asList("org.eclipse.cdt.feature.group")); InstallerFactory.eINSTANCE.createInstallableComponent();
		
		checkedTreeViewer.setInput(software);
		
		setControl(container);

	}

	private InstallableComponent createInstallableComp(Software software, String name, List<String> asList) {
		InstallableComponent iComp = InstallerFactory.eINSTANCE.createInstallableComponent();
		iComp.setName(name);
		iComp.getFeatures().addAll(asList);
		software.getComponents().add(iComp);
		return iComp;
	}
	


}
