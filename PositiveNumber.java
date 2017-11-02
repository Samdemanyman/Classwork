/******************************************************************************
 CLASS INFORMATION                                    * Score: ______________ *
 -----------------                                    *************************
   Programmer: Sam Aponte
   Date Due:  9/15/2017
 ******************************************************************************/
 import java.util.Scanner;
public class PositiveNumber
{
	public static void main(String[] args)
	{
	   
		Scanner samuel;
		samuel = new Scanner(System.in);
		int value;
		System.out.println("Give me a positive number: ");
		value=samuel.nextInt();
		
		while( value < 0)
		{
			System.out.println( "thats not positive!");
			System.out.println( "Try Again!");
			value = samuel.nextInt();
		}
		System.out.println( "AYYYYYYY!");
		

	}
}
  