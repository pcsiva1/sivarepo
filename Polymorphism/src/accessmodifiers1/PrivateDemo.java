package accessmodifiers1;

/*class Myclass1
{
	private int data=40;
	
	private void msg()
	{
		System.out.println("We are selenium testers");
	}
}
*/
public class PrivateDemo {//we cannot make class as private
	
private int data=40;
	
	private void msg()
	{
		System.out.println("We are selenium testers");
	}

	public static void main(String[] args) {
		PrivateDemo pd=new PrivateDemo();
		System.out.println(pd.data);
		pd.msg();

	}

}
