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
public class DateTimeDisplayedF1 extends DateTimeDisplayer {
	/**
	 * <!-- begin-UML-doc -->
	 * <p>return new DateObjectF1</p>
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
		DateObjectF1 dateObjectF1 = new DateObjectF1(year, month, day);

		return dateObjectF1;
		// end-user-code
	}

	/**
	 * <!-- begin-UML-doc -->
	 * <p>return new TimeObjectF1</p>
	 * <!-- end-UML-doc -->
	 * @return
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */

		// begin-user-code
		// TODO Auto-generated method stub
		public TimeObject createTimeObject() {

			Date time = new Date();
			int hours = time.getHours();
			int minutes = time.getMinutes();
			int seconds = time.getSeconds();

			TimeObjectF1 timeObjectF1 = new TimeObjectF1(hours, minutes, seconds);

			return timeObjectF1;
		// end-user-code
	}
}
