


public class Mobile implements IMobile{
	

	
	boolean isItOn = false;


	  public void turnOn() {

	    isItOn = true;

	  }


	  public void turnOff() {

	    isItOn = false;

	  }

	  public void printState() {
		  if(isItOn == true)
		  
		  {
			  System.out.println("Mobile is On");
		  }else{

	    System.out.println("Mobile is Off");
		  }
	    
	  }
	  public static void main(String[] args) {
			
		Mobile mob =new Mobile();
		mob.turnOn();
        mob.printState();
        mob.turnOff();
        mob.printState();
		
	}
	  
}
