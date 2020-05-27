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
public abstract class DateTimeDisplayer {
	/**
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @return
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public abstract DateObject createDateObject();

	/**
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @return
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public abstract TimeObject createTimeObject();

	/**
	 * <!-- begin-UML-doc -->
	 * <p>loop </p><p>ask user to choose 'd' - display date or 't' - display time or 'q' to quit loop </p>
	 <p>case 'd': create a DateObject dateObject = createDateObject(); dateObject.printDate(); break;</p><p>case 't': create a TimeObject timeObject = createTimeObject(); timeObject.printTime(); break;</p><p>case 'q': break loop</p>
	 * <!-- end-UML-doc -->
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public void doWork() {
		// begin-user-code
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);

		String selection = "";
		selection = scan.next();

		while(!selection.equals("q")){

			if(selection.equals("d")){

				DateObject dateObject = createDateObject();
				dateObject.printDate();
			}else if(selection.equals("t")){

				TimeObject timeObject = createTimeObject();
				timeObject.printTime();
			}else{
				System.out.println("Please enter a t,d or q");
			}
			selection = scan.next();
		}
		// end-user-code
	}
}
