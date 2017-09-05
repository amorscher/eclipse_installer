/**
 */
package at.bachmann.sc.installer.model.installer;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see at.bachmann.sc.installer.model.installer.InstallerFactory
 * @model kind="package"
 * @generated
 */
public interface InstallerPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "installer";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://installer/1.0.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "Installer";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	InstallerPackage eINSTANCE = at.bachmann.sc.installer.model.installer.impl.InstallerPackageImpl.init();

	/**
	 * The meta object id for the '{@link at.bachmann.sc.installer.model.installer.impl.SoftwareImpl <em>Software</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see at.bachmann.sc.installer.model.installer.impl.SoftwareImpl
	 * @see at.bachmann.sc.installer.model.installer.impl.InstallerPackageImpl#getSoftware()
	 * @generated
	 */
	int SOFTWARE = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOFTWARE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Components</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOFTWARE__COMPONENTS = 1;

	/**
	 * The number of structural features of the '<em>Software</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOFTWARE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Software</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOFTWARE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link at.bachmann.sc.installer.model.installer.impl.InstallableComponentImpl <em>Installable Component</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see at.bachmann.sc.installer.model.installer.impl.InstallableComponentImpl
	 * @see at.bachmann.sc.installer.model.installer.impl.InstallerPackageImpl#getInstallableComponent()
	 * @generated
	 */
	int INSTALLABLE_COMPONENT = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTALLABLE_COMPONENT__NAME = 0;

	/**
	 * The feature id for the '<em><b>Features</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTALLABLE_COMPONENT__FEATURES = 1;

	/**
	 * The feature id for the '<em><b>Sub Components</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTALLABLE_COMPONENT__SUB_COMPONENTS = 2;

	/**
	 * The number of structural features of the '<em>Installable Component</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTALLABLE_COMPONENT_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Installable Component</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTALLABLE_COMPONENT_OPERATION_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link at.bachmann.sc.installer.model.installer.Software <em>Software</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Software</em>'.
	 * @see at.bachmann.sc.installer.model.installer.Software
	 * @generated
	 */
	EClass getSoftware();

	/**
	 * Returns the meta object for the attribute '{@link at.bachmann.sc.installer.model.installer.Software#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see at.bachmann.sc.installer.model.installer.Software#getName()
	 * @see #getSoftware()
	 * @generated
	 */
	EAttribute getSoftware_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link at.bachmann.sc.installer.model.installer.Software#getComponents <em>Components</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Components</em>'.
	 * @see at.bachmann.sc.installer.model.installer.Software#getComponents()
	 * @see #getSoftware()
	 * @generated
	 */
	EReference getSoftware_Components();

	/**
	 * Returns the meta object for class '{@link at.bachmann.sc.installer.model.installer.InstallableComponent <em>Installable Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Installable Component</em>'.
	 * @see at.bachmann.sc.installer.model.installer.InstallableComponent
	 * @generated
	 */
	EClass getInstallableComponent();

	/**
	 * Returns the meta object for the attribute '{@link at.bachmann.sc.installer.model.installer.InstallableComponent#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see at.bachmann.sc.installer.model.installer.InstallableComponent#getName()
	 * @see #getInstallableComponent()
	 * @generated
	 */
	EAttribute getInstallableComponent_Name();

	/**
	 * Returns the meta object for the attribute list '{@link at.bachmann.sc.installer.model.installer.InstallableComponent#getFeatures <em>Features</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Features</em>'.
	 * @see at.bachmann.sc.installer.model.installer.InstallableComponent#getFeatures()
	 * @see #getInstallableComponent()
	 * @generated
	 */
	EAttribute getInstallableComponent_Features();

	/**
	 * Returns the meta object for the containment reference list '{@link at.bachmann.sc.installer.model.installer.InstallableComponent#getSubComponents <em>Sub Components</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Sub Components</em>'.
	 * @see at.bachmann.sc.installer.model.installer.InstallableComponent#getSubComponents()
	 * @see #getInstallableComponent()
	 * @generated
	 */
	EReference getInstallableComponent_SubComponents();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	InstallerFactory getInstallerFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link at.bachmann.sc.installer.model.installer.impl.SoftwareImpl <em>Software</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see at.bachmann.sc.installer.model.installer.impl.SoftwareImpl
		 * @see at.bachmann.sc.installer.model.installer.impl.InstallerPackageImpl#getSoftware()
		 * @generated
		 */
		EClass SOFTWARE = eINSTANCE.getSoftware();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SOFTWARE__NAME = eINSTANCE.getSoftware_Name();

		/**
		 * The meta object literal for the '<em><b>Components</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SOFTWARE__COMPONENTS = eINSTANCE.getSoftware_Components();

		/**
		 * The meta object literal for the '{@link at.bachmann.sc.installer.model.installer.impl.InstallableComponentImpl <em>Installable Component</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see at.bachmann.sc.installer.model.installer.impl.InstallableComponentImpl
		 * @see at.bachmann.sc.installer.model.installer.impl.InstallerPackageImpl#getInstallableComponent()
		 * @generated
		 */
		EClass INSTALLABLE_COMPONENT = eINSTANCE.getInstallableComponent();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INSTALLABLE_COMPONENT__NAME = eINSTANCE.getInstallableComponent_Name();

		/**
		 * The meta object literal for the '<em><b>Features</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INSTALLABLE_COMPONENT__FEATURES = eINSTANCE.getInstallableComponent_Features();

		/**
		 * The meta object literal for the '<em><b>Sub Components</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INSTALLABLE_COMPONENT__SUB_COMPONENTS = eINSTANCE.getInstallableComponent_SubComponents();

	}

} //InstallerPackage
