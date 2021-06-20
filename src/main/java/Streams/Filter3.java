package Streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;



public class Filter3 {
	
	public static void main(String[] args)
	{
		List<String> word = Arrays.asList("cup",null,"forest","sky","book",null,"theater");
		
		List<String> result= word.stream().filter(w->w!=null).collect(Collectors.toList());
		System.out.println(result);
	}

}
