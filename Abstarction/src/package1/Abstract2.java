package package1;

public class Abstract2 extends Abstract1{

	public static void main(String[] args) {
		Abstract1 ab = new Abstract2();//upcasting
		ab.run();
		

	}

	@Override
	void run() {
		System.out.println("Running");
		
	}



}
