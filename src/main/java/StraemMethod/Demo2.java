package StraemMethod;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Demo2 {

	public static void main(String[] args) {
		
		// count & filter
		
		List<Integer> numberlist = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
		long evennumber = numberlist.stream().filter(n->n%2==0).count();
		System.out.println(evennumber);
		
		// min()
		Optional<Integer> min = numberlist.stream().min((val1,val2)->{return val1.compareTo(val2);});
		System.out.println(min.get());
		
		//max()
		Optional<Integer> max = numberlist.stream().max((val1,val2)->{return val1.compareTo(val2);});
		System.out.println(max.get());
		
		// reduce()
		List<String> stringlist = Arrays.asList("A","B","C","1","2","3");
		Optional<String> reduced = stringlist.stream().reduce((value,combinedvalue)-> {return combinedvalue+value;});
		System.out.println(reduced.get());
		
		// toArray
		List<String> list1 = Arrays.asList("A","B","C","1","2","4");
		Object[] obj = (Object[]) list1.stream().toArray();
		
		for(Object o : obj)
		{
			System.out.println(o);
		}
	}

}
