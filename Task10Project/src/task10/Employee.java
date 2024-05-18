package task10;

public class Employee {
	private int id;
	private String firstName;
	private String lastName;
	private int salary;
	private String Name=firstName+lastName;
	public Employee(int id,String firstName,String lastName,int salary) {
		this.id=id;
		this.firstName=firstName;
		this.lastName=lastName;
		this.salary=salary;
		
	}
	
	public int getid() {
		return id;
	}
	public String getfirstName() {
		return firstName;
	}
	public String getlastName() {
		return lastName;
	}
	public int getsalary() {
		return salary;
	}
	public String getName(String firstName,String lastName) {
		String Name= firstName+lastName;
		return Name;
		
	}
	public void setsalary(int salary) {
		
		System.out.println("The salary is:"+ salary);
	}
	public int getAnnualSalary(int salary) {
		int Annualsalary = salary*12;
		return Annualsalary;
	}
public int raisesalary(int salary) {
	int salary1= (int) (0.2*salary+salary);
	System.out.println(salary1);
	salary=salary1;
	System.out.println("The salary of employee is:"+ salary);
	return salary;
	
}
	public static void main(String[] args) {
		Employee emp= new Employee(01,"sowmya","ravva",10000);
		emp.raisesalary(10000);
		
		

	}

}
