package constructor.rt;

public class Employee {

	
	    int empId;
	    String name;
	    double salary;

	    public Employee() {
	    	empId = 101;
	    	name = "Nandini";
	        salary = 60000;

	        System.out.println("Employee Details:");
	        System.out.println("ID: " + empId);
	        System.out.println("Name: " + name);
	        System.out.println("Salary: " + salary);
	        
	    }

	    public void checkSalary() {
	        if(salary > 50000)
	            System.out.println("Best Salary....");
	        else
	            System.out.println("Good Salary.....");
	    }

	    
	}

