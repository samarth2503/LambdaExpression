/*	Function contain abstarct method apply
 * 	Apply will return single value of any type (i.e Integer,String etc...)
 * 
 * 	Prototype of function
 * 	interface Function<T,R>						// T--- Type of argument, R--- Return type
	{
		public R apply(T);
	}
 * 
 * 
 */


package Function;

import java.util.function.Function;

public class Demo1FunctionInter {
	
	public static void main(String[] args)
	{
		//Ex-1 Square of number
		
		Function<Integer,Integer> f3 = m->m*m;
		
		System.out.println(f3.apply(10));
		System.out.println(f3.apply(5));
		System.out.println(f3.apply(7));
		
		// Ex-2  type of parameter String and return type Integer
		
		Function<String,Integer> f4 = n->n.length();
		
		System.out.println(f4.apply("Samarth"));
		System.out.println(f4.apply("Jhon"));
		
		Function<Integer,Integer> f1 = n->n*2;
		Function<Integer,Integer> f2 = n->n*n*n;
		
		System.out.println(f1.andThen(f2).apply(2));      // It will execute f1 first and then f2
		System.out.println(f1.compose(f2).apply(2));		// It will execute f2 first and then f1
		
		Function<String,String> f = name -> name.toUpperCase();
		System.out.println(f.apply("samarth"));
		
		int[] a = {1,2,3,4,5,6,7,8,9,10};
		Function<Integer,Integer> f11;
		for(int num:a)
		{
			f11 = n->num*4;
			System.out.println(num+" multiply by 4 is "+f11.apply(num));
		}
		
	}

}


