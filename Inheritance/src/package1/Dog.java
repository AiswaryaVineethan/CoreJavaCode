package package1;

public class Dog extends Animal{
	
	Dog(){
		super();
		System.out.println("This dog is barking");
	}
	
	//void bark() {
		//System.out.println("This dog is barking");
		
		//super.sound();//To refer parent class method
		//System.out.println("number from parent class: "+ super.number);//To refer instance variable 
		
		

	public static void main(String[] args) {
		Dog myDog = new Dog();
		//myDog.bark();
		//myDog.sound();


	}

}
