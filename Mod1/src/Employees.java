class Employee {
	String firstName = " ";
	String lastName = " ";
	int employeeID = 0;
	double salary;
	
	public Employee() {
		salary = 0;
	}
	
	public void setName(String fn, String ln) {
		firstName = fn;
		lastName = ln;
	}
	
	public void setID(int id) {
		employeeID = id;
	}
	
	public void setSalary(double sal) {
		salary = sal;
	}
	
	public String getName() {
		return firstName + " " + lastName;
	}
	
	public int getID() {
		return employeeID;
	}
	
	public double getSalary() {
		return salary;
	}
	
	public void employeeSummary() {
		System.out.println("--------- Employee Summary ---------");
		System.out.println("Employee Name: " + getName());
		System.out.println("Employee ID: " + getID());
		System.out.println("Employee's Salary: " + getSalary());
	}
}

class Manager extends Employee {
	String department;
	
	public void setDepartment(String dep) {
		department = dep;
	}
	
	public String getDepartment() {
		return department;
	}
	
	public void employeeSummary() {
		System.out.println("--------- Manager Summary ---------");
		System.out.println("Manager Name: " + getName());
		System.out.println("Employee ID: " + getID());
		System.out.println("Manager's Salary: " + getSalary());
		System.out.println("Department: " + getDepartment());
	}
}

public class Employees {
	public static void main(String[] args) {
		Employee em = new Employee();
		em.setName("John","Doe");
		em.setID(10458);
		em.setSalary(50000);
		em.employeeSummary();
		Manager mn = new Manager();
		mn.setName("Jerry","Seinfeld");
		mn.setID(8947);
		mn.setSalary(75000);
		mn.setDepartment("Comedy");
		mn.employeeSummary();
	}
}