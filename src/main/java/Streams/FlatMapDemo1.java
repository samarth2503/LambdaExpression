/*
 * Map returns a single value
 * FlatMap return stream of Object.
 * 
 */

package Streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FlatMapDemo1 {

	public static void main(String[] args) {
		
		//Map
		List<Integer> list1 = Arrays.asList(1,2,3,4,5,6);
		
		List<Integer> list2=list1.stream().map(n->n+10).collect(Collectors.toList());
		
		System.out.println(list2);
		
		
		//FlatMap()
		List<Integer> list3 = Arrays.asList(2,4,5,8,10,12);
		List<Integer> list4 = Arrays.asList(3,4,5,6,7,8);
		List<Integer> list5 = Arrays.asList(10,11,12,13,14,15);
		
		List<List<Integer>> finalist = Arrays.asList(list3,list4,list5);
		
		System.out.println(finalist);
		
		List<Integer> result = finalist.stream().flatMap(x->x.stream().map(n->n+10)).collect(Collectors.toList());
		System.out.println(result);
	}

}
