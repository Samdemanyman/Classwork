
/******************************************************************************
 CLASS INFORMATION                                    * Score: ______________ *
 -----------------                                    *************************
   Programmer: Sam Aponte
   Date Due:  9/15/2017
 ******************************************************************************/
 import java.util.Scanner;
public class GuessingGame
{
	public static void main(String[] args)
	{
	   
		Scanner keyboard;
		keyboard = new Scanner(System.in);
		int answer = 5001; 
       
        int count = 1;    
            
         System.out.print("Im thinking of a number between 1 and 10,000. Can you Guess???");
          int guess = keyboard.nextInt();
        while (guess != answer )
        {
            if ( guess < answer )
            {
                 System.out.println("Toooooo Low there buddy >:) GUESS AGAIN!");

            }
            else
            {
                System.out.println(" So close just a little to high!");
            }
             guess = keyboard.nextInt();

            if ( guess == answer)
            {
                System.out.println( " You got it bro!");
            }


        }

    }

}
   
