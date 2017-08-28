package at.bachmann.sc.installer.wizard;

import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Composite;

public class InstallableFeatureSelectionPage extends WizardPage {

	public InstallableFeatureSelectionPage(String pageName) {
		super(pageName);

	}

	public InstallableFeatureSelectionPage(String pageName, String title, ImageDescriptor titleImage) {
		super(pageName, title, titleImage);
	}

	@Override
	public void createControl(Composite parent) {
		Composite container = new Composite(parent, SWT.NONE);

		
		
		setControl(container);

	}
	


}
