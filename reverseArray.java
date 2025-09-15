//reverse an array
import java.util.Scanner;

public class Demo{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter array size:");
        int n= sc.nextInt();
        int arr[]= new int[n];

        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }

        System.out.println("Original array is:");
        for(int i=0;i<n;i++){
            System.out.print(" "+arr[i]);
        }
        System.out.println();

        System.out.println("Reversed array is:");
        int m = n/2;
        int p=1;
        int temp;

        for(int i=0;i<m;i++){
           temp= arr[i];
           arr[i]=arr[n-p];
           arr[n-p]=temp;
           p+=1;
        }

        System.out.println("Reversed array is:");
        for(int i=0;i<n;i++){
            System.out.print(" "+arr[i]);
        }
    }
}