package ArrayProblems;

public class FindMissingNumber {
    static int findMissing(int[]arr){
        int sum = 0;
        int sumofarray = 0;
        int j = 0;
        for(int i = 0;i<=arr.length+1;i++){
            sum = sum + i;

            if(j<arr.length){
                sumofarray = sumofarray+arr[j];
                j++;
            }
        }

        return sum - sumofarray;
    }
    public static void main(String []args){
        int[] arr = {1,2,3,4,5,7};
        System.out.println(findMissing(arr));
    }
}
