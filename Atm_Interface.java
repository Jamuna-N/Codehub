import java.util.Scanner;
class Atm_Interface
{
    public static void main(String args[])
    {
        
      Scanner scan = new Scanner(System.in);
        int balance=5000;
        while(true)
        {
         System.out.println("1.deposit 2.withdraw 3.balance");
         System.out.println("enter your choice");
          int choice=scan.nextInt();
        
         switch(choice)
         {
          case 1:
         {
          System.out.println("enter the amount to deposit");
         int deposit=scan.nextInt();
         balance=balance+deposit;
         System.out.println("Succesfully deposited your money\n");
         break;
         } 
         case 2:
         {
         System.out.println("enter the amount to be withdrawn");
         int withdraw=scan.nextInt();
         if(withdraw >balance)
         {
       
          System.out.println("sorry..you cant withdraw your amount.your balance is low\n");
         }
         else
         {
          balance=balance-withdraw;
         System.out.println("Please collect your withdrawn amount\n");
        
        
          }
          break;
          }
            case 3:
          {
          System.out.println("your balance is"+balance);
          System.out.println("");
         break;
         }
           default:
            {
            System.out.println("you have entered the wrong choice");
            System.exit(0);
         }
           }

        }
    }
}