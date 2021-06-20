package Streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class Employee
{
	String name;
	int salary;
	int empid;
	
	public Employee(String name,int salary,int empid)
	{
		this.name=name;
		this.salary=salary;
		this.empid=empid;
	}
}

public class MapDemo4 {
	
	public static void main(String[] args)
	{
		List<Employee> emplist = Arrays.asList(new Employee("Alex",10000,101),
				new Employee("Brain",20000,102),
				new Employee("Charles",30000,103),
				new Employee("David",40000,104),
				new Employee("Edwards",50000,105));
		
		
		List<Integer> updatedlist=emplist.stream()
						.filter(emp->emp.salary>20000)
						.map(emp->emp.salary)
						.collect(Collectors.toList());
		
		System.out.println(updatedlist);
	}

}
