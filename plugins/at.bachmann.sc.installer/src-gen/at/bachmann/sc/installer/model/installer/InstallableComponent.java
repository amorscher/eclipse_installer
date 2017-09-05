/**
 */
package at.bachmann.sc.installer.model.installer;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Installable Component</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link at.bachmann.sc.installer.model.installer.InstallableComponent#getName <em>Name</em>}</li>
 *   <li>{@link at.bachmann.sc.installer.model.installer.InstallableComponent#getFeatures <em>Features</em>}</li>
 *   <li>{@link at.bachmann.sc.installer.model.installer.InstallableComponent#getSubComponents <em>Sub Components</em>}</li>
 * </ul>
 *
 * @see at.bachmann.sc.installer.model.installer.InstallerPackage#getInstallableComponent()
 * @model
 * @generated
 */
public interface InstallableComponent extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see at.bachmann.sc.installer.model.installer.InstallerPackage#getInstallableComponent_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link at.bachmann.sc.installer.model.installer.InstallableComponent#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Features</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Features</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Features</em>' attribute list.
	 * @see at.bachmann.sc.installer.model.installer.InstallerPackage#getInstallableComponent_Features()
	 * @model
	 * @generated
	 */
	EList<String> getFeatures();

	/**
	 * Returns the value of the '<em><b>Sub Components</b></em>' containment reference list.
	 * The list contents are of type {@link at.bachmann.sc.installer.model.installer.InstallableComponent}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sub Components</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sub Components</em>' containment reference list.
	 * @see at.bachmann.sc.installer.model.installer.InstallerPackage#getInstallableComponent_SubComponents()
	 * @model containment="true"
	 * @generated
	 */
	EList<InstallableComponent> getSubComponents();

} // InstallableComponent
