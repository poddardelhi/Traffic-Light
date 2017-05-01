/**
 */
package RootElement.tests;

import junit.framework.Test;
import junit.framework.TestSuite;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test suite for the '<em><b>RootElement</b></em>' package.
 * <!-- end-user-doc -->
 * @generated
 */
public class RootElementTests extends TestSuite {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(suite());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Test suite() {
		TestSuite suite = new RootElementTests("RootElement Tests");
		suite.addTestSuite(TimerTest.class);
		suite.addTestSuite(ControllerTest.class);
		suite.addTestSuite(PedestrianLightTest.class);
		suite.addTestSuite(CarLightTest.class);
		return suite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RootElementTests(String name) {
		super(name);
	}

} //RootElementTests
