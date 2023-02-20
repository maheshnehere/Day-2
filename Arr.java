import java.util.Scanner;
class Arr{
	
	public static void main (String args []){
		
		Scanner obj = new Scanner(System.in);
		
		System.out.println("Enter value for array");
		
		int num = obj.nextInt();
		
		int [] array = new int [5];
		
		
		
		for(num = 0;num<5;num++)
		
		{
			
			array[num]=obj.nextInt();
		}
		
	}
}