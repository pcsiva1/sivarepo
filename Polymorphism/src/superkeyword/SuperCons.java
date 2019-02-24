package superkeyword;

class Bank{
	Bank()
	{
		System.out.println("I am anonymus super class");
		System.out.println("Welcome to the bank");
	}
}

class HDFC extends Bank
{
	{
		System.out.println("I am anonymous");
	}
	HDFC()
	{
		//super();
		System.out.println("Welcome to HDFC Bank");
	}
}

public class SuperCons {

	public static void main(String[] args) {

		HDFC h=new HDFC();
		

	}

}
