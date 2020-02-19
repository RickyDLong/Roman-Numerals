//Name: Ricky Long					Date Assigned: 
//
//Course: CSCI 2003 63794			Due Date: February 20, 2020
//
//Instructor: Ms. Greer
//
//File Name: RomanNumerals.java
//
//Program Description: Asks the user for a number between 1 and 899, converts it to 
//					   roman numerals and then compares it to the user's guess to check
//					   if the user knows the roman numeral for the number he provided.



//Importing scanner to take in user data
import java.util.Scanner;



//creating class
public class RomanNumerals {
	
	
	
	//main method
	public static void main(String[] args) {
		
		
		
		//initializing input as the scanner object
		Scanner input = new Scanner(System.in);
		
		
		
		//setting variables to be used later
		int num;
		//num will be consumed in the decision structure. Making copy to hold data for print statements at the end.
		int num2;
		String answer = "";
		
		
		
		//Question and Banner displaying roman numerals
		System.out.println("Do you know the Roman Numerals?");
		System.out.println("===============================\n");
		System.out.println("+-----------------------------+");
		System.out.println("|        Roman Numerals       |");
		System.out.println("+-----------------------------+");
		System.out.println("| 1   5   10   50   100   500 |");
		System.out.println("+-----------------------------+");
		System.out.println("| I   V   X    L     C     D  |");
		System.out.println("+-----------------------------+");

		
		
		//User input asking for a numerical guess
		System.out.print("\nEnter a number (100 - 899): ");
		num = input.nextInt();
		num2 = num;
		
		
		
		//Consuming the new line (Wasn't sure how else to fix this)
		input.nextLine();
		
		
		
		//Asking user to guess the roman numeral for said number above.
		System.out.print("\nEnter the Roman Numeral of "+num+ ": ");
		answer = input.nextLine();

		

		//Initializing variable to be used in decision structure
		String result = "";

	
		
		//Decision Structures to convert integers to Roman Numerals
		if (num >= 800)
		{
			result += "DCCC";
			num -= 800;
		}
		if (num >= 700)
		{
			result += "DCC";
			num -= 700;
		}
		if (num >= 600)
		{
			result += "DC";
			num -= 600;
		}
		if (num >= 500)
		{
			result += "D";
			num -= 500;
		}
		if (num >= 400)
		{
			result += "CD";
			num -= 400;
		}
		if (num >= 300)
		{
			result += "CCC";
			num -= 300;
		}
		if (num >= 200)
		{
			result += "CC";
			num -= 200;
		}
		if (num >= 100)
		{
			result += "C";
			num -= 100;
		}
		if (num >= 90)
		{
			result += "XC";
			num -= 90;
		}
		if (num >= 80)
		{
			result += "LXXX";
			num -= 80;
		}
		if (num >= 70)
		{
			result += "LXX";
			num -= 70;
		}
		if (num >= 60)
		{
			result += "LX";
			num -= 60;
		}
		if (num >= 50)
		{
			result += "L";
			num -= 50;
		}
		if (num >= 40)
		{
			result += "XL";
			num -= 40;
		}
		if (num >= 30)
		{
			result += "XXX";
			num -= 30;
		}
		if (num >= 20)
		{
			result += "XX";
			num -= 20;
		}
		if (num >= 11)
		{
			result += "XI";
			num -= 11;
		}
		if (num >= 10)
		{
			result += "X";
			num -= 10;
		}
		if (num >= 9)
		{
			result += "IX";
			num -= 9;
		}
		if (num >= 8)
		{
			result += "VIII";
			num -= 8;
		}
		if (num >= 7)
		{
			result += "VII";
			num -= 7;
		}
		if (num >= 6)
		{
			result += "VI";
			num -= 6;
		}
		if (num >= 5)
		{
			result += "V";
			num -= 5;
		}
		if (num >= 4)
		{
			result += "IV";
			num -= 4;
		}
		if (num >= 3)
		{
			result += "III";
			num -= 3;
		}
		if (num >= 2)
		{
			result += "II";
			num -= 2;
		}
		if (num >= 1)
		{
			result += "I";
			num -= 1;
		}
		
		
		
		//Tabulates the results to see if equal or not, prints output.
		if (result.equals(answer))
		{
			System.out.print("\n* * * CORRECT * * * \n");
			System.out.println("");
			System.out.println("");
			System.out.print(num2 + " is the Roman numeral "+result);
		}
		else
			if (!result.equals(answer))
		{
				System.out.print("\n* * * INCORRECT * * * ");
				System.out.println("");
				System.out.println("");
				System.out.println("\n"+ result + " is the correct Roman Numeral.\n");
				System.out.print(num2 + " is Roman numeral "+result);
		}
	}


	

}
