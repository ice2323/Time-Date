/**
 *
 */

/**
 * <!-- begin-UML-doc -->
 * <!-- end-UML-doc -->
 * @author mspence1
 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
 */
public class TimeObjectF1 extends TimeObject {

	public TimeObjectF1(int hours, int minutes, int seconds){

		super(hours, minutes, seconds);
	}
	/**
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public void printTime() {
		// begin-user-code
		System.out.println(this.getHours() + ":" + this.getMinutes() + ":" + this.getSeconds());
		// TODO Auto-generated method stub
		// end-user-code
	}
}
