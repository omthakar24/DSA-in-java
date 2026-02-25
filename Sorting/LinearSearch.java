package Sorting;

public class LinearSearch {
    static int Linear(int[]arr, int n){

          for(int i = 0; i<arr.length;i++){
            if(arr[i]==n){
               return i;
            }
    }return-1;
}
    public static void main(String []args){
        int[] arr = {5,4,3,2,1,5,4,3,2,1};
        int n = 5;
        int result = Linear(arr,n);
        System.out.println(result);
        }
}
