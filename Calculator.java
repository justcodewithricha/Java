//create a calculator using switch case
import java.util.Scanner;

public class Calculator{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two integers:");
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("Enter an \n1.Addition \n2.Subtraction \n3.Multiplication \n4.Division:");
        int choice= sc.nextInt();
        switch(choice){
            case 1: System.out.println("The sum is"+(a+b));
            break;
            case 2: System.out.println("The difference is"+(a-b));
            break;
            case 3: System.out.println("The product is:"+(a*b));
            break;
            case 4: System.out.println("The quotient is"+(a/b));
            break;
            default:
            System.out.print("Enter valid input");
            break;
        }
    }
}
