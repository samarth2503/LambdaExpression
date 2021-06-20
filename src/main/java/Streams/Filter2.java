package Streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Filter2 {

	
	public static void main(String[] args)
	{
		List<String> names = new ArrayList<String>(Arrays.asList("Samarth","Jospeh","Miacheal","Tendulkar","Jhonson"));
		
		List<String> result = new ArrayList<String>();
		
		//using collect method
		result=names.stream().filter(n->n.length()>6 && n.length()<8).collect(Collectors.toList());
		System.out.println(result);
		
		// using foreach method
		names.stream().filter(n->n.length()>6 && n.length()<8).forEach(n->System.out.println(n));
		
		names.stream().filter(n->n.length()>6 && n.length()<8).forEach(System.out::println);
		
	}
}
