
public class ImpleEmployee implements EmployeeInter{
	protected String name, position;
	protected double salary;
	
	public ImpleEmployee(){
		
	}
	public ImpleEmployee(String name, String position, double salary){
		this.name = name;
		this.position = position;
		this.salary = salary;
		
	}
	
	public double calSalary(int hour, double salary){
		return hour * salary;
	}
	public void showDetail(){
		System.out.printf("%s %s %.2f", name, position, salary);
	}
	public static void main(String[] args){
		Employee employee = new Employee("Bob", "Programmer", 2500);
		employee.showDetail();
	}
}
