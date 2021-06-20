package Streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;



class Student
{
	String name;
	char gender;
	int id;
	
	public Student(String name,char gender,int id)
	{
		this.name=name;
		this.gender=gender;
		this.id=id;
	}
}

public class FlatMapDemo3 {
	
	public static void main(String[] args)
	{
		List<Student> list1 = new ArrayList<Student>();
		list1.add(new Student("Samarth",'M',101));
		list1.add(new Student("Vivek",'M',102));
		list1.add(new Student("Daisy",'F',103));
		
		List<Student> list2 = new ArrayList<Student>();
		list1.add(new Student("Mary",'F',104));
		list1.add(new Student("Nancy",'F',105));
		list1.add(new Student("Alex",'M',106));
		
		List<List<Student>> studentlist = Arrays.asList(list1,list2);
		
		// Before Java 8
		for(List<Student> stulist:studentlist)
		{
			for(Student stu: stulist)
			{
				System.out.println(stu.name);
			}
		}
		
		// FlatMap
		
		List<String> studentname = studentlist.stream().flatMap(stu->stu.stream().map(stu1->stu1.name)).collect(Collectors.toList());
		System.out.println(studentname);
	}

}
