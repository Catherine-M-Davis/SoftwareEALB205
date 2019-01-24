/*This program will print the name of the person
 * who is running it.
 */
import java.util.Scanner;
public class Hello {//open class
	public static void main(Scanner keyboard){//opening main
		Scanner keyboard = new Scanner(System.in); 
		System.out.println("Enter your name: ");
		String name = keyboard.nextLine();
		System.out.println("You have entered your name as: "+name);
		String name1 = keyboard.nextLine();
		System.out.println("You have entered your name as: "+name1); //second contributers name
	}//closing main
}//close class
