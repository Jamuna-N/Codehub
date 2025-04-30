 import java.util.Scanner;
 import java.util.Random;
 public class Game_Generator
{
public static void main(String args[])
{
    int chances=5;
    int score=chances;
    Random gc=new Random();
    Scanner in=new Scanner(System.in);
    int rand=gc.nextInt(100);
    System.out.println(rand);

    for(int i=chances-1;i>=0;i--)
    {
        System.out.print("\n enter the user input between 1 to 100: ");
        int guess=in.nextInt();
        if(guess>100)
        {
            System.out.println("your input should be between 1 to 100");
            return;
        }

        if(rand==guess)
        {
            System.out.println("congratulations!! You have guessed the right number. \n");
            System.out.println("you have scored: "+ score);
            break;
        }

        else if(rand>guess)
        {
         System.out.println(" your guessed number is smaller than the number generated..\ntry again!!!!!"); 
         System.out.println("Oops..your score is reduced to "+ --score);  
         System.out.println("You are left with "+i+" chances");
        }

        else
        {
            System.out.println("You guessed number is higher than the number generated..\n try again!!!!!");
            System.out.println("Oops..your score is reduced to "+ --score); 
            System.out.println("You are left with "+i+" chances ");
        }
        if(i==0)
        {
        System.out.println("Sorry..You have exceeded your chances..\n Better luck next time..");
        }

    }
}
}
