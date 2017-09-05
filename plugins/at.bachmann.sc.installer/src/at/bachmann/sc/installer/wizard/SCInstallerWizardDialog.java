package at.bachmann.sc.installer.wizard;

import javax.annotation.PostConstruct;
import javax.inject.Inject;
import javax.inject.Named;

import org.eclipse.e4.ui.services.IServiceConstants;
import org.eclipse.jface.wizard.WizardDialog;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Shell;

public class SCInstallerWizardDialog extends WizardDialog {

	private Shell shell;

	@Inject
	public SCInstallerWizardDialog(@ Named (IServiceConstants.ACTIVE_SHELL)
	Shell shellShell ) {
		super(shellShell, new SCInstallerWizard());
		this.shell = shellShell;
	}
	
	
	@Override
	@PostConstruct
	protected Control createContents(Composite parent) {
		// TODO Auto-generated method stub
		return super.createContents(parent);
	}
	
	@Override
	public Shell getShell() {
		return shell;
	}
	@Override
	protected void finishPressed() {
		super.finishPressed();
		this.close();
	}
	@Override
	public boolean close() {
		boolean closed =  super.close();
		 this.shell.close();
		 return closed;
	}
}
