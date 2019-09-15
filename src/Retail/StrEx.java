package Retail;
public class StrEx {
	public static String s1="Amudha";
public static void main(String[] args) throws InterruptedException {
		
		
		try
		{
			
			System.out.println(s1.hashCode());
			concat();
			//s1=s1+"Ram";
			System.out.println(s1.hashCode());
			
			System.out.println("S1:"+s1);
			
		} catch (Exception e)
		{
			e.printStackTrace();
		}
		
		
		
	}

public static void concat()
{
	System.out.println(s1.hashCode());
	s1=s1.concat("Ram");
	System.out.println("S:"+s1);
	System.out.println(s1.hashCode());
}
	
}