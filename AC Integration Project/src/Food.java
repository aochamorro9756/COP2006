// Alex Chamorro

class Food {

  public void edible() {
    System.out.println("People can eat food");
  }

}


class Cheese extends Food {

  public void edible() {

    System.out.println("Cheese is a food that people can eat");

  }

}


class Polymorphism {

  public void polymorphism() {

    Food vh = new Cheese();

    vh.edible(); // prints MotorBike can move and accelerate too!!

    vh = new Food();

    vh.edible(); // prints Vehicles can move!!
    Intro nIntro = new Intro();
    nIntro.entertocontinue();
  }

}
