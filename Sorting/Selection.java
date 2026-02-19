package Sorting;
import java.util.Scanner;

public class Selection{
    //function
    static void SelectionSort(int arr[],int n){
        for(int i =0;i<=n-2;i++){
            int min = i;
            for(int j =i;j<=n-1;j++){
                if(arr[j]<arr[min]){
                    min = j;
                    // we save the index of first element, and then in inner loop we check if there is any element which is smaller.
                    // Future Reference: dont confuse between index and array element; min = j is storing of index not elements.
                }
            }
            int temp = arr[min];
            arr[min] = arr[i];
            arr[i] = temp;
        }
    }
public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] arr = new int[n];
    //input
    for(int i = 0;i<n;i++){
        arr[i] = sc.nextInt();
    }
    SelectionSort(arr, n);
    //output
    for(int i = 0;i<n;i++){
        System.out.print(" "+arr[i]);
    }
    sc.close();
}
}