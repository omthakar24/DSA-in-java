package Sorting;
public class BubbleRecursion {

    static void BubbleSorter(int[]arr,int n,int c){
        if(n==0){
            return;
        }
        if(c<n){
            if(arr[c]>arr[c+1]){
                int temp = arr[c];
                arr[c] = arr[c+1];
                arr[c+1] = temp;
            }BubbleSorter(arr,n,c+1);
        }else {
            BubbleSorter(arr, n-1, 0);
        }
    }
    public static void main(String[]args){
        int[] arr = {5,4,3,2,1};
        int n = arr.length-1;
        int c = 0;
        BubbleSorter(arr, n, c);
        for(int i =0;i<n+1;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
