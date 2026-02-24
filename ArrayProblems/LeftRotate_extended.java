package ArrayProblems;

public class LeftRotate_extended {
    static void rotateK(int[] arr,int k){
        int n = arr.length-1;
        while(k-->0){
            int temp = arr[0];
            for(int i = 0;i<n;i++){
                arr[i]=arr[i+1];
            }arr[n]=temp;
        }
    }
    public static void main(String[]args){
        int[] arr = {1,2,3,4,5};
        int k = 3;
        rotateK(arr,k);

        for(int i = 0; i<arr.length;i++){
            System.out.print(arr[i]+ " ");
        }
    }
}
