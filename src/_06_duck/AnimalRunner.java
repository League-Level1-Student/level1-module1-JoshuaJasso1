package _06_duck;

public class AnimalRunner {

	public static void main(String[] args) {
		Duck daffy = new Duck("donuts", 5);
		daffy.quack();
		Tiger joe = new Tiger("Pizza", 10);
		joe.eat();
	}

}
