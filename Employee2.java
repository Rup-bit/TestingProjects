package classes.obj;

public class Employee2 {
	
	
	String name;
	int empid;
	double salary;
	
	
	public static void main(String[] args) {
		
	         Employee2 e=new Employee2();
				e.name="Ram";
				e.empid=101;
				e.salary=50000;
				
				System.out.println("Name= "+e.name);
				System.out.println("EmpId= "+e.empid);
				System.out.println("Salary= "+e.salary);
				
				Employee2 e1=new Employee2();
				e1.name="Shyam";
				e1.empid=102;
				e1.salary=60000;
				
				System.out.println("Name= "+e1.name);
				System.out.println("EmpId= "+e1.empid);
				System.out.println("Salary= "+e1.salary);
				
	}

}
