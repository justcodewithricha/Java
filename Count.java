//java program to count the number of digits in a number
import java.util.Scanner;

public class Count{
    public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter a number:");
    int num = sc.nextInt();
    int count_digits =0;
   
    while(0<num){
    num = num/10;
    count_digits+=1;
    }
    System.out.println("The total number of digits are:"+count_digits);
    }
}
