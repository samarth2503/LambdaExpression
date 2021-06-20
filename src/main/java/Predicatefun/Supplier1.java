/* Supplier doesnt take any input but it supplies the values to us.
 * It doesnt take any argumnet
 */

package Predicatefun;

import java.util.Date;
import java.util.function.Supplier;

public class Supplier1 {
	
	public static void main(String[] args)
	{
		Supplier s = ()->new Date();
		System.out.println(s.get());
	}

}
