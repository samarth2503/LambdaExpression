/*	Lambda Expression came into picure to introduce Functional Programming Language (Data will be stored in functions and varibale)
 * 	It is also called as Anonymus Function(No method name,return type and access Modifier)
 * 	It was introduce to acheive code optimization
 * 	we can write consie code(less code)
 * 	Functional Interface hold Lambda Expression.
 * 
 * 	############### Functional Interface ###################
 * 	Functional Interface conatins single abstract methods,but can conatin n number of static methods and default method
 * 	Without Functional interface Lambda function cant be invoked.
 * 	Lambda Expression is useful only on Functional Interface	
 * 	Runnable(Run method),Callable(Call method),Compareable(compareTo method) are Functional Interface
 */

package LambdaExpression;



public class LambdaPractice {
	
	public static void main(String args[])
	{
		//Different ways to represent lambda Expression
		
/*		1> (a,b)->System.out.println(a+b);								// (a,b) represent arugment
		2> (int a)->{return a*a;};										// if we want to return value we must specify in curley braces
		3> (int a, int b)-> a+b;										// 2nd way to represnt when we have return value
		4> (a)-> a*a;													// 2nd way to express return statement.
		5> a -> a+a;													// without parenthisis.	
		5> ()->{
			System.out.println(a);
			System.out.println(b);
			};
	*/	
		
		
	}
		
	
	

}

@FunctionalInterface
interface A
{
	public void m1();
}
@FunctionalInterface
interface B extends A
{
	public void m1();												// Code will work as method m1 is overridden in Interface B
	
	//public void m2();												// It will throw error as it violate the rule of funcatinal Interface(SAM)
}



