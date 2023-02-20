class ReverseNum{
	//Write a Program to reverse the integer number 
	
	public static void main(String args []){
		
		int Number = 12345;
		
		int Reverse =0;
		
		while (Number!=0)
		{
			
			int remainder = Number%10;
			
			Reverse = Reverse*10 + remainder;
			
			Number = Number /10;
		}
			System.out.println("Reverse of given number is:"+ Reverse );
			
		
		
}
		
	
}