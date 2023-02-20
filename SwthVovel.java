import java.util.Scanner;

//Write a Program to Check Vowel or Consonant

class SwthVovel{
	
	public static void main(String args [])
	
	{
		
		Scanner obj= new Scanner(System.in);
		
		System.out.println("Enter the character");
		
		char num =(obj.nextLine()).charAt(0);
		
		
		
		
		
	switch(num){
			
			case 'a':
			
			case 'e':
			
			case 'i':
			
			case 'o':

			case 'u':
			System.out.println(num+":Is a vovel");
			break;
			default:
			System.out.println(num+":Is a consonant");
			break;
		}
		
		
	}
}