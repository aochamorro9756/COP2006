import java.util.Scanner;

// Alex Chamorro ;)

// This is my integration project! Here you will find a demonstration of some of the different java
// programming skills I have learned so far in COP 2006

// Improvements to my project are soon to come ;)

// LIST OF DATA TYPES
// Byte - Has a minimum value of -128 and a maximum value of 127. Using a byte can be useful for
// saving memory.
// Short - Has a minimum value of -32,768 and a maximum value of 32,767. Using a short can also be
// useful for saving memory when slightly larger numbers are needed.
// Int - Is 32-bit, and can be useful for normal (whole) numbers
// Long - Is 64-bit, and can be useful for storing a large number
// Boolean - Only has two possible values "true" or False. Using a boolean can be useful for getting
// true/false outputs.
// Float - Is 32-bit, and should never be used for precise values. Floats should be used to save
// space when using large numbers.
// Double - Is 64-bit, and should be used for decimal values
// Char - Is 16-bit, used for Unicode characters
// String - Is a sequence of characters that is not able to be changed after creation
// OTHER DEFINITIONS
// Variable - Something that can change or be assigned a value
// Scope - Variable is only accessible from the method in which it was declared
// Final - When the keyword final is used its value can no longer be modified
// Cast - To change one data type to another
// Operator precedence - Order in which operators are expressed (similar to common math operators)
// Inheritance - Allows one class to inherit fields and methods from another class. Using
// inheritance allows you to reduce the amount similar code in your program.

/**
 * This is the Main class which helps the user interact with the program.
 * 
 * @author Alex Chamorro
 */
public class Main {
  /**
   * This redirects the users to the main menu.
   * 
   */
  public static void main(String[] args) {

    Main menu = new Main();
    menu.mainMenu();

  }

  /**
   * This is the main menu which allows users to easily navigate to certain parts of my program.
   */
  public void mainMenu() {

    try {
      System.out.println("Enter one of the following commands:");
      System.out.println("1 - Friendly Greeting");
      System.out.println("2 - Division of two numbers");
      System.out.println("3 - Mainvar");
      System.out.println("4 - Casting Example");
      System.out.println("5 - String Example");
      System.out.println("6 - Method Example");
      System.out.println("7 - While Loop Example");
      System.out.println("8 - For Loop Example");
      System.out.println("9 - Enhanced For Loop Example");
      System.out.println("10 - Break Example");
      System.out.println("11 - Overload Example");
      System.out.println("12 - Super Example");
      System.out.println("13 - Polymorphism Example");
      System.out.println("14 - Array Example");
      System.out.println("15 - exit");
      Scanner scanchoice = new Scanner(System.in);
      System.out.println();
      System.out.println("Enter a number to continue: ");
      int choiceentry = scanchoice.nextInt();

      while (choiceentry != 17) {

        if (choiceentry < 1 || choiceentry > 17) {

          System.out.println("Invalid input. Please Try again.");
          Intro intro = new Intro();
          intro.entertocontinue();

          choiceentry = scanchoice.nextInt();

        } else if (choiceentry == 1) {
          Intro intro = new Intro();
          intro.intro();
        } else if (choiceentry == 2) {
          ExceptionEx exceptionex = new ExceptionEx();
          exceptionex.exceptionex();
        } else if (choiceentry == 3) {
          Mainvar mainvar = new Mainvar();
          mainvar.mainvar();
        } else if (choiceentry == 4) {
          Castingex castingex = new Castingex();
          castingex.castingex();
        } else if (choiceentry == 5) {
          Stringex stringex = new Stringex();
          stringex.stringex();
        } else if (choiceentry == 6) {
          Methodex methodex = new Methodex();
          methodex.getsum();
        } else if (choiceentry == 7) {
          WhileLoop whileloop = new WhileLoop();
          whileloop.whileloop();
        } else if (choiceentry == 8) {
          ForLoop forloop = new ForLoop();
          forloop.forloop();
        } else if (choiceentry == 9) {
          Enforloop enforloop = new Enforloop();
          enforloop.enforloop();
        } else if (choiceentry == 10) {
          Break breakbreak = new Break();
          breakbreak.breakex();
        } else if (choiceentry == 11) {
          OverloadedEx overloadedex = new OverloadedEx();
          overloadedex.overloadedex();
        } else if (choiceentry == 12) {
          Bob bob = new Bob();
          bob.bob();
        } else if (choiceentry == 13) {
          Polymorphism polymorphism = new Polymorphism();
          polymorphism.polymorphism();
        } else if (choiceentry == 14) {
          ArrayEx arrayex = new ArrayEx();
          arrayex.arrayex();
        } else if (choiceentry == 15) {
          // exit
          System.exit(0);
        }
        scanchoice.close();

      }
    } catch (Exception e) {
      System.out.println("An error has occured!!");
      Intro intro = new Intro();
      intro.entertocontinue();
      throw e;
    }
  }
}
