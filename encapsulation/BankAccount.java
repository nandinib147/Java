package encapsulation;

public class BankAccount {
	

	    
	    private double balance;

	  
	    public void deposit(double amount) {
	        balance = balance + amount;
	    }

	    
	    public void withdraw(double amount) {
	        if (amount <= balance) {
	            balance = balance - amount;
	        } else {
	            System.out.println("Insufficient Balance!");
	        }
	    }

	   
	    public double getBalance() {
	        return balance;
	    }
	}

	