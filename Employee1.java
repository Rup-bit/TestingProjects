package classes.obj;

public class Employee1 {
	
	String name;
	int emp_id;
	static String company="Smart Programming";
	
	Employee1(String name, int emp_id)
	{

	this.name=name;
	this.emp_id=emp_id;
	
	}
	void display() {
		
		System.out.println("Employee:" +name+","+emp_id+","+company);
	}
	
	public static void main(String[] args) {
		
		Employee1 s1=new Employee1("Amit",101);
		s1.display();
		Employee1 s2=new Employee1("Neha",102);
		s2.display();
		
			
	}
}
	
	
	
	
	
	