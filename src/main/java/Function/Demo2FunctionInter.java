package Function;

import java.util.ArrayList;
import java.util.function.Function;
import java.util.function.Predicate;

class Employee
{
	String name;
	int salary;
	
	public Employee(String n,int s)
	{
		name=n;
		salary=s;
	}
}

public class Demo2FunctionInter {
	
	public static void main(String[] args)
	{
		ArrayList<Employee> emplist = new ArrayList<Employee>();
		emplist.add(new Employee("Naveen",70000));
		emplist.add(new Employee("Peter", 40000));
		emplist.add(new Employee("Alex",30000));
		
		Function<Employee,Integer> f1 = e-> {
			
			int sal = e.salary;
			if(sal>10000 && sal<=20000)
				return (sal*10/100);
			else if(sal>20000 && sal<=30000)
				return (sal*20/100);
			else if(sal>30000 && sal<=40000)
				return (sal*30/100);
			else
				return (sal*40/100);
		};
		
		Predicate<Integer> p = n->n>10000;
		
		for(Employee e: emplist)
		{
			int bonus = f1.apply(e);
			
			if(p.test(bonus))
			{
				System.out.println(e.name+"  "+e.salary);
				System.out.println("Bonus is "+bonus);
			}
			
			
		}
	}

}
