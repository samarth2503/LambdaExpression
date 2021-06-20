package LambdaExpression;

@FunctionalInterface
interface Cab
{
	public String bookCab(String src,String dest);
}

class Ride implements Cab
{
	
	// without Lambda Function
	public String bookCab(String src,String dest)
	{
		System.out.println("Booking Cab from "+src+" to destination "+dest);
		return "price is 5000";
	} 
}

public class Test
{
	public static void main(String[] args)
	{
		// With Lambda Expression holded by Functional Interface
		Cab c = (src,dest)->{
			System.out.println("Booking Cab from "+src+" to destination "+dest);
			return "5000";	
		};
		System.out.println("Price is "+c.bookCab("Mumbai","Pune"));
	}
}

