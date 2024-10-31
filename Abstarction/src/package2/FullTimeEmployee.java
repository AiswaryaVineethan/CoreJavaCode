package package2;

public class FullTimeEmployee extends Employee {

	public static void main(String[] args) {
		Employee e2 = new FullTimeEmployee();
		e2.calculateSalary();
		Employee e1 = new Contractor();
		e1.calculateSalary();

	}

	@Override
	void calculateSalary() {
		System.out.println("Salary per hour for fulltime employee is 600");
		int salary = 600*8;
		System.out.println("The salary of fulltime employee is "+ salary);
		
	}

}
