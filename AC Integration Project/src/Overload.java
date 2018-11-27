 class Overload {
	static int add(int a, int b) {
		return a + b;
	}

	static int add(int a, int b, int c) {
		return a + b + c;
	}
}

class OverloadEx {
	 void overloadex() {
		System.out.println(Overload.add(1, 2));
		System.out.println(Overload.add(1, 2, 3));
		Intro nIntro = new Intro();
		nIntro.entertocontinue();
	}
}
