/**
 */
package RootElement.impl;

import RootElement.CarLight;
import RootElement.CarLightType;
import RootElement.RootElementPackage;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Car Light</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link RootElement.impl.CarLightImpl#getCarLightType <em>Car Light Type</em>}</li>
 *   <li>{@link RootElement.impl.CarLightImpl#getCurrentCarLight <em>Current Car Light</em>}</li>
 * </ul>
 *
 * @generated
 */

public class CarLightImpl extends MinimalEObjectImpl.Container implements CarLight {
	/**
	 * The default value of the '{@link #getCarLightType() <em>Car Light Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCarLightType()
	 * @generated
	 * @ordered
	 */
	ControllerImpl ob = new ControllerImpl();
	protected static final CarLightType CAR_LIGHT_TYPE_EDEFAULT = CarLightType.GREEN;

	/**
	 * The cached value of the '{@link #getCarLightType() <em>Car Light Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCarLightType()
	 * @generated
	 * @ordered
	 */
	protected CarLightType carLightType = CAR_LIGHT_TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getCurrentCarLight() <em>Current Car Light</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCurrentCarLight()
	 * @generated
	 * @ordered
	 */
	protected static final CarLightType CURRENT_CAR_LIGHT_EDEFAULT = CarLightType.GREEN;

	/**
	 * The cached value of the '{@link #getCurrentCarLight() <em>Current Car Light</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCurrentCarLight()
	 * @generated
	 * @ordered
	 */
	protected CarLightType currentCarLight = CURRENT_CAR_LIGHT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CarLightImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RootElementPackage.Literals.CAR_LIGHT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CarLightType getCarLightType() {
		return carLightType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCarLightType(CarLightType newCarLightType) {
		CarLightType oldCarLightType = carLightType;
		carLightType = newCarLightType == null ? CAR_LIGHT_TYPE_EDEFAULT : newCarLightType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RootElementPackage.CAR_LIGHT__CAR_LIGHT_TYPE, oldCarLightType, carLightType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CarLightType getCurrentCarLight() {
		return currentCarLight;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCurrentCarLight(CarLightType newCurrentCarLight) {
		CarLightType oldCurrentCarLight = currentCarLight;
		currentCarLight = newCurrentCarLight == null ? CURRENT_CAR_LIGHT_EDEFAULT : newCurrentCarLight;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RootElementPackage.CAR_LIGHT__CURRENT_CAR_LIGHT, oldCurrentCarLight, currentCarLight));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isGreen() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isYellow() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		
		ControllerImpl ob = new ControllerImpl();
		if (ob.turnCarLightYellow() == "Yellow") {
			return true;
		} else {
			return false;
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isRed() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		if (ob.turnCarLightRed() == "Red") {
			return true;
		} else {
			return false;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case RootElementPackage.CAR_LIGHT__CAR_LIGHT_TYPE:
				return getCarLightType();
			case RootElementPackage.CAR_LIGHT__CURRENT_CAR_LIGHT:
				return getCurrentCarLight();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case RootElementPackage.CAR_LIGHT__CAR_LIGHT_TYPE:
				setCarLightType((CarLightType)newValue);
				return;
			case RootElementPackage.CAR_LIGHT__CURRENT_CAR_LIGHT:
				setCurrentCarLight((CarLightType)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case RootElementPackage.CAR_LIGHT__CAR_LIGHT_TYPE:
				setCarLightType(CAR_LIGHT_TYPE_EDEFAULT);
				return;
			case RootElementPackage.CAR_LIGHT__CURRENT_CAR_LIGHT:
				setCurrentCarLight(CURRENT_CAR_LIGHT_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case RootElementPackage.CAR_LIGHT__CAR_LIGHT_TYPE:
				return carLightType != CAR_LIGHT_TYPE_EDEFAULT;
			case RootElementPackage.CAR_LIGHT__CURRENT_CAR_LIGHT:
				return currentCarLight != CURRENT_CAR_LIGHT_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case RootElementPackage.CAR_LIGHT___IS_GREEN:
				return isGreen();
			case RootElementPackage.CAR_LIGHT___IS_YELLOW:
				return isYellow();
			case RootElementPackage.CAR_LIGHT___IS_RED:
				return isRed();
		}
		return super.eInvoke(operationID, arguments);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (carLightType: ");
		result.append(carLightType);
		result.append(", currentCarLight: ");
		result.append(currentCarLight);
		result.append(')');
		return result.toString();
	}

} //CarLightImpl
