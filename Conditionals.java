
/******************************************************************************
 CLASS INFORMATION                                    * Score: ______________ *
 -----------------                                    *************************
   Programmer: Sam Aponte
   Date Due:  9/15/2017
 ******************************************************************************/
 import java.util.Scanner;
public class Conditionals
{
	public static void main(String[] args)
	{
	   
		Scanner samuel;
		samuel = new Scanner(System.in);
		int a;
		int b;



		System.out.print("Enter a number for a\n");
		a = samuel.nextInt();
		if (a >= 10)
		{
			
			if (a <= 20)
			{
				System.out.print("yes\n");
			}
			else 
			{
				System.out.print( "NOOOOO!!!");
			}
			
		}
		else 
			{
				System.out.print("NAH Bruh!");
			}

	}
}
  