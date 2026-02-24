package ArrayProblems;

public class MoveZeros {
    static void transferZeros(int[] arr){
        int temp = 0;
        for(int i = 0;i<arr.length;i++){
            if(arr[i]!=0){
                arr[temp]=arr[i];
                temp++;
            }
        } while(temp<arr.length){
                arr[temp] =0;
                temp++;
            }
    }

    public static void main(String[] args){
        int[] arr = {0,0,1,2,0,1,2,3,0,5};
        transferZeros(arr);
        for(int i = 0;i<arr.length;i++){
            System.out.println(arr[i]+" ");
        }
    }
}

