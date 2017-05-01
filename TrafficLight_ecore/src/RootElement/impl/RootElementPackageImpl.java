/**
 */
package RootElement.impl;

import RootElement.ButtonType;
import RootElement.CarLight;
import RootElement.CarLightType;
import RootElement.Controller;
import RootElement.PedesterianLightType;
import RootElement.PedestrianLight;
import RootElement.RootElementFactory;
import RootElement.RootElementPackage;
import RootElement.Timer;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.uml2.types.TypesPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class RootElementPackageImpl extends EPackageImpl implements RootElementPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass timerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass controllerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pedestrianLightEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass carLightEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum pedesterianLightTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum buttonTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum carLightTypeEEnum = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see RootElement.RootElementPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private RootElementPackageImpl() {
		super(eNS_URI, RootElementFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link RootElementPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static RootElementPackage init() {
		if (isInited) return (RootElementPackage)EPackage.Registry.INSTANCE.getEPackage(RootElementPackage.eNS_URI);

		// Obtain or create and register package
		RootElementPackageImpl theRootElementPackage = (RootElementPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof RootElementPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new RootElementPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		TypesPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theRootElementPackage.createPackageContents();

		// Initialize created meta-data
		theRootElementPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theRootElementPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(RootElementPackage.eNS_URI, theRootElementPackage);
		return theRootElementPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTimer() {
		return timerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTimer_ClockTick() {
		return (EAttribute)timerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTimer__StartClockTick() {
		return timerEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTimer__ResetClockTick() {
		return timerEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getController() {
		return controllerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getController__TurnPedLightGreen() {
		return controllerEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getController__TurnCarLightGreen() {
		return controllerEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getController__CallStartClockTick() {
		return controllerEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getController__CallResetClockTick() {
		return controllerEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getController__TurnPedLightRed() {
		return controllerEClass.getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getController__TurnCarLightYellow() {
		return controllerEClass.getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getController__TurnCarLightRed() {
		return controllerEClass.getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPedestrianLight() {
		return pedestrianLightEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPedestrianLight_PedesterianLightType() {
		return (EAttribute)pedestrianLightEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPedestrianLight_Button_Pressed_Type() {
		return (EAttribute)pedestrianLightEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPedestrianLight_CurrentPedLight() {
		return (EAttribute)pedestrianLightEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPedestrianLight__ButtonPressed() {
		return pedestrianLightEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPedestrianLight__IsPedLightGreen() {
		return pedestrianLightEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPedestrianLight__IsPedLightRed() {
		return pedestrianLightEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCarLight() {
		return carLightEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCarLight_CarLightType() {
		return (EAttribute)carLightEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCarLight_CurrentCarLight() {
		return (EAttribute)carLightEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getCarLight__IsGreen() {
		return carLightEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getCarLight__IsYellow() {
		return carLightEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getCarLight__IsRed() {
		return carLightEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getPedesterianLightType() {
		return pedesterianLightTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getButtonType() {
		return buttonTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getCarLightType() {
		return carLightTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RootElementFactory getRootElementFactory() {
		return (RootElementFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		timerEClass = createEClass(TIMER);
		createEAttribute(timerEClass, TIMER__CLOCK_TICK);
		createEOperation(timerEClass, TIMER___START_CLOCK_TICK);
		createEOperation(timerEClass, TIMER___RESET_CLOCK_TICK);

		controllerEClass = createEClass(CONTROLLER);
		createEOperation(controllerEClass, CONTROLLER___TURN_PED_LIGHT_GREEN);
		createEOperation(controllerEClass, CONTROLLER___TURN_CAR_LIGHT_GREEN);
		createEOperation(controllerEClass, CONTROLLER___CALL_START_CLOCK_TICK);
		createEOperation(controllerEClass, CONTROLLER___CALL_RESET_CLOCK_TICK);
		createEOperation(controllerEClass, CONTROLLER___TURN_PED_LIGHT_RED);
		createEOperation(controllerEClass, CONTROLLER___TURN_CAR_LIGHT_YELLOW);
		createEOperation(controllerEClass, CONTROLLER___TURN_CAR_LIGHT_RED);

		pedestrianLightEClass = createEClass(PEDESTRIAN_LIGHT);
		createEAttribute(pedestrianLightEClass, PEDESTRIAN_LIGHT__PEDESTERIAN_LIGHT_TYPE);
		createEAttribute(pedestrianLightEClass, PEDESTRIAN_LIGHT__BUTTON_PRESSED_TYPE);
		createEAttribute(pedestrianLightEClass, PEDESTRIAN_LIGHT__CURRENT_PED_LIGHT);
		createEOperation(pedestrianLightEClass, PEDESTRIAN_LIGHT___BUTTON_PRESSED);
		createEOperation(pedestrianLightEClass, PEDESTRIAN_LIGHT___IS_PED_LIGHT_GREEN);
		createEOperation(pedestrianLightEClass, PEDESTRIAN_LIGHT___IS_PED_LIGHT_RED);

		carLightEClass = createEClass(CAR_LIGHT);
		createEAttribute(carLightEClass, CAR_LIGHT__CAR_LIGHT_TYPE);
		createEAttribute(carLightEClass, CAR_LIGHT__CURRENT_CAR_LIGHT);
		createEOperation(carLightEClass, CAR_LIGHT___IS_GREEN);
		createEOperation(carLightEClass, CAR_LIGHT___IS_YELLOW);
		createEOperation(carLightEClass, CAR_LIGHT___IS_RED);

		// Create enums
		pedesterianLightTypeEEnum = createEEnum(PEDESTERIAN_LIGHT_TYPE);
		buttonTypeEEnum = createEEnum(BUTTON_TYPE);
		carLightTypeEEnum = createEEnum(CAR_LIGHT_TYPE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		TypesPackage theTypesPackage = (TypesPackage)EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes, features, and operations; add parameters
		initEClass(timerEClass, Timer.class, "Timer", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTimer_ClockTick(), theTypesPackage.getInteger(), "ClockTick", "0", 1, 1, Timer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEOperation(getTimer__StartClockTick(), null, "startClockTick", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEOperation(getTimer__ResetClockTick(), null, "resetClockTick", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEClass(controllerEClass, Controller.class, "Controller", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEOperation(getController__TurnPedLightGreen(), null, "turnPedLightGreen", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEOperation(getController__TurnCarLightGreen(), null, "turnCarLightGreen", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEOperation(getController__CallStartClockTick(), null, "callStartClockTick", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEOperation(getController__CallResetClockTick(), null, "callResetClockTick", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEOperation(getController__TurnPedLightRed(), null, "turnPedLightRed", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEOperation(getController__TurnCarLightYellow(), null, "turnCarLightYellow", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEOperation(getController__TurnCarLightRed(), null, "turnCarLightRed", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEClass(pedestrianLightEClass, PedestrianLight.class, "PedestrianLight", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPedestrianLight_PedesterianLightType(), this.getPedesterianLightType(), "pedesterianLightType", null, 1, 1, PedestrianLight.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getPedestrianLight_Button_Pressed_Type(), this.getButtonType(), "button_Pressed_Type", null, 1, 1, PedestrianLight.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getPedestrianLight_CurrentPedLight(), this.getPedesterianLightType(), "currentPedLight", null, 1, 1, PedestrianLight.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEOperation(getPedestrianLight__ButtonPressed(), theTypesPackage.getBoolean(), "buttonPressed", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEOperation(getPedestrianLight__IsPedLightGreen(), theTypesPackage.getBoolean(), "isPedLightGreen", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEOperation(getPedestrianLight__IsPedLightRed(), theTypesPackage.getBoolean(), "isPedLightRed", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEClass(carLightEClass, CarLight.class, "CarLight", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCarLight_CarLightType(), this.getCarLightType(), "carLightType", null, 1, 1, CarLight.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getCarLight_CurrentCarLight(), this.getCarLightType(), "currentCarLight", null, 1, 1, CarLight.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEOperation(getCarLight__IsGreen(), theTypesPackage.getBoolean(), "isGreen", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEOperation(getCarLight__IsYellow(), theTypesPackage.getBoolean(), "isYellow", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEOperation(getCarLight__IsRed(), theTypesPackage.getBoolean(), "isRed", 1, 1, IS_UNIQUE, !IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(pedesterianLightTypeEEnum, PedesterianLightType.class, "PedesterianLightType");
		addEEnumLiteral(pedesterianLightTypeEEnum, PedesterianLightType.RED);
		addEEnumLiteral(pedesterianLightTypeEEnum, PedesterianLightType.GREEN);

		initEEnum(buttonTypeEEnum, ButtonType.class, "ButtonType");
		addEEnumLiteral(buttonTypeEEnum, ButtonType.BUTTON_A);
		addEEnumLiteral(buttonTypeEEnum, ButtonType.BUTTON_B);

		initEEnum(carLightTypeEEnum, CarLightType.class, "CarLightType");
		addEEnumLiteral(carLightTypeEEnum, CarLightType.GREEN);
		addEEnumLiteral(carLightTypeEEnum, CarLightType.YELLOW);
		addEEnumLiteral(carLightTypeEEnum, CarLightType.RED);

		// Create resource
		createResource(eNS_URI);
	}

} //RootElementPackageImpl
