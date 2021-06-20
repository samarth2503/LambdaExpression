/*	Consumer cosume value but it doesnt return anything
 * 	It has one abstrct method accept.
 */

package Predicatefun;

import java.util.ArrayList;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

class Banker
{
	String name;
	int salary;
	String gender;
	
	public Banker(String n,int sal,String g)
	{
		name=n;
		salary=sal;
		gender=g;
	}
}

public class Consumer1 {
	
	public static void main(String[] args)
	{
		ArrayList<Banker> al = new ArrayList<Banker>();
		
		al.add(new Banker("Samarth",20000,"Male"));
		al.add(new Banker("Mary",30000,"Female"));
		al.add(new Banker("Jhon",40000,"Male"));
		al.add(new Banker("Alex",50000,"Male"));
		
		Function<Banker,Integer> f1 = e-> (e.salary*10)/100;
		
		Predicate<Integer> p = n-> (n>=5000);
		
		Consumer <Banker> c = emp->{
			
			System.out.println("Name is "+emp.name);
			System.out.println("Salary is "+emp.salary);
			System.out.println("Gender is "+emp.gender);
		};
		
		for(Banker bk : al)
		{
			int bonus=f1.apply(bk);
			
			if(p.test(bonus))
			{
				c.accept(bk);
				System.out.println("Bonus is "+bonus);
			}
		}
	}

}
