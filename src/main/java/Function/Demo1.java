package Function;

import java.util.function.Function;

public class Demo1 {
	
	public static void main(String[] args)
	{
		//Ex-1
		
		Function<Integer,Integer> f = n -> n*n;
		System.out.println(f.apply(10));
		System.out.println(f.apply(5));
		System.out.println(f.apply(6));
		
		//Ex-2
		
		Function<String,Integer> f1 = n -> (n.length());
		System.out.println(f1.apply("Jhon"));
		System.out.println(f1.apply("Samarth"));
	}

}
