package methodoverloading;//Changing no.of arguments
class adder1{
	
	/*int add(int a, int b )
	{
		return a+b;
	
	}
	
	int add(int a,int b, int c)
	{
		return a+b+c;
	}			*/


	int add(int d,int e)
	{ 
		return d+e;
	}
	
	static double add(int f, double g)
	{
		return f+g;
	}

}
	
public class Adder {

	public static void main(String[] args) {

		{
			//adder1 a=new adder1();
			
			//a.add(11, 11);
			//a.add(11, 11, 11);
		//System.out.println(a.add(11, 11));
		//System.out.println(a.add(11,11,11));
		//System.out.println(adder1.add(2.5, 2.5));
		System.out.println(adder1.add(5, 5.5));
		}
		

	}

}
