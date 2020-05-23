package _06_duck;

public class Tiger {

	public static void main(String[] args) {
		
	}
	int numberOfFriends;
	String favoriteFood;
	
	Tiger(String favoriteFood, int numberOfFriends) {
		this.favoriteFood = favoriteFood;
		this.numberOfFriends = numberOfFriends;
	}
	
	void kill() {
		System.out.println("Kill");
	}
	void eat() {
		System.out.println("Eat");
	}
}
