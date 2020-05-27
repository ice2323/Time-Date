import java.util.*;

/**
 *
 */
/**
 * <!-- begin-UML-doc -->
 * <!-- end-UML-doc -->
 * @author mspence1
 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
 */
public class MainApp {
	/**
	 * <!-- begin-UML-doc -->
	 * <p>DateTimeDisplayer displayer;</p><p>ask the user to choose 1- format 1 or 2- format 2 </p><p>case 1: displayer = new DateTimeDisplayerF1(); break;</p><p>case 2: displayer = new DateTimeDisplayerF2(); break;</p><p>displayer.doWork();</p>
	 * <!-- end-UML-doc -->
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public static void main(String[] args) {
		// begin-user-code
		// TODO Auto-generated method stub

		DateTimeDisplayer displayer;

		Scanner scan = new Scanner(System.in);

		System.out.println("Which format would you like?");
		System.out.println("Format 1:");
		System.out.println("MM/DD/YYYY");
		System.out.println("HH:MM:SS");
		System.out.println("Format 2:");
		System.out.println("DD-MM-YYYY");
		System.out.println("SS,MM,HH");

		int userChoice;

		userChoice = scan.nextInt();

		if(userChoice == 1){

			displayer = new DateTimeDisplayedF1();
			displayer.doWork();
		}
		if(userChoice == 2){

			displayer = new DateTimeDisplayedF2();
			displayer.doWork();
		}
		// end-user-code
	}
}
