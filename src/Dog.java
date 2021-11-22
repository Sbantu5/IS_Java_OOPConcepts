
public class Dog implements Animal{
	
	String sound = "bark";
	   int age = 5;
	   
	   
	   public void getAge() {
		   
		   
		   System.out.println("Current Age is " + age);
		   
		   
	   }
	   public void getSound() {
		   
		   System.out.println("Sound is  " + sound);
	   } 
	   
	   public static void main(String[] args) {
			
			  Dog d =new Dog();
			  d.getAge();
			  d.getSound();
			  
	}
	   
	   

}
