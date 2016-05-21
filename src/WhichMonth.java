import java.util.*;

/**
 *   File Name: WhichMonth.java<br>
 *
 *   Venkatraman, Arunkumar<br>
 *   Java Boot Camp Exercise<br>
 *   Instructor: Jean-francois Nepton<br>
 *   Created: May 21, 2016
 *   
 */

/**
 * WhichMonth //ADDD (description of class)
 * <p>
 * //ADDD (description of core fields)
 * <p>
 * //ADDD (description of core methods)
 * 
 * @author Venkatraman, Arunkumar
 * @version 1.0.0
 * @since 1.0
 *
 */
public class WhichMonth {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Create Scanner object
		Scanner scanner = new Scanner(System.in);
		// String variable to hold user input string
		String inpStr;
		// Ask the user input
		System.out.print("Please enter the number of the month be verified: ");
		inpStr = scanner.nextLine();
		// Store the user's input inside the integer variable
		int monthString = Integer.parseInt(inpStr);

		switch (monthString) {
		case 1:
			System.out.println("Its January");
			break;
		case 2:
			System.out.println("Its February");
			break;
		case 3:
			System.out.println("Its March");
			break;
		case 4:
			System.out.println("Its April");
			break;
		case 5:
			System.out.println("Its May");
			break;
		case 6:
			System.out.println("Its June");
			break;
		case 7:
			System.out.println("Its July");
			break;
		case 8:
			System.out.println("Its August");
			break;
		case 9:
			System.out.println("Its September");
			break;
		case 10:
			System.out.println("Its October");
			break;
		case 11:
			System.out.println("Its November");
			break;
		case 12:
			System.out.println("Its December");
			break;
		default:
			System.out.println("Invalid month");
			break;
		}
	}
}