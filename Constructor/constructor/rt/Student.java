package constructor.rt;

public class Student {

	    int id;
	    String name;
	    int age;
	    String gender;
	    String address;
	    long mobNo;
	    String email;
	    
	    
	    

	    public Student() {
	    	
	        id = 11;
	        name = "Nandini";
	        age = 21;
	        gender ="female";
	        address ="Pune";
	        mobNo= 222278222;
	        email= "abc@gmail.com";
	        
	        
	       
	        System.out.println("Student Details:...");
	        System.out.println("ID: " + id);
	        System.out.println("Age: " + age);
	        System.out.println("Gender: " + gender);
	        System.out.println("Address: " + address);
	        System.out.println("MobNo: " + mobNo);
	        System.out.println("E-mail: " + email);
	    }

	    
	}

