package package1;

public class Mammel extends Animal {
	
	void eat() {
		System.out.println("This animal is eating");
	}
	public static void main (String Args[]) {
		Mammel m1 = new Mammel();
		m1.eat();
		m1.sound();
	}
}
