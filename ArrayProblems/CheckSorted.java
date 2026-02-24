package ArrayProblems;

public class CheckSorted {
    static boolean isSorted(int[] arr){
        int temp = arr[0];
        for(int i = 0;i<=arr.length-1;i++){
            if(arr[i]<temp){
                return false;
            }
        }return true;
    }
    public static void main(String args[]){
        int[] arr = {1,2,3,4,5};
        System.out.print(isSorted(arr));
    }
}
