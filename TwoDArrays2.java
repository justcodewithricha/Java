//take matrix as an input from the user and search for given no. x and print the index at which it occurs

import java.util.Scanner;

public class TwoDArrays2 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of rows:");
        int rows = sc.nextInt();
        
        System.out.println("Enter number of columns:");
        int cols = sc.nextInt();

        int [][] arr = new int [rows] [cols];
        System.out.println("Enter the element you want to look for:");
        int x = sc.nextInt();

        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                arr[i][j]= sc.nextInt();
            }
        }
        
        boolean found = false;
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                if(arr[i][j]==x){
                   System.out.println("Element found at index: (" + i + ", " + j + ")");
                   found= true;
                }
                else{
                    continue;
                }
            }
        }

        if(!found)//this evaluates to true hence code runs
        {
            System.out.println("Element not found in the matrix");
        }
    }

}
