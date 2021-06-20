/*
 *  find length of vechile name
 */

package Streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MapDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String> al = Arrays.asList("bus","car","bicycle","train","flight");
		
		// Without straem
		
		/*for(String name : al)
		{
			System.out.println(name.length());
		} */
		
		// With stream
		
		al.stream().map(a->a.length()).forEach(a->System.out.println(a));
		
		al.stream().map(a->a.length()).forEach(System.out::println);						// Alternative way

	}

}
