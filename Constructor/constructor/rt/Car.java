package constructor.rt;

public class Car {

	
	    String brand;
	    int price;
	    String color;

	    public Car() {
	        brand = "Mahindra";
	        price = 1500000;
	        color = "White";

	        System.out.println("Car Details:");
	        System.out.println("Brand: " + brand);
	        System.out.println("Price: " + price);
	        System.out.println("color: " + color);
	    }

	    public void start() {
	        System.out.println("Car is starting...");
	    }

	    
	}

