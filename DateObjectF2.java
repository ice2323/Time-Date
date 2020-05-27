/**
 *
 */

/**
 * <!-- begin-UML-doc -->
 * <!-- end-UML-doc -->
 * @author mspence1
 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
 */
public class DateObjectF2 extends DateObject {

	public DateObjectF2(int year, int month, int day){

		super(year, month, day);
	}
	/**
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public void printDate() {
		// begin-user-code
		// TODO Auto-generated method stub
		System.out.println(this.getDay() + "/" + this.getMonth() + "/" + this.getYear());
		// end-user-code
	}
}
