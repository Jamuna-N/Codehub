import java.util.Scanner;
public class Grade_Calculator{
    public static void main(String args[])
    {
        Scanner sc =new Scanner(System.in);

        System.out.print("Enter name of student:");
        sc.nextLine();
        System.out.println("Enter marks of all subject");
        System.out.print("Enter tamil marks:");
        int a=sc.nextInt();
        System.out.print("Enter english marks:");
        int b= sc.nextInt();
        System.out.print("Enter maths marks:");
        int c=sc.nextInt();
        System.out.print("Enter science marks:");
        int d= sc.nextInt();
        System.out.print("Enter social science marks:");
         int e=sc.nextInt();
         int sum=a+b+c+d+e;
         int average=(sum)/5;
         System.out.println("Total marks obtained="+sum);
         System.out.println("Average is="+average);
    if(average>=80)
    {
        System.out.println("Congrats!!! Your grade is:O");
    }
    else if(average<80 && average>=70)
    {
        System.out.println("Congrats!!! Your grade is:A");
    }
    else if(average<70 && average>=50)
    {
        System.out.println("Congrats!!! Your grade is:B");
    }
    else if(average<50 && average>=40)
    {
        System.out.println("Congrats!!! Your grade is:C");
    }
    else if (average<40)
    {
        System.out.println("Your grade is:F and you have failed in your exam");
    }
    
}
}