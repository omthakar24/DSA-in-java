package ArrayProblems;

public class Cons1 {

    static int count(int[] arr){
        int counter = 0;
        int i = 0;
        while(i<arr.length){
            if(arr[i]==1){
                counter++;
                i++;
            }else{
                counter = 0;
                i++;
            }
        }
        return counter;
    }
    public static void main(String[] args){
        int[] arr = {0,1,0,1,1,1,1,0,1,1,1,1,1,1,1};
        System.out.println(count(arr));
    }
}
