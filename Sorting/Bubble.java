package Sorting;
import java.util.Scanner;
public class Bubble{

    static void BubbleSort(int[] arr,int n){
        for(int i = n-1;i>=1;i--){
            for(int j = 0;j<i;j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j+1];
                    arr[j+1] = arr[j];
                    arr[j]=temp;
                }
            }
        }
    }
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        //input
        for(int i = 0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        //function call
        BubbleSort(arr, n);
        //output
        for(int i = 0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        sc.close();
    }
}