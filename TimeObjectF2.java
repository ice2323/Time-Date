/**
 *
 */

/**
 * <!-- begin-UML-doc -->
 * <!-- end-UML-doc -->
 * @author mspence1
 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
 */
public class TimeObjectF2 extends TimeObject {

	public TimeObjectF2(int hours, int minutes, int seconds){

		super(hours, minutes, seconds);
	}
	/**
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public void printTime() {
		// begin-user-code
		// TODO Auto-generated method stub
		System.out.println(this.getSeconds() + ":" + this.getMinutes() + ":" + this.getHours());
		// end-user-code
	}
}
