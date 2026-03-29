package encapsulation;

public class Main {
	
	
	    public static void main(String[] args) {

	        Person p = new Person();

	        p.setName("Nandini");
	        p.setAge(22);

	        System.out.println("Name = " + p.getName());
	        System.out.println("Age = " + p.getAge());
	        
	        

	        BankAccount b = new BankAccount();
	        
	        

	        b.deposit(5000);
	        b.withdraw(2000);

	        System.out.println("Remaining Balance = " + b.getBalance());
	    }
	    
	
	          
	   
	           
		    
		

	}

	


