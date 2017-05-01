/**
 */
package RootElement.impl;

import RootElement.ButtonType;
import RootElement.PedesterianLightType;
import RootElement.PedestrianLight;
import RootElement.RootElementPackage;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc --> An implementation of the model object
 * '<em><b>Pedestrian Light</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 * <li>{@link RootElement.impl.PedestrianLightImpl#getPedesterianLightType
 * <em>Pedesterian Light Type</em>}</li>
 * <li>{@link RootElement.impl.PedestrianLightImpl#getButton_Pressed_Type
 * <em>Button Pressed Type</em>}</li>
 * <li>{@link RootElement.impl.PedestrianLightImpl#getCurrentPedLight
 * <em>Current Ped Light</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PedestrianLightImpl extends MinimalEObjectImpl.Container implements PedestrianLight {
	/**
	 * The default value of the '{@link #getPedesterianLightType()
	 * <em>Pedesterian Light Type</em>}' attribute. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @see #getPedesterianLightType()
	 * @generated
	 * @ordered
	 */
	protected static final PedesterianLightType PEDESTERIAN_LIGHT_TYPE_EDEFAULT = PedesterianLightType.RED;

	/**
	 * The cached value of the '{@link #getPedesterianLightType()
	 * <em>Pedesterian Light Type</em>}' attribute. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @see #getPedesterianLightType()
	 * @generated
	 * @ordered
	 */
	protected PedesterianLightType pedesterianLightType = PEDESTERIAN_LIGHT_TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getButton_Pressed_Type() <em>Button
	 * Pressed Type</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @see #getButton_Pressed_Type()
	 * @generated
	 * @ordered
	 */
	protected static final ButtonType BUTTON_PRESSED_TYPE_EDEFAULT = ButtonType.BUTTON_A;

	/**
	 * The cached value of the '{@link #getButton_Pressed_Type() <em>Button
	 * Pressed Type</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @see #getButton_Pressed_Type()
	 * @generated
	 * @ordered
	 */
	protected ButtonType button_Pressed_Type = BUTTON_PRESSED_TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getCurrentPedLight() <em>Current Ped
	 * Light</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getCurrentPedLight()
	 * @generated
	 * @ordered
	 */
	protected static final PedesterianLightType CURRENT_PED_LIGHT_EDEFAULT = PedesterianLightType.RED;

	/**
	 * The cached value of the '{@link #getCurrentPedLight() <em>Current Ped
	 * Light</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getCurrentPedLight()
	 * @generated
	 * @ordered
	 */
	protected PedesterianLightType currentPedLight = CURRENT_PED_LIGHT_EDEFAULT;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected PedestrianLightImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RootElementPackage.Literals.PEDESTRIAN_LIGHT;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public PedesterianLightType getPedesterianLightType() {
		return pedesterianLightType;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setPedesterianLightType(PedesterianLightType newPedesterianLightType) {
		PedesterianLightType oldPedesterianLightType = pedesterianLightType;
		pedesterianLightType = newPedesterianLightType == null ? PEDESTERIAN_LIGHT_TYPE_EDEFAULT
				: newPedesterianLightType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					RootElementPackage.PEDESTRIAN_LIGHT__PEDESTERIAN_LIGHT_TYPE, oldPedesterianLightType,
					pedesterianLightType));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public ButtonType getButton_Pressed_Type() {
		return button_Pressed_Type;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setButton_Pressed_Type(ButtonType newButton_Pressed_Type) {
		ButtonType oldButton_Pressed_Type = button_Pressed_Type;
		button_Pressed_Type = newButton_Pressed_Type == null ? BUTTON_PRESSED_TYPE_EDEFAULT : newButton_Pressed_Type;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					RootElementPackage.PEDESTRIAN_LIGHT__BUTTON_PRESSED_TYPE, oldButton_Pressed_Type,
					button_Pressed_Type));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public PedesterianLightType getCurrentPedLight() {
		return currentPedLight;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setCurrentPedLight(PedesterianLightType newCurrentPedLight) {
		PedesterianLightType oldCurrentPedLight = currentPedLight;
		currentPedLight = newCurrentPedLight == null ? CURRENT_PED_LIGHT_EDEFAULT : newCurrentPedLight;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					RootElementPackage.PEDESTRIAN_LIGHT__CURRENT_PED_LIGHT, oldCurrentPedLight, currentPedLight));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean buttonPressed() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated not
	 */

	ControllerImpl ob = new ControllerImpl();

	public boolean isPedLightGreen() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT

		if (ob.turnPedLightGreen() == "Green") {

			return true;

		} else {

			return false;
		}

		
		// throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean isPedLightRed() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		if(ob.turnPedLightRed()== "Red")
		{
			return true;
		}
		else 
		{
			return false;
		}
		
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case RootElementPackage.PEDESTRIAN_LIGHT__PEDESTERIAN_LIGHT_TYPE:
			return getPedesterianLightType();
		case RootElementPackage.PEDESTRIAN_LIGHT__BUTTON_PRESSED_TYPE:
			return getButton_Pressed_Type();
		case RootElementPackage.PEDESTRIAN_LIGHT__CURRENT_PED_LIGHT:
			return getCurrentPedLight();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case RootElementPackage.PEDESTRIAN_LIGHT__PEDESTERIAN_LIGHT_TYPE:
			setPedesterianLightType((PedesterianLightType) newValue);
			return;
		case RootElementPackage.PEDESTRIAN_LIGHT__BUTTON_PRESSED_TYPE:
			setButton_Pressed_Type((ButtonType) newValue);
			return;
		case RootElementPackage.PEDESTRIAN_LIGHT__CURRENT_PED_LIGHT:
			setCurrentPedLight((PedesterianLightType) newValue);
			return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
		case RootElementPackage.PEDESTRIAN_LIGHT__PEDESTERIAN_LIGHT_TYPE:
			setPedesterianLightType(PEDESTERIAN_LIGHT_TYPE_EDEFAULT);
			return;
		case RootElementPackage.PEDESTRIAN_LIGHT__BUTTON_PRESSED_TYPE:
			setButton_Pressed_Type(BUTTON_PRESSED_TYPE_EDEFAULT);
			return;
		case RootElementPackage.PEDESTRIAN_LIGHT__CURRENT_PED_LIGHT:
			setCurrentPedLight(CURRENT_PED_LIGHT_EDEFAULT);
			return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case RootElementPackage.PEDESTRIAN_LIGHT__PEDESTERIAN_LIGHT_TYPE:
			return pedesterianLightType != PEDESTERIAN_LIGHT_TYPE_EDEFAULT;
		case RootElementPackage.PEDESTRIAN_LIGHT__BUTTON_PRESSED_TYPE:
			return button_Pressed_Type != BUTTON_PRESSED_TYPE_EDEFAULT;
		case RootElementPackage.PEDESTRIAN_LIGHT__CURRENT_PED_LIGHT:
			return currentPedLight != CURRENT_PED_LIGHT_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
		case RootElementPackage.PEDESTRIAN_LIGHT___BUTTON_PRESSED:
			return buttonPressed();
		case RootElementPackage.PEDESTRIAN_LIGHT___IS_PED_LIGHT_GREEN:
			return isPedLightGreen();
		case RootElementPackage.PEDESTRIAN_LIGHT___IS_PED_LIGHT_RED:
			return isPedLightRed();
		}
		return super.eInvoke(operationID, arguments);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy())
			return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (pedesterianLightType: ");
		result.append(pedesterianLightType);
		result.append(", button_Pressed_Type: ");
		result.append(button_Pressed_Type);
		result.append(", currentPedLight: ");
		result.append(currentPedLight);
		result.append(')');
		return result.toString();
	}

} // PedestrianLightImpl
