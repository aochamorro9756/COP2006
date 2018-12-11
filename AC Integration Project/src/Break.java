// Alex Chamorro
class Break {
  void breakex() {

    for (int i = 1; i <= 100; i++) {
      if (i == 50) {
        break;
      }
      System.out.println(i); // Prints numbers 1-100 but then stops when i==50
      Intro intro = new Intro();
      intro.entertocontinue();
    }
  }
}
