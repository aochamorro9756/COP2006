import java.util.stream.IntStream;

// Alex Chamorro

class ArrayEx {

  void arrayex() {

    {

      int[] a = new int[6];

      a[0] = 0;

      a[1] = 1;

      a[2] = 2;

      a[3] = 3;

      a[4] = 4;

      a[5] = 5;

      for (int i = 0; i < 6; ++i) {
        System.out.println(a[i]);
      }
      if (a == null || a.length < 1) {
        return;
      }
      int min = a[0];
      int sum = IntStream.of(a).sum();

      for (int i = 1; i <= a.length - 1; i++) {

        if (min > a[i]) {
          min = a[i];
        }

      }



      System.out.println("Minimum array value: " + min);
      System.out.println("Sum: " + sum);
      System.out.println("\n");
      Intro intro = new Intro();
      intro.entertocontinue();
    }
  }
}

