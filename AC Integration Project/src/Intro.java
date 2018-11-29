// Alex Chamorro

import java.util.Scanner;

class Intro {
  static final Scanner sc = new Scanner(System.in);

  void intro() {
    try {
      System.out.println("Enter your name please: ");
      String n = sc.nextLine();
      System.out.println("Hello " + n + "!");

      Intro nIntro = new Intro();
      nIntro.entertocontinue();
    } catch (Exception e) {
      System.out.println("Error!");
    }
  }

  public void entertocontinue() {
    final Scanner sc2 = new Scanner(System.in);
    System.out.println("Enter any value then press enter to return to the main menu");
    if (sc2.hasNextLine()) {

    }
    sc2.next();
    Main nMenu = new Main();
    nMenu.mainMenu();
    sc2.close();

  }

}
