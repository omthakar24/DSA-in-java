package ArrayProblems;
import java.util.Arrays;
public class TwoSum{
    public static void main(String[] args){
        int arr[] = {5,4,3,2,5};
        Arrays.sort(arr);
        int left = 0;
        int right = arr.length-1;
        int target = 7;
        while(left<right){
            if(arr[left]+arr[right]==target){
                System.out.println(arr[left]+"+"+arr[right]+"="+target);
            }
            if(arr[left]+arr[right]>target){
                right--;
            }else{
                left++;
            }
        }
    }
}