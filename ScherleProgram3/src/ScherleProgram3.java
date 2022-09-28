// Application:		Program 3
// Name:			Cody Scherle
// GitHub User:		CodyScherle
// Date:			Sep 27, 2022
// Version:			1.0
// Description		Loops and stuff 
import java.util.Scanner;
public class ScherleProgram3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner keyboard = new Scanner(System.in);
		// Ask for the users name
		System.out.println("Hello, What is your name?");
		String name = keyboard.next();
		System.out.println("Hello " + name + ", pick a number in the range of 0 - 100");
		// Making sure that the user's number is valid
		int number = keyboard.nextInt();
		while (number<0||number>100)
		{
			System.out.println("That number is invalid");
			System.out.println("Pick a number that is in the range of 0 - 100"); 
		number = keyboard.nextInt();
		}
		System.out.println("Thank you for your number " + name);
		// Counting the user's number down to 0
		System.out.println("Your number is counting down");
		for (int i = number; i >= 0; i--)
			{
		System.out.println( i );
		}
		System.out.println("Thank you for playing " + name + " :)");
	}
}