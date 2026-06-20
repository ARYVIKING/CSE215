package packet;
import java.util.Scanner;

public class Main {
	public static void main(String [] args)
	{
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter an Int: ");
		int x = scanner.nextInt();
		
		/*switch(x%2) 
		{
		case 0:
			System.out.println("Even");
			break;
		case 1:
			System.out.println("Odd");
			break;
		default:
			System.out.println("Error");
		
		
		}*/
		
		
		
	}

}


/*LM2 PP1
double feb, mar, apr;
System.out.print("Enter the salary of Feb: ");
feb = scanner.nextDouble();
System.out.print("Enter the salary of Mar: ");
mar = scanner.nextDouble();
System.out.print("Enter the salary of Apr: ");
apr = scanner.nextDouble();

double x = (Math.ceil((Math.max(mar, (Math.max(apr, feb))))));

double y = (Math.min(mar, (Math.min(apr, feb))));

System.out.println(x + (y/2));
*/


/*LM2PP2
System.out.print("Enter First name: ");
String fName = scanner.nextLine();
System.out.print("Enter Last name: ");
String lName = scanner.nextLine();

System.out.println(fName.toUpperCase() + " " +lName.toLowerCase());
*/


/*LM2PP5
System.out.print("Enter your address:");
String add = scanner.nextLine();

System.out.println(add.trim());
*/
