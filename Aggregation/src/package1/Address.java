package package1;

public class Address {
	
	Student details;
	String place,state;
	int pin;
	
	Address (Student details, String place, String state, int pin){
		this.details = details;
		this.place = place;
		this.state = state;
		this.pin = pin;
		
	}
	
	public void print() {
		System.out.println("Name: "+ details.name);
		System.out.println("Roll No: "+ details.rollNo);
		System.out.println("Address: "+ place+", "+state+", "+ pin);
	}
	
	public static void main(String args[]) {
		
		Student s = new Student("Aiswaraya", 3);
		Address a = new Address (s, "TDPA", "Kerala", 12345);
		a.print();
		
		
	}

}
