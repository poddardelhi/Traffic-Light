/**
 */
package RootElement;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Timer</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link RootElement.Timer#getClockTick <em>Clock Tick</em>}</li>
 * </ul>
 *
 * @see RootElement.RootElementPackage#getTimer()
 * @model
 * @generated
 */
public interface Timer extends EObject {
	/**
	 * Returns the value of the '<em><b>Clock Tick</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Clock Tick</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Clock Tick</em>' attribute.
	 * @see #setClockTick(int)
	 * @see RootElement.RootElementPackage#getTimer_ClockTick()
	 * @model default="0" dataType="org.eclipse.uml2.types.Integer" required="true" ordered="false"
	 * @generated
	 */
	int getClockTick();

	/**
	 * Sets the value of the '{@link RootElement.Timer#getClockTick <em>Clock Tick</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Clock Tick</em>' attribute.
	 * @see #getClockTick()
	 * @generated
	 */
	void setClockTick(int value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void startClockTick();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void resetClockTick();

} // Timer
