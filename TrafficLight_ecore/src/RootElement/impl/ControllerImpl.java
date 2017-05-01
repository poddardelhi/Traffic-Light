/**
 */
package RootElement.impl;

import RootElement.Controller;
import RootElement.RootElementPackage;

import java.lang.reflect.InvocationTargetException;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Controller</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */


public class ControllerImpl extends MinimalEObjectImpl.Container implements Controller {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ControllerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RootElementPackage.Literals.CONTROLLER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated not
	 */
	public String turnPedLightGreen() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		
		return "Green";
		//throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String turnCarLightGreen() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		return "Green";
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void callStartClockTick() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void callResetClockTick() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String turnPedLightRed() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		 return "Red";
		//throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String turnCarLightYellow() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		
		return "Yellow";
		//throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String turnCarLightRed() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		return "Red";
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case RootElementPackage.CONTROLLER___TURN_PED_LIGHT_GREEN:
				turnPedLightGreen();
				return null;
			case RootElementPackage.CONTROLLER___TURN_CAR_LIGHT_GREEN:
				turnCarLightGreen();
				return null;
			case RootElementPackage.CONTROLLER___CALL_START_CLOCK_TICK:
				callStartClockTick();
				return null;
			case RootElementPackage.CONTROLLER___CALL_RESET_CLOCK_TICK:
				callResetClockTick();
				return null;
			case RootElementPackage.CONTROLLER___TURN_PED_LIGHT_RED:
				turnPedLightRed();
				return null;
			case RootElementPackage.CONTROLLER___TURN_CAR_LIGHT_YELLOW:
				turnCarLightYellow();
				return null;
			case RootElementPackage.CONTROLLER___TURN_CAR_LIGHT_RED:
				turnCarLightRed();
				return null;
		}
		return super.eInvoke(operationID, arguments);
	}

} //ControllerImpl
