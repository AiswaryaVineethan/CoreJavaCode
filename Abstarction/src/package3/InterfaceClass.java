package package3;

public class InterfaceClass implements Interface1,Interface2 {

	public static void main(String[] args) {
		InterfaceClass c = new InterfaceClass();
		c.run();

	}

	@Override
	public void run() {
		System.out.println("Running");
		
	}

}
