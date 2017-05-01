/**
 */
package RootElement;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Car Light</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link RootElement.CarLight#getCarLightType <em>Car Light Type</em>}</li>
 *   <li>{@link RootElement.CarLight#getCurrentCarLight <em>Current Car Light</em>}</li>
 * </ul>
 *
 * @see RootElement.RootElementPackage#getCarLight()
 * @model
 * @generated
 */
public interface CarLight extends EObject {
	/**
	 * Returns the value of the '<em><b>Car Light Type</b></em>' attribute.
	 * The literals are from the enumeration {@link RootElement.CarLightType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Car Light Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Car Light Type</em>' attribute.
	 * @see RootElement.CarLightType
	 * @see #setCarLightType(CarLightType)
	 * @see RootElement.RootElementPackage#getCarLight_CarLightType()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	CarLightType getCarLightType();

	/**
	 * Sets the value of the '{@link RootElement.CarLight#getCarLightType <em>Car Light Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Car Light Type</em>' attribute.
	 * @see RootElement.CarLightType
	 * @see #getCarLightType()
	 * @generated
	 */
	void setCarLightType(CarLightType value);

	/**
	 * Returns the value of the '<em><b>Current Car Light</b></em>' attribute.
	 * The literals are from the enumeration {@link RootElement.CarLightType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Current Car Light</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Current Car Light</em>' attribute.
	 * @see RootElement.CarLightType
	 * @see #setCurrentCarLight(CarLightType)
	 * @see RootElement.RootElementPackage#getCarLight_CurrentCarLight()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	CarLightType getCurrentCarLight();

	/**
	 * Sets the value of the '{@link RootElement.CarLight#getCurrentCarLight <em>Current Car Light</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Current Car Light</em>' attribute.
	 * @see RootElement.CarLightType
	 * @see #getCurrentCarLight()
	 * @generated
	 */
	void setCurrentCarLight(CarLightType value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" dataType="org.eclipse.uml2.types.Boolean" required="true" ordered="false"
	 * @generated
	 */
	boolean isGreen();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" dataType="org.eclipse.uml2.types.Boolean" required="true" ordered="false"
	 * @generated
	 */
	boolean isYellow();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" dataType="org.eclipse.uml2.types.Boolean" required="true" ordered="false"
	 * @generated
	 */
	boolean isRed();

} // CarLight
