package abstraction;

interface Messenger
{
	void sendSMS();
}
interface Whatsapp
{
	void sendSMS();
}

class Facebook implements Messenger,Whatsapp
{
	public void sendSMS()
	{
		System.out.println("I am sending SMS through Facebook");
	}
}

public class MultiInheritance {

	public static void main(String[] args) {
		Facebook f=new Facebook();
		f.sendSMS();
		

	}

}
