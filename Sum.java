/******************************************************************************
 CLASS INFORMATION                                    * Score: ______________ *
 -----------------                                    *************************
   Programmer: Sam Aponte
   Date Due:  9/15/2017
 ******************************************************************************/
 import java.util.Scanner;
public class Sum
{
	public static void main(String[] args)
	{
	    
		Scanner keyboard;
		keyboard = new Scanner(System.in);
		int sum = 0;
        int[] number = new int[5];
      
        for (int i=0; i < 5; i++)
        {
            System.out.println("lemme get yo numba!");
            number[i] = keyboard.nextInt();
           
        }
          
         
        for(int i=0; i<5; i++)
        {
            sum+=number[i];
        }
        
        System.out.printf("the sum of all your numbers is %d",sum);

    }

}
  