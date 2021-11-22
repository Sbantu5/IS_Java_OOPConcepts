
public class Car implements ICar {
	
	int speed = 500;
	int gear=1;

	public int getSpeed() {
		return speed;
	}
	
	public  void changeGear() {
		gear=2;  
	  }
	 public  void getGear() {
		  
		  System.out.println("Current gear is "+gear);
	
		  
	  }
	  
	  public static void main(String[] args) {
			
		  Car c =new Car();
		  int speed = c.getSpeed();
		  
		  System.out.println("Speed is "+ speed);
		  
		  
		  c.getGear();
		  c.changeGear();
		  c.getGear();
		  
}
	  
}

