package ArrayProblems;
public class Reverse {
    public static void main(String[]args){
        int[] arr = {1,2,3,4,5,6};
        int n = arr.length;
        int j = n-1;
        int temp = 0;
        for(int i = 0; i<n/2;i++){
            temp = arr[i];
            arr[i] = arr[j];
            arr[j]=temp;
            j--; 
        }
        for(int i = 0; i<n;i++){
            System.out.print(" "+arr[i]);
        }

    }
}
