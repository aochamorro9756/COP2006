// Alex Chamorro

class Stringex {

  void stringex() {
    String str1 = "IS WATER WET?"; // Original
    String conv1 = str1.toLowerCase(); // Converts all uppercase letters to lowercase
    String conv2 = str1.substring(9, 13); // Snips a selected portion of the string and outputs it
    String conv3 = str1.replace("WET", "A DRINK"); // Replaces selected with statement of choice 


    String esc = "This is an example \nof an escape sequence."; //\n new line and is escape sequence




    System.out.println("Orignal Statement: " + str1);
    System.out.println("toLowerCase Statement: " + conv1);
    System.out.println("substring Statement: " + conv2);
    System.out.println("replace Statement: " + conv3);
    System.out.println(esc);
    Intro intro = new Intro();
    intro.entertocontinue();
  }
}
