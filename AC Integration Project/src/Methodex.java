// Alex Chamorro

import java.util.Random;

 class Methodex {
 // Line #5 is a header a parameter is contained inside the () on line #5
  int getmin(int num1, int num2) {
  int result;
  if (num1 < num2)
   result = num1;
  else
   result = num2;
  return result;
  
 }



  void getsum() {
  Random rand = new Random();
  int num3 = 2;

  int num4 = rand.nextInt(50) + 1;
  int num5 = 0;
  num5 += 5.4;
  int sum = (int)(num3 + Math.sqrt(num4)); //Argument 
  System.out.println("Example of random & math class & other requirements: " + (sum++ + sum-- + num5 + (num4 % num5)) / (sum * num5 - (num5)));
  Intro nIntro = new Intro();
	nIntro.entertocontinue();

 }

  void getdrink(String[] args) {

  int drink = 2;
  String drinkString;
  switch (drink) {
   case 1:
    drinkString = "Soda";
    break;
   case 2:
    drinkString = "Water";
    break;
   default:
    drinkString = "Invalid case";
    break;
  }
  System.out.println("Switch example: " + drinkString);
  Intro nIntro = new Intro();
	nIntro.entertocontinue();
 }

  void compare(String args[]) {
  String s1 = "I like to drink water";
  String s2 = "I do not like to drink water";


  int var1 = s1.compareTo(s2);
  System.out.println("s1 & s2 comparison: " + var1); // == is the Java equivalent to an equals sign. It is used to see if two objects are equal. 
  Intro nIntro = new Intro();
	nIntro.entertocontinue();


 }
}