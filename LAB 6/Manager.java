
public class Manager extends Employee{
	private String department;
	public Manager(){
		
	}
	
	public Manager(String name, String position, double salary){
		super(name, position, salary);
	}
	public void setDEpartment(String department) {
		this.department = department;
	}
	public void showDetail() {
		System.out.printf("%s %s %s %.2f", name, position,department, salary);
	}
	public static void main(String[] args) {
		Manager manager = new Manager("Bob", "Programmer", 2500);
		manager.setDEpartment("IT");
		manager.showDetail();
		
		
	}
}
