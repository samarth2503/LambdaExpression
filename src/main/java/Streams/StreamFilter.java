/* Collection :- To represent grp of object as a single entity we use collection
 * Stream :- To process data from collection we use stream concept.
 *  To use stream
 *  1> Add collection to stream
 *  2> then only we can perform stream function
 *  3> collect the result obtained from function into list using collect method.
 *  
 * Filter :-
 */

package Streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamFilter {
	
	public static void main(String[] args)
	{
		/*ArrayList<Integer> num = new ArrayList<Integer>();
		
		num.add(10);
		num.add(15);
		num.add(20);
		num.add(25);
		num.add(30);*/
		
		// without using add method
		
		List<Integer> num = new ArrayList<Integer>(Arrays.asList(10,15,20,25,30));
		
		List<Integer> evennum = new ArrayList<Integer>();
		
		//without using stream filter even number
		
		/*for(int n:num)
		{
			if(n%2==0)
			{
				evennum.add(n);
			}
		}
		
		System.out.println(evennum);*/
		
		// To filter data using stream and store in another list
		
		evennum=num.stream().filter(n->n%2==0).collect(Collectors.toList());
		System.out.println(evennum);
		
		// To print individual value from filter
		
		num.stream().filter(n->n%2==0).collect(Collectors.toList()).forEach(n->System.out.println(n));
		
		// without using lambda
		num.stream().filter(n->n%2==0).collect(Collectors.toList()).forEach(System.out::println);
		
	}

}
