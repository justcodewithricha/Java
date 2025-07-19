import java.util.Scanner;

public class Conditions {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter three numbers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        if (a == b && b == c) {
            System.out.print("All are equal");
        }
        else if (a >= b && a >= c) {
            if (a == c) {
                System.out.print("a and c are equal and largest");
            } else if (a == b) {
                System.out.print("a and b are equal and largest");
            } else {
                System.out.print("a is the largest");
            }
        }
        else if (b >= a && b >= c) {
            if (b == c) {
                System.out.print("b and c are equal and largest");
            } else {
                System.out.print("b is the largest");
            }
        }
        else {
            System.out.print("c is the largest");
        }
    }
}
