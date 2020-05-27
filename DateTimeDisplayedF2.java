/**
 *
 */
import java.util.*;
/**
 * <!-- begin-UML-doc -->
 * <!-- end-UML-doc -->
 * @author mspence1
 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
 */
public class DateTimeDisplayedF2 extends DateTimeDisplayer {
	/**
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @return
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public DateObject createDateObject() {
		// begin-user-code
		// TODO Auto-generated method stub
		Calendar now = Calendar.getInstance();
    		int year = now.get(Calendar.YEAR);

    		int month = now.get(Calendar.MONTH) + 1;
    		int day = now.get(Calendar.DATE);

		DateObjectF2 dateObjectF2 = new DateObjectF2(year, month, day);

		return dateObjectF2;
		// end-user-code
	}

	/**
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @return
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public TimeObject createTimeObject() {
		// begin-user-code
		// TODO Auto-generated method stub
		Date time = new Date();
		int hours = time.getHours();
		int minutes = time.getMinutes();
		int seconds = time.getSeconds();

		TimeObjectF2 timeObjectF2 = new TimeObjectF2(hours, minutes, seconds);

		return timeObjectF2;
		// end-user-code
	}
}
