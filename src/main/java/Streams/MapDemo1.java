package Streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MapDemo1 {
	
	public static void main(String[] args)
	{
		List<String> al = Arrays.asList("bus","car","bicycle","train","flight");
		
		List<String> aluppercase = new ArrayList<String>();
		
		
		// Without using stream concept
		/*for(String a:al)
		{
			String uppercase = a.toUpperCase();
			aluppercase.add(uppercase);
		}
		
		System.out.println(aluppercase);*/
		
		// with straem
		aluppercase=al.stream().map(a->a.toUpperCase()).collect(Collectors.toList());
	
		System.out.println(aluppercase);
		
	}

}
