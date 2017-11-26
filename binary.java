public class binary {
	public static void main (String [] args)
	{
		int zahl = 42;
		
		System.out.println("die Zahl lautet:  " + zahl);
		while(zahl>0) 
		{
			if (zahl%2 != 0)
			{
				System.out.println("Es gibt einen Rest   1");
				zahl = zahl/2;
			}
			
			else 
			{
				System.out.println("Es gibt keinen Rest  0");
				zahl = zahl/2;
			}
			
				
		}
	}
}
