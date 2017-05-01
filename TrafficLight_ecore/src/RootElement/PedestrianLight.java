/**
 */
package RootElement;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Pedestrian Light</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link RootElement.PedestrianLight#getPedesterianLightType <em>Pedesterian Light Type</em>}</li>
 *   <li>{@link RootElement.PedestrianLight#getButton_Pressed_Type <em>Button Pressed Type</em>}</li>
 *   <li>{@link RootElement.PedestrianLight#getCurrentPedLight <em>Current Ped Light</em>}</li>
 * </ul>
 *
 * @see RootElement.RootElementPackage#getPedestrianLight()
 * @model
 * @generated
 */
public interface PedestrianLight extends EObject {
	/**
	 * Returns the value of the '<em><b>Pedesterian Light Type</b></em>' attribute.
	 * The literals are from the enumeration {@link RootElement.PedesterianLightType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pedesterian Light Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pedesterian Light Type</em>' attribute.
	 * @see RootElement.PedesterianLightType
	 * @see #setPedesterianLightType(PedesterianLightType)
	 * @see RootElement.RootElementPackage#getPedestrianLight_PedesterianLightType()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	PedesterianLightType getPedesterianLightType();

	/**
	 * Sets the value of the '{@link RootElement.PedestrianLight#getPedesterianLightType <em>Pedesterian Light Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pedesterian Light Type</em>' attribute.
	 * @see RootElement.PedesterianLightType
	 * @see #getPedesterianLightType()
	 * @generated
	 */
	void setPedesterianLightType(PedesterianLightType value);

	/**
	 * Returns the value of the '<em><b>Button Pressed Type</b></em>' attribute.
	 * The literals are from the enumeration {@link RootElement.ButtonType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Button Pressed Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Button Pressed Type</em>' attribute.
	 * @see RootElement.ButtonType
	 * @see #setButton_Pressed_Type(ButtonType)
	 * @see RootElement.RootElementPackage#getPedestrianLight_Button_Pressed_Type()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	ButtonType getButton_Pressed_Type();

	/**
	 * Sets the value of the '{@link RootElement.PedestrianLight#getButton_Pressed_Type <em>Button Pressed Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Button Pressed Type</em>' attribute.
	 * @see RootElement.ButtonType
	 * @see #getButton_Pressed_Type()
	 * @generated
	 */
	void setButton_Pressed_Type(ButtonType value);

	/**
	 * Returns the value of the '<em><b>Current Ped Light</b></em>' attribute.
	 * The literals are from the enumeration {@link RootElement.PedesterianLightType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Current Ped Light</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Current Ped Light</em>' attribute.
	 * @see RootElement.PedesterianLightType
	 * @see #setCurrentPedLight(PedesterianLightType)
	 * @see RootElement.RootElementPackage#getPedestrianLight_CurrentPedLight()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	PedesterianLightType getCurrentPedLight();

	/**
	 * Sets the value of the '{@link RootElement.PedestrianLight#getCurrentPedLight <em>Current Ped Light</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Current Ped Light</em>' attribute.
	 * @see RootElement.PedesterianLightType
	 * @see #getCurrentPedLight()
	 * @generated
	 */
	void setCurrentPedLight(PedesterianLightType value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="org.eclipse.uml2.types.Boolean" required="true" ordered="false"
	 * @generated
	 */
	boolean buttonPressed();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" dataType="org.eclipse.uml2.types.Boolean" required="true" ordered="false"
	 * @generated
	 */
	boolean isPedLightGreen();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" dataType="org.eclipse.uml2.types.Boolean" required="true" ordered="false"
	 * @generated
	 */
	boolean isPedLightRed();

} // PedestrianLight
