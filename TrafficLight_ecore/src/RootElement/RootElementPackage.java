/**
 */
package RootElement;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;

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
 * @see RootElement.RootElementFactory
 * @model kind="package"
 * @generated
 */
public interface RootElementPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "RootElement";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http:///RootElement.ecore";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "RootElement";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	RootElementPackage eINSTANCE = RootElement.impl.RootElementPackageImpl.init();

	/**
	 * The meta object id for the '{@link RootElement.impl.TimerImpl <em>Timer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see RootElement.impl.TimerImpl
	 * @see RootElement.impl.RootElementPackageImpl#getTimer()
	 * @generated
	 */
	int TIMER = 0;

	/**
	 * The feature id for the '<em><b>Clock Tick</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMER__CLOCK_TICK = 0;

	/**
	 * The number of structural features of the '<em>Timer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMER_FEATURE_COUNT = 1;

	/**
	 * The operation id for the '<em>Start Clock Tick</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMER___START_CLOCK_TICK = 0;

	/**
	 * The operation id for the '<em>Reset Clock Tick</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMER___RESET_CLOCK_TICK = 1;

	/**
	 * The number of operations of the '<em>Timer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMER_OPERATION_COUNT = 2;

	/**
	 * The meta object id for the '{@link RootElement.impl.ControllerImpl <em>Controller</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see RootElement.impl.ControllerImpl
	 * @see RootElement.impl.RootElementPackageImpl#getController()
	 * @generated
	 */
	int CONTROLLER = 1;

	/**
	 * The number of structural features of the '<em>Controller</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROLLER_FEATURE_COUNT = 0;

	/**
	 * The operation id for the '<em>Turn Ped Light Green</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROLLER___TURN_PED_LIGHT_GREEN = 0;

	/**
	 * The operation id for the '<em>Turn Car Light Green</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROLLER___TURN_CAR_LIGHT_GREEN = 1;

	/**
	 * The operation id for the '<em>Call Start Clock Tick</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROLLER___CALL_START_CLOCK_TICK = 2;

	/**
	 * The operation id for the '<em>Call Reset Clock Tick</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROLLER___CALL_RESET_CLOCK_TICK = 3;

	/**
	 * The operation id for the '<em>Turn Ped Light Red</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROLLER___TURN_PED_LIGHT_RED = 4;

	/**
	 * The operation id for the '<em>Turn Car Light Yellow</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROLLER___TURN_CAR_LIGHT_YELLOW = 5;

	/**
	 * The operation id for the '<em>Turn Car Light Red</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROLLER___TURN_CAR_LIGHT_RED = 6;

	/**
	 * The number of operations of the '<em>Controller</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROLLER_OPERATION_COUNT = 7;

	/**
	 * The meta object id for the '{@link RootElement.impl.PedestrianLightImpl <em>Pedestrian Light</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see RootElement.impl.PedestrianLightImpl
	 * @see RootElement.impl.RootElementPackageImpl#getPedestrianLight()
	 * @generated
	 */
	int PEDESTRIAN_LIGHT = 2;

	/**
	 * The feature id for the '<em><b>Pedesterian Light Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PEDESTRIAN_LIGHT__PEDESTERIAN_LIGHT_TYPE = 0;

	/**
	 * The feature id for the '<em><b>Button Pressed Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PEDESTRIAN_LIGHT__BUTTON_PRESSED_TYPE = 1;

	/**
	 * The feature id for the '<em><b>Current Ped Light</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PEDESTRIAN_LIGHT__CURRENT_PED_LIGHT = 2;

	/**
	 * The number of structural features of the '<em>Pedestrian Light</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PEDESTRIAN_LIGHT_FEATURE_COUNT = 3;

	/**
	 * The operation id for the '<em>Button Pressed</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PEDESTRIAN_LIGHT___BUTTON_PRESSED = 0;

	/**
	 * The operation id for the '<em>Is Ped Light Green</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PEDESTRIAN_LIGHT___IS_PED_LIGHT_GREEN = 1;

	/**
	 * The operation id for the '<em>Is Ped Light Red</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PEDESTRIAN_LIGHT___IS_PED_LIGHT_RED = 2;

	/**
	 * The number of operations of the '<em>Pedestrian Light</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PEDESTRIAN_LIGHT_OPERATION_COUNT = 3;

	/**
	 * The meta object id for the '{@link RootElement.impl.CarLightImpl <em>Car Light</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see RootElement.impl.CarLightImpl
	 * @see RootElement.impl.RootElementPackageImpl#getCarLight()
	 * @generated
	 */
	int CAR_LIGHT = 3;

	/**
	 * The feature id for the '<em><b>Car Light Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAR_LIGHT__CAR_LIGHT_TYPE = 0;

	/**
	 * The feature id for the '<em><b>Current Car Light</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAR_LIGHT__CURRENT_CAR_LIGHT = 1;

	/**
	 * The number of structural features of the '<em>Car Light</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAR_LIGHT_FEATURE_COUNT = 2;

	/**
	 * The operation id for the '<em>Is Green</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAR_LIGHT___IS_GREEN = 0;

	/**
	 * The operation id for the '<em>Is Yellow</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAR_LIGHT___IS_YELLOW = 1;

	/**
	 * The operation id for the '<em>Is Red</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAR_LIGHT___IS_RED = 2;

	/**
	 * The number of operations of the '<em>Car Light</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAR_LIGHT_OPERATION_COUNT = 3;

	/**
	 * The meta object id for the '{@link RootElement.PedesterianLightType <em>Pedesterian Light Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see RootElement.PedesterianLightType
	 * @see RootElement.impl.RootElementPackageImpl#getPedesterianLightType()
	 * @generated
	 */
	int PEDESTERIAN_LIGHT_TYPE = 4;

	/**
	 * The meta object id for the '{@link RootElement.ButtonType <em>Button Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see RootElement.ButtonType
	 * @see RootElement.impl.RootElementPackageImpl#getButtonType()
	 * @generated
	 */
	int BUTTON_TYPE = 5;

	/**
	 * The meta object id for the '{@link RootElement.CarLightType <em>Car Light Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see RootElement.CarLightType
	 * @see RootElement.impl.RootElementPackageImpl#getCarLightType()
	 * @generated
	 */
	int CAR_LIGHT_TYPE = 6;

	/**
	 * Returns the meta object for class '{@link RootElement.Timer <em>Timer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Timer</em>'.
	 * @see RootElement.Timer
	 * @generated
	 */
	EClass getTimer();

	/**
	 * Returns the meta object for the attribute '{@link RootElement.Timer#getClockTick <em>Clock Tick</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Clock Tick</em>'.
	 * @see RootElement.Timer#getClockTick()
	 * @see #getTimer()
	 * @generated
	 */
	EAttribute getTimer_ClockTick();

	/**
	 * Returns the meta object for the '{@link RootElement.Timer#startClockTick() <em>Start Clock Tick</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Start Clock Tick</em>' operation.
	 * @see RootElement.Timer#startClockTick()
	 * @generated
	 */
	EOperation getTimer__StartClockTick();

	/**
	 * Returns the meta object for the '{@link RootElement.Timer#resetClockTick() <em>Reset Clock Tick</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Reset Clock Tick</em>' operation.
	 * @see RootElement.Timer#resetClockTick()
	 * @generated
	 */
	EOperation getTimer__ResetClockTick();

	/**
	 * Returns the meta object for class '{@link RootElement.Controller <em>Controller</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Controller</em>'.
	 * @see RootElement.Controller
	 * @generated
	 */
	EClass getController();

	/**
	 * Returns the meta object for the '{@link RootElement.Controller#turnPedLightGreen() <em>Turn Ped Light Green</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Turn Ped Light Green</em>' operation.
	 * @see RootElement.Controller#turnPedLightGreen()
	 * @generated
	 */
	EOperation getController__TurnPedLightGreen();

	/**
	 * Returns the meta object for the '{@link RootElement.Controller#turnCarLightGreen() <em>Turn Car Light Green</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Turn Car Light Green</em>' operation.
	 * @see RootElement.Controller#turnCarLightGreen()
	 * @generated
	 */
	EOperation getController__TurnCarLightGreen();

	/**
	 * Returns the meta object for the '{@link RootElement.Controller#callStartClockTick() <em>Call Start Clock Tick</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Call Start Clock Tick</em>' operation.
	 * @see RootElement.Controller#callStartClockTick()
	 * @generated
	 */
	EOperation getController__CallStartClockTick();

	/**
	 * Returns the meta object for the '{@link RootElement.Controller#callResetClockTick() <em>Call Reset Clock Tick</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Call Reset Clock Tick</em>' operation.
	 * @see RootElement.Controller#callResetClockTick()
	 * @generated
	 */
	EOperation getController__CallResetClockTick();

	/**
	 * Returns the meta object for the '{@link RootElement.Controller#turnPedLightRed() <em>Turn Ped Light Red</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Turn Ped Light Red</em>' operation.
	 * @see RootElement.Controller#turnPedLightRed()
	 * @generated
	 */
	EOperation getController__TurnPedLightRed();

	/**
	 * Returns the meta object for the '{@link RootElement.Controller#turnCarLightYellow() <em>Turn Car Light Yellow</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Turn Car Light Yellow</em>' operation.
	 * @see RootElement.Controller#turnCarLightYellow()
	 * @generated
	 */
	EOperation getController__TurnCarLightYellow();

	/**
	 * Returns the meta object for the '{@link RootElement.Controller#turnCarLightRed() <em>Turn Car Light Red</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Turn Car Light Red</em>' operation.
	 * @see RootElement.Controller#turnCarLightRed()
	 * @generated
	 */
	EOperation getController__TurnCarLightRed();

	/**
	 * Returns the meta object for class '{@link RootElement.PedestrianLight <em>Pedestrian Light</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pedestrian Light</em>'.
	 * @see RootElement.PedestrianLight
	 * @generated
	 */
	EClass getPedestrianLight();

	/**
	 * Returns the meta object for the attribute '{@link RootElement.PedestrianLight#getPedesterianLightType <em>Pedesterian Light Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Pedesterian Light Type</em>'.
	 * @see RootElement.PedestrianLight#getPedesterianLightType()
	 * @see #getPedestrianLight()
	 * @generated
	 */
	EAttribute getPedestrianLight_PedesterianLightType();

	/**
	 * Returns the meta object for the attribute '{@link RootElement.PedestrianLight#getButton_Pressed_Type <em>Button Pressed Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Button Pressed Type</em>'.
	 * @see RootElement.PedestrianLight#getButton_Pressed_Type()
	 * @see #getPedestrianLight()
	 * @generated
	 */
	EAttribute getPedestrianLight_Button_Pressed_Type();

	/**
	 * Returns the meta object for the attribute '{@link RootElement.PedestrianLight#getCurrentPedLight <em>Current Ped Light</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Current Ped Light</em>'.
	 * @see RootElement.PedestrianLight#getCurrentPedLight()
	 * @see #getPedestrianLight()
	 * @generated
	 */
	EAttribute getPedestrianLight_CurrentPedLight();

	/**
	 * Returns the meta object for the '{@link RootElement.PedestrianLight#buttonPressed() <em>Button Pressed</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Button Pressed</em>' operation.
	 * @see RootElement.PedestrianLight#buttonPressed()
	 * @generated
	 */
	EOperation getPedestrianLight__ButtonPressed();

	/**
	 * Returns the meta object for the '{@link RootElement.PedestrianLight#isPedLightGreen() <em>Is Ped Light Green</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Ped Light Green</em>' operation.
	 * @see RootElement.PedestrianLight#isPedLightGreen()
	 * @generated
	 */
	EOperation getPedestrianLight__IsPedLightGreen();

	/**
	 * Returns the meta object for the '{@link RootElement.PedestrianLight#isPedLightRed() <em>Is Ped Light Red</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Ped Light Red</em>' operation.
	 * @see RootElement.PedestrianLight#isPedLightRed()
	 * @generated
	 */
	EOperation getPedestrianLight__IsPedLightRed();

	/**
	 * Returns the meta object for class '{@link RootElement.CarLight <em>Car Light</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Car Light</em>'.
	 * @see RootElement.CarLight
	 * @generated
	 */
	EClass getCarLight();

	/**
	 * Returns the meta object for the attribute '{@link RootElement.CarLight#getCarLightType <em>Car Light Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Car Light Type</em>'.
	 * @see RootElement.CarLight#getCarLightType()
	 * @see #getCarLight()
	 * @generated
	 */
	EAttribute getCarLight_CarLightType();

	/**
	 * Returns the meta object for the attribute '{@link RootElement.CarLight#getCurrentCarLight <em>Current Car Light</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Current Car Light</em>'.
	 * @see RootElement.CarLight#getCurrentCarLight()
	 * @see #getCarLight()
	 * @generated
	 */
	EAttribute getCarLight_CurrentCarLight();

	/**
	 * Returns the meta object for the '{@link RootElement.CarLight#isGreen() <em>Is Green</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Green</em>' operation.
	 * @see RootElement.CarLight#isGreen()
	 * @generated
	 */
	EOperation getCarLight__IsGreen();

	/**
	 * Returns the meta object for the '{@link RootElement.CarLight#isYellow() <em>Is Yellow</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Yellow</em>' operation.
	 * @see RootElement.CarLight#isYellow()
	 * @generated
	 */
	EOperation getCarLight__IsYellow();

	/**
	 * Returns the meta object for the '{@link RootElement.CarLight#isRed() <em>Is Red</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Red</em>' operation.
	 * @see RootElement.CarLight#isRed()
	 * @generated
	 */
	EOperation getCarLight__IsRed();

	/**
	 * Returns the meta object for enum '{@link RootElement.PedesterianLightType <em>Pedesterian Light Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Pedesterian Light Type</em>'.
	 * @see RootElement.PedesterianLightType
	 * @generated
	 */
	EEnum getPedesterianLightType();

	/**
	 * Returns the meta object for enum '{@link RootElement.ButtonType <em>Button Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Button Type</em>'.
	 * @see RootElement.ButtonType
	 * @generated
	 */
	EEnum getButtonType();

	/**
	 * Returns the meta object for enum '{@link RootElement.CarLightType <em>Car Light Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Car Light Type</em>'.
	 * @see RootElement.CarLightType
	 * @generated
	 */
	EEnum getCarLightType();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	RootElementFactory getRootElementFactory();

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
		 * The meta object literal for the '{@link RootElement.impl.TimerImpl <em>Timer</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see RootElement.impl.TimerImpl
		 * @see RootElement.impl.RootElementPackageImpl#getTimer()
		 * @generated
		 */
		EClass TIMER = eINSTANCE.getTimer();

		/**
		 * The meta object literal for the '<em><b>Clock Tick</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TIMER__CLOCK_TICK = eINSTANCE.getTimer_ClockTick();

		/**
		 * The meta object literal for the '<em><b>Start Clock Tick</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation TIMER___START_CLOCK_TICK = eINSTANCE.getTimer__StartClockTick();

		/**
		 * The meta object literal for the '<em><b>Reset Clock Tick</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation TIMER___RESET_CLOCK_TICK = eINSTANCE.getTimer__ResetClockTick();

		/**
		 * The meta object literal for the '{@link RootElement.impl.ControllerImpl <em>Controller</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see RootElement.impl.ControllerImpl
		 * @see RootElement.impl.RootElementPackageImpl#getController()
		 * @generated
		 */
		EClass CONTROLLER = eINSTANCE.getController();

		/**
		 * The meta object literal for the '<em><b>Turn Ped Light Green</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CONTROLLER___TURN_PED_LIGHT_GREEN = eINSTANCE.getController__TurnPedLightGreen();

		/**
		 * The meta object literal for the '<em><b>Turn Car Light Green</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CONTROLLER___TURN_CAR_LIGHT_GREEN = eINSTANCE.getController__TurnCarLightGreen();

		/**
		 * The meta object literal for the '<em><b>Call Start Clock Tick</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CONTROLLER___CALL_START_CLOCK_TICK = eINSTANCE.getController__CallStartClockTick();

		/**
		 * The meta object literal for the '<em><b>Call Reset Clock Tick</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CONTROLLER___CALL_RESET_CLOCK_TICK = eINSTANCE.getController__CallResetClockTick();

		/**
		 * The meta object literal for the '<em><b>Turn Ped Light Red</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CONTROLLER___TURN_PED_LIGHT_RED = eINSTANCE.getController__TurnPedLightRed();

		/**
		 * The meta object literal for the '<em><b>Turn Car Light Yellow</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CONTROLLER___TURN_CAR_LIGHT_YELLOW = eINSTANCE.getController__TurnCarLightYellow();

		/**
		 * The meta object literal for the '<em><b>Turn Car Light Red</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CONTROLLER___TURN_CAR_LIGHT_RED = eINSTANCE.getController__TurnCarLightRed();

		/**
		 * The meta object literal for the '{@link RootElement.impl.PedestrianLightImpl <em>Pedestrian Light</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see RootElement.impl.PedestrianLightImpl
		 * @see RootElement.impl.RootElementPackageImpl#getPedestrianLight()
		 * @generated
		 */
		EClass PEDESTRIAN_LIGHT = eINSTANCE.getPedestrianLight();

		/**
		 * The meta object literal for the '<em><b>Pedesterian Light Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PEDESTRIAN_LIGHT__PEDESTERIAN_LIGHT_TYPE = eINSTANCE.getPedestrianLight_PedesterianLightType();

		/**
		 * The meta object literal for the '<em><b>Button Pressed Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PEDESTRIAN_LIGHT__BUTTON_PRESSED_TYPE = eINSTANCE.getPedestrianLight_Button_Pressed_Type();

		/**
		 * The meta object literal for the '<em><b>Current Ped Light</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PEDESTRIAN_LIGHT__CURRENT_PED_LIGHT = eINSTANCE.getPedestrianLight_CurrentPedLight();

		/**
		 * The meta object literal for the '<em><b>Button Pressed</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PEDESTRIAN_LIGHT___BUTTON_PRESSED = eINSTANCE.getPedestrianLight__ButtonPressed();

		/**
		 * The meta object literal for the '<em><b>Is Ped Light Green</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PEDESTRIAN_LIGHT___IS_PED_LIGHT_GREEN = eINSTANCE.getPedestrianLight__IsPedLightGreen();

		/**
		 * The meta object literal for the '<em><b>Is Ped Light Red</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PEDESTRIAN_LIGHT___IS_PED_LIGHT_RED = eINSTANCE.getPedestrianLight__IsPedLightRed();

		/**
		 * The meta object literal for the '{@link RootElement.impl.CarLightImpl <em>Car Light</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see RootElement.impl.CarLightImpl
		 * @see RootElement.impl.RootElementPackageImpl#getCarLight()
		 * @generated
		 */
		EClass CAR_LIGHT = eINSTANCE.getCarLight();

		/**
		 * The meta object literal for the '<em><b>Car Light Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CAR_LIGHT__CAR_LIGHT_TYPE = eINSTANCE.getCarLight_CarLightType();

		/**
		 * The meta object literal for the '<em><b>Current Car Light</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CAR_LIGHT__CURRENT_CAR_LIGHT = eINSTANCE.getCarLight_CurrentCarLight();

		/**
		 * The meta object literal for the '<em><b>Is Green</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CAR_LIGHT___IS_GREEN = eINSTANCE.getCarLight__IsGreen();

		/**
		 * The meta object literal for the '<em><b>Is Yellow</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CAR_LIGHT___IS_YELLOW = eINSTANCE.getCarLight__IsYellow();

		/**
		 * The meta object literal for the '<em><b>Is Red</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CAR_LIGHT___IS_RED = eINSTANCE.getCarLight__IsRed();

		/**
		 * The meta object literal for the '{@link RootElement.PedesterianLightType <em>Pedesterian Light Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see RootElement.PedesterianLightType
		 * @see RootElement.impl.RootElementPackageImpl#getPedesterianLightType()
		 * @generated
		 */
		EEnum PEDESTERIAN_LIGHT_TYPE = eINSTANCE.getPedesterianLightType();

		/**
		 * The meta object literal for the '{@link RootElement.ButtonType <em>Button Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see RootElement.ButtonType
		 * @see RootElement.impl.RootElementPackageImpl#getButtonType()
		 * @generated
		 */
		EEnum BUTTON_TYPE = eINSTANCE.getButtonType();

		/**
		 * The meta object literal for the '{@link RootElement.CarLightType <em>Car Light Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see RootElement.CarLightType
		 * @see RootElement.impl.RootElementPackageImpl#getCarLightType()
		 * @generated
		 */
		EEnum CAR_LIGHT_TYPE = eINSTANCE.getCarLightType();

	}

} //RootElementPackage
