// disticnt(), limit(), count()

/*
 *  Non terminal Procesing method :- distinct(),limit(),flatMap(), map(), filter()
 *  Terminal Processing method :- count, limit, foreach, min, max, reduce, toArray
 */

package StraemMethod;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Demo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String> vehiclelist = Arrays.asList("bus","car","bicycle","bus","car","bike");
		
		List<String> vechile = vehiclelist.stream().distinct().collect(Collectors.toList());
		
		System.out.println(vechile);
		
		// to print Object
		vehiclelist.stream().distinct().forEach(v->System.out.println(v));
		
		//count
		long count = vehiclelist.stream().count();
		System.out.println(count);
		
		// limit()
		List<String> limitedObj = vehiclelist.stream().limit(4).collect(Collectors.toList());
		System.out.println(limitedObj);
		
		vehiclelist.stream().limit(3).forEach(v->System.out.println(v));
	}
	
	

}
