// Alex Chamorro

class ExceptionEx {
  void exceptionex() {

    try {

      int w, y, z;

      System.out.println(
          "This is a demonstration of exception handeling when you try to divide 0 by 0 in java");

      System.out.println("Int w is assigned to 0");
      System.out.println("Int y is assigned to 0");

      w = 0;
      y = 0;

      System.out.println(
          "System is about to try to divide 0 by 0 and will encounter an ArithmeticException");
      z = w / y;
      System.out.println("Result = " + z);

      Intro nIntro = new Intro();
      nIntro.entertocontinue();


    } catch (Exception e) {
      System.out.println("*system catches ArithmeticException*");
      System.out
          .println("Because the ArithmeticException was caught the program did not terminate");
      Intro nIntro = new Intro();
      nIntro.entertocontinue();


    }


  }

}
