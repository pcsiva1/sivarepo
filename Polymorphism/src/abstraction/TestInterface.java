package abstraction;

interface Printer
{
	void print();
}

abstract class Sonyprinter implements Printer
{
	public void print()
	{
		System.out.println("Sony printer is printing");
	}
}

class HPprinter implements Printer
{
	public void print()
	{
		System.out.println("HP printer is printing");
	}
}
public class TestInterface {

	public static void main(String[] args) {
		Printer d=new HPprinter();
		d.print();

	}

}
