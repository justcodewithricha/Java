//take an array as an input from the user search for given number x and print the index at which it occurs
import java.util.Scanner;

public class Array1{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of the array:");
        int size = sc.nextInt();
        int arr[] = new int[size];

        for(int i = 0; i<size ; i++){
           arr[i] = sc.nextInt(); 
        }

        System.out.println("Enter the number you want to look for:");
        int x = sc.nextInt();

        for(int i=0; i<size; i++){
            if(arr[i]==x){
                System.out.print("Found the given number at index:"+i);
            }
            else{
                continue;
            }
        }
    }
}

     
