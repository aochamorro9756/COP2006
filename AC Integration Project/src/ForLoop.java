// Alex Chamorro

class ForLoop {
  void forloop() {
    for (int i = 5; i > 1; i--) {
      System.out.println(+i);
      Intro nIntro = new Intro();
      nIntro.entertocontinue();// Similar to my while loop but formatted to be used in a for loop
    }
  }
}


class EnForLoop { // Enhanced for loop
  void enforloop() {

    int[] numbers = {1, 2, 3};
    int sum = 0;

    for (int number : numbers) {
      sum += number;
    }

    System.out.println("Sum of all numbers: " + sum);
    Intro nIntro = new Intro();
    nIntro.entertocontinue();
  }
}
