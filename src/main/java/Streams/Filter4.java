/*
 * Filter object in collection by price greater than 25000
 */

package Streams;

import java.util.ArrayList;
import java.util.List;

class Product
{
	int id;
	String name;
	double price;
	
	public Product(int id, String name,double price)
	{
		this.id=id;
		this.name=name;
		this.price=price;
	}
}

public class Filter4 {
	
	public static void main(String[] args)
	{
		List<Product> prod = new ArrayList<Product>();
		
		prod.add(new Product(1,"HP Laptop",25000));
		prod.add(new Product(2,"Dell Laptop",23000));
		prod.add(new Product(3,"Sony Laptop",20000));
		prod.add(new Product(4,"Lenovo Laptop",50000));
		prod.add(new Product(5,"Apple Laptop",200000));
		
		prod.stream()
					.filter(p->p.price>25000)								// Filter will filter out entire object(Eg:- new Product(4,"Lenovo",50000)
					.forEach(p->System.out.println(p.price));				// we have netire object from that object we need price
		
		
	}

}
