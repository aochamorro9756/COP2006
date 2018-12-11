// Alex Chamorro

class Polymorphism {

  public void polymorphism() {

    Food vh = new Cheese();

    vh.edible(); // prints MotorBike can move and accelerate too!!

    vh = new Food();

    vh.edible(); // prints Vehicles can move!!
    Intro intro = new Intro();
    intro.entertocontinue();
  }

}
