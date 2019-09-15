package Tutorials;

import java.util.ArrayList;

public class ArrayListSamples {
	public static void main(String[] args)
	{
		ArrayList a=new ArrayList();
		a.add("Amudha");
		a.add(38);
		a.add("5189862597");
		a.add("Female");
		a.add(84.0);
		
		ArrayList addr=new ArrayList();
		addr.add("14131 Doonan Xing");
		addr.add("Frisco");
		addr.add("TX");
		addr.add(75035);
		
		a.addAll(addr);
		a.removeAll(addr);
		a.remove(4); 
		for (int i=0;i<a.size();i++)
		{
			System.out.println(a.get(i));
		}
		
	}
}
