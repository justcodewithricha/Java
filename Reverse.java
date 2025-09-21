//reverse an array using function
import java.util.Scanner;

public class Demo{
  public static void reverseArray(int[] arr){
    int n = arr.length;
    int m = n/2;
    int p=1;
    int temp;

    for(int i=0;i<m;i++){
      temp=arr[i];
      arr[i]=arr[n-p];
      arr[n-p]=temp;
      p++;
    }
    System.out.println("Reversed array is:");
    for(int i=0;i<n;i++){
      System.out.print(" "+arr[i]);
    }
    }

    public static void main(String args[]){
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter array size:");
      int size= sc.nextInt();

      int arr[]= new int[size];
      System.out.println("Enter array elements:");
      for(int i=0;i<size;i++){
        arr[i]= sc.nextInt();
      }

      System.out.println("Original array elements are:");
      for(int i=0;i<size;i++){
        System.out.print(" "+arr[i]);
      }
      System.out.println();
      reverseArray(arr);
    }
  }
