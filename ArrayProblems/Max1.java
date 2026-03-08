package ArrayProblems;

public class Max1 {

    static int findNum(int[] arr){
int r = 0;
for(int i : arr){
    r ^= i;
}
return r;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,2,3,1,4};
        System.out.println(findNum(arr));
    }
}