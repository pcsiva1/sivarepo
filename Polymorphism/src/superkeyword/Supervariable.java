package superkeyword;

class Fruits
{
	String taste="Sweet";//parent class instance variable
	
	void Mycolour()//parent class method
	{
		System.out.println("My colour is");
	}

}

class Orange extends Fruits
{
	String taste="Sour";


void checkTaste()
{
	System.out.println(taste);
	System.out.println(super.taste);//super keyword is used to call the immediate parent class instance variable
}


void Mycolour()
{

	System.out.println("My colour is orange");
	super.Mycolour();//super keyword is also used to call the parent class method
}}
public class Supervariable {

	public static void main(String[] args) {
		Orange o=new Orange();
		o.Mycolour();

		

	}

}
