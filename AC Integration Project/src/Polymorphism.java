// Alex Chamorro

class Polymorphism {

  public void polymorphism() {

    Food vh = new Cheese();

    vh.edible();

    vh = new Food();

    vh.edible();
    Intro intro = new Intro();
    intro.entertocontinue();
  }

}
