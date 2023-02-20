import java.util.Scanner;

class WordsNum

{
	
	public static void main(String args [])
	
	{
		Scanner obj = new Scanner (System.in);
		
		System.out.println("Enter the number");
		
		int num = obj.nextInt();
		
		if (num ==10)
		{
			System.out.println("Ten");
		}
		else if ( num == 100)
		{
			System.out.println("Hundred");
		}
		else if (num == 1000)
		{
			System.out.println("Thousand");
		}
		else if (num == 10000)
		{
			System.out.println("Ten Thousand");
		}
		else if (num == 100000)
		{
			System.out.println("One lakh");
		}
		else if (num == 1000000)
		{
			System.out.println("Ten lakh");
		}
		else if (num == 10000000)
		{
			System.out.println("One million");
		}
		
	}
}