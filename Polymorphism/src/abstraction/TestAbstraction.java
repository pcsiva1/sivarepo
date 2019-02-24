package abstraction;

abstract class Vehicle
{
	abstract void drive();
}

abstract class Maruthi extends Vehicle
{
	void drive()
	{
		System.out.println("I am driving Maruthi Suzuki");
	}
	
	abstract void horn();
	
}
class Toyota extends Vehicle
{
	void drive()
	{
		System.out.println("I am driving Toyota");
	}
}


public class TestAbstraction {

	public static void main(String[] args) {
		Vehicle s=new Toyota();
		s.drive();
		Maruthi m=new Maruthi();//cannot create object of inherited abstract class
		
		
		//Vehicle v=new Vehicle();//Cannot create a object of abstract class 
		
	}

}
