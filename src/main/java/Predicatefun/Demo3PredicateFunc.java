package Predicatefun;

import java.util.ArrayList;
import java.util.function.Predicate;

class Employee
{
	String name;
	int salary;
	int experience;
	
	public Employee(String n,int sal,int exp)
	{
		name=n;
		salary=sal;
		experience=exp;
	}
	
	public String Employeename(Employee e)
	{
		String empname=null;
		if(e.salary>30000 && e.experience>3)
		{
			empname=e.name;
		}
		return empname;
	}
}

public class Demo3PredicateFunc {
	
	public static void main(String[] args)
	{
		//Ex-1 
		Employee e = new Employee("Alex",40000,10);
		
		System.out.println(e.Employeename(e));
		
		Predicate<Employee> p = emp-> (emp.salary>30000 && emp.experience>3);
		System.out.println(p.test(e));
		
		//Ex-2
		
		ArrayList<Employee> al = new ArrayList<Employee>();
		al.add(new Employee("Alex",40000,6));
		al.add(new Employee("Jhon",20000,1));
		al.add(new Employee("Peter",50000,4));
		al.add(new Employee("Jay",10000,5));
		
		for(Employee emp1:al)
		{
			if(p.test(emp1))
			{
				System.out.println("Name is "+emp1.name+" salary is "+emp1.salary+" experience is "+emp1.experience+" years");
			}
		}
		
		
	}

}
