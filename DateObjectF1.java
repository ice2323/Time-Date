/**
 *
 */

/**
 * <!-- begin-UML-doc -->
 * <!-- end-UML-doc -->
 * @author mspence1
 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
 */
public class DateObjectF1 extends DateObject {

	public DateObjectF1(int year, int month, int day){

		super(year, month, day);
	}
	/**
	 * <!-- begin-UML-doc -->
	 * <p>print date MM/DD/YYYY</p>
	 * <!-- end-UML-doc -->
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public void printDate() {
		// begin-user-code
		// TODO Auto-generated method stub
		System.out.println(this.getMonth() + "/" + this.getDay() + "/" + this.getYear());
		// end-user-code
	}

	/**
	 * <!-- begin-UML-doc -->
	 * <p>call super class constructor </p>
	 * <!-- end-UML-doc -->
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
}
