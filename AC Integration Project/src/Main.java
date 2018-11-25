// Alex Chamorro ;)
// This is my integration project! Here you will find a demonstration of some of the different java programming skills I have learned so far in COP 2006

// Improvements to my project are soon to come ;)

//LIST OF DATA TYPES 
// Byte - Has a minimum value of -128 and a maximum value of 127. Using a byte can be useful for saving memory.
// Short - Has a minimum value of -32,768 and a maximum value of 32,767. Using a short can also be useful for saving memory when slightly larger numbers are needed.
// Int - Is 32-bit, and can be useful for normal (whole) numbers
// Long - Is 64-bit, and can be useful for storing a large number
// Boolean - Only has two possible values "true" or False. Using a boolean can be useful for getting true/false outputs. 
// Float - Is 32-bit, and should never be used for precise values. Floats should be used to save space when using large numbers.  
// Double - Is 64-bit, and should be used for decimal values
// Char - Is 16-bit, used for Unicode characters   
// String - Is a sequence of characters that is not able to be changed after creation 
// OTHER DEFINITIONS
// Variable - Something that can change or be assigned a value 
// Scope - Variable is only accessible from the method in which it was declared
// Final - When the keyword final is used its value can no longer be modified
// Cast - To change one data type to another 
// Operator precedence - Order in which operators are expressed (similar to common math operators) 
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		System.out.println("Enter your name please: ");
		Scanner sc = new Scanner(System.in);
		String n = sc.nextLine();
		System.out.println("Hello " + n + "!");
		sc.close();

		Mainvar nMainvar = new Mainvar();
		Castingex nCastingex = new Castingex();
		Stringex nStringex = new Stringex();
		Methodex nMethodex = new Methodex();
		// WhileLoop nWhileLoop = new WhileLoop();
		// ForLoop nForLoop = new ForLoop();
		Break nBreak = new Break();

		nMainvar.mainvar(); // Method call
		nCastingex.castingex(); // Method call
		nStringex.stringex(); // Method call
		nMethodex.getsum(); // Method call
		// nWhileLoop.whileloop(); // Method Call
		// nForLoop.forloop();
		nBreak.breakex();

	}

}