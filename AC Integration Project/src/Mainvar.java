// Alex Chamorro

final class Mainvar { // Using final class to prevent inheritance

  void mainvar() {
    System.out.println("Below is the demonstration of the use of the four main types of variables");
    // Int - Is 32-bit, and can be useful for normal (whole) numbers
    int num = 10;
    // Boolean - Only has two possible values "true" or False. Using a boolean can be useful for
    // getting true/false outputs.
    boolean flag = true;
    // Double - Is 64-bit, and should be used for decimal values
    double dub = 10.1;
    // String - Is a sequence of characters that is not able to be changed after creation
    String example = "This is an example of a string ;) ";
    System.out.println("Boolean: " + flag);
    System.out.println("Double: " + dub);
    System.out.println("Int: " + num);
    System.out.println("String: " + example);
    Intro intro = new Intro();
    intro.entertocontinue();
  }
}
