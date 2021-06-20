/*	Joining Predicate
 * 	
 * and,or,negate
 * 	
 * 
 * 
 */
package Predicatefun;

import java.util.function.Predicate;

public class Demo2PredicateFunc {
	
	public static void main(String[] args)
	{
		int a[] = {4,7,9,11,14,15,18,37,34};
		
		Predicate<Integer> p1 = i-> i%2==0;
		Predicate<Integer> p2 = i-> i<50;
		
		// and operateor
		System.out.println("---------------AND Operator ----------------------");
		for(int k:a)
		{
			if(p1.and(p2).test(k))
			{
				System.out.println(k);
			}
		}
		
		// or operator
		System.out.println("---------------OR Operator ----------------------");
		for(int k:a)
		{
			if(p1.or(p2).test(k))
			{
				System.out.println(k);
			}
		}
		
		//negate
		System.out.println("---------------Negate Operator ----------------------");
		for(int k:a)
		{
			if(p1.and(p2).negate().test(k))
			{
				System.out.println(k);
			}
		}
		
	}
}
