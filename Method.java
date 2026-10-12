package day1;

public class Method 
{
	
	void Add(int a , int b)
	{
		System.out.println(a*b);
	}
	
	public static void pro()
	{
		System.out.println(3*4);
	}

	public static void main(String[] args)
	{
		Method obj = new Method();
		obj.Add(2,3);
		pro();
		

	}

}