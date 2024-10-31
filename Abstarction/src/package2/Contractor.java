package package2;

import java.util.*;

public class Contractor extends Employee{

	@Override
	void calculateSalary() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter total working hours of contract Employee: ");
		int hours = sc.nextInt();
		System.out.println("Payment per hour for contract employee is 500");
		int salary = 500 * hours;
		System.out.println("Salary of contract Employee is " + salary);
		
	}

}
