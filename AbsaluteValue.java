/******************************************************************************
 CLASS INFORMATION                                    * Score: ______________ *
 -----------------                                    *************************
   Programmer: Sam Aponte
   Date Due:  9/15/2017
 ******************************************************************************/
 import java.util.Scanner;
public class AbsaluteValue
{
	public static void main(String[] args)
	{
	   
		Scanner samuel;
		samuel = new Scanner(System.in);
		int a;
		int b;
		int aa;
		int ab;
		System.out.print("Enter a number for a\n");
		a = samuel.nextInt();
		System.out.print("Enter a number for b\n");
		b = samuel.nextInt();
		aa = a * -1;
		ab = b * -1;
		if ( aa <= 0)
		{
			a * -1;
		}
		
		if ( ab <= 0)
		{
			b * -1;
		} 
		if (aa < ab)
		{
		   System.out.print(a);
		}
		else if (a > b)
		{
			System.out.print(b);
		}
		
		

	}
}
  