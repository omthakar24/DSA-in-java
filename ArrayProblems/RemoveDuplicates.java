package ArrayProblems;
import java.util.ArrayList;
import java.util.Arrays;

public class RemoveDuplicates {
    
    static void duplicate(ArrayList<Integer> arr){
        for(int i = 0;i<arr.size();i++){
            for(int j = i+1;j<arr.size();j++){
                if(arr.get(j)==arr.get(i)){
                    arr.remove(j);
                }
            }
        }
    }

    public static void main(String[]args){
        ArrayList<Integer> arr = new ArrayList<>();
        arr.addAll(Arrays.asList(5,3,2,5,4,6,7,8,8,1,5,11));
        duplicate(arr);
        for(int i =0;i<arr.size();i++){
            System.out.print(arr.get(i)+" ");
        }
    }
}
