package at.bachmann.sc.installer.wizard;

import org.eclipse.jface.layout.GridDataFactory;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.DirectoryDialog;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Text;

public class SelectInstallDirectory extends WizardPage {

	private Text installPath;

	public SelectInstallDirectory(String pageName) {
		super(pageName);

	}

	public SelectInstallDirectory(String pageName, String title, ImageDescriptor titleImage) {
		super(pageName, title, titleImage);
	}

	@Override
	public void createControl(Composite parent) {
		Composite container = new Composite(parent, SWT.NONE);
		
		GridLayout gridLayout = new GridLayout(3,false);
		container.setLayout(gridLayout);
		Label label = new Label(container,SWT.BORDER);
		label.setText("Select install directory");
		
		installPath = new Text(container,SWT.BORDER);
		installPath.setLayoutData(GridDataFactory.fillDefaults().grab(true,false).create());
		
		org.eclipse.swt.widgets.Button browse = new org.eclipse.swt.widgets.Button(container,SWT.NONE);
		browse.setText("Browse");
		browse.addSelectionListener(new SelectionAdapter() {

			
			@Override
			public void widgetSelected(SelectionEvent e) {
				DirectoryDialog dDialog = new DirectoryDialog(getWizard().getContainer().getShell(), SWT.NONE);
				String absolutePath = dDialog.open();
				if(absolutePath != null){
					installPath.setText(absolutePath);
				}
				
			}
		});	
		setControl(container);

	}
	
  public String installPath(){
	  return installPath.getText();
  }

}
