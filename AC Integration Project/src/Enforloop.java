// Alex Chamorro

class Enforloop { // Enhanced for loop
  void enforloop() {

    int[] numbers = {1, 2, 3};
    int sum = 0;

    for (int number : numbers) {
      sum += number;
    }

    System.out.println("Sum of all numbers: " + sum);
    Intro intro = new Intro();
    intro.entertocontinue();
  }
}
