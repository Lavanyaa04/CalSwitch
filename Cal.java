import java.util.Scanner;
public class Cal
{
    public static void main(String[] arg)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1st Number:");
        int a =sc.nextInt();

        System.out.println("Enter 2nd Number:");
        int b= sc.nextInt();

        System.out.println("Select Operation");
        System.out.println("Addition-a : Subtraction-s : Division-d : Multiplication-m");
        char ch = sc.next().charAt(0);
        switch(ch)
        {
            case 'a' :
            System.out.println("Sum of two Numbers = "+(a+b));
            break;
            case 's' :
            System.out.println("Subtraction of two Numbers = "+(a-b));
            break;
            case 'm' :
            System.out.println("Product of two Numbers ="+(a*b));
            break;
            case 'd' :
            System.out.println("Result of division = "+(a/b));
            break;
            default :
            System.out.println("invalid input");

        }
    }
} 