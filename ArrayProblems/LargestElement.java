package ArrayProblems;

public class LargestElement {
    public static void main(String []args){
        int[] arr = {4,5,9,13,10,12};
        int temp = arr[0];
        for(int i =0;i<arr.length-1;i++){
            if(temp<arr[i]){
                temp = arr[i];
            }
        }
        System.out.println(temp);
    }
    
}
