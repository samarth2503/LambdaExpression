/*	####################Pre define Function Interface ##########################
 * 
 * 1> Predicate (contains test method as abstarct method)
 * 		--- should be used only when we have one parmeter and we need to do conditional check and return boolean value
 * 	2> Function
 * 	3> Supplier
 * 	4> Consumer
 * 
 */
package Predicatefun;

import java.util.function.Predicate;

public class Demo1PredicateFunc {
	
	public static void main(String[] args)
	{
		// Ex-1 Check if number is greter then 10 or not
		
		Predicate<Integer> p = i -> (i>10); 
	
		System.out.println(p.test(20));
		System.out.println(p.test(5));
		
		
		// Ex-2 check the length of string greater than 4 or not
		Predicate<String> p1 = s -> {return (s.length()>4);}; 
		
		System.out.println(p1.test("Samarth"));
		System.out.println(p1.test("Sam"));
		
		
		// Ex-3 Predicate using loop statement and multiple values
		String[] names = {"Samarth","Jhons","Tom","Jay","Alexp"};
		
		for(String n : names)
		{
			if(p1.test(n))
			{
				System.out.println(n);
			}
			
		}
		
		// Ex-4 
		
		Predicate<Integer> p4 = str->{return str>10;};
		System.out.println(p4.test(11));
		
	}

}
