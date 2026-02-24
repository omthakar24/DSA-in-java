package ArrayProblems;

public class SecondLargest {
    public static void main(String[]args){
        int[]arr = {10,9,11,12,8,7,13,14,15};
        int buffer = 0;
        int temp = arr[0];
        for(int i = 0;i<=arr.length-1;i++){
            if(arr[i]>temp){
                buffer = temp;
                temp = arr[i];
            }
        }
        System.out.print(buffer); 
       }
}
