package Streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MapDemo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer> numberlist = Arrays.asList(2,3,4,5,6);
		List<Integer> result = new ArrayList<Integer>();
		//without usig stream
		
		/*for(int num:numberlist)
		{
			result.add(num*3);
		}*/
		
		// with Starem
		
		numberlist.stream().map(num->num*3).forEach(num->System.out.println(num));
		
		numberlist.stream().map(num->num*3).forEach(System.out::println);
		
		result=numberlist.stream().map(num->num*3).collect(Collectors.toList());
		
		System.out.println(result);

	}

}
