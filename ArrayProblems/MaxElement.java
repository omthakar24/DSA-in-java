package ArrayProblems;
import java.util.HashMap;
import java.util.Map;

public class MaxElement {
    /*static int returnMax(int[] arr){
        int number = 0;
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i : arr){
            map.put(i,map.getOrDefault(i,0)+1);
        }
        for(Map.Entry<Integer,Integer> entry:map.entrySet()){
            if(entry.getValue()>=arr.length/2){
                return entry.getKey();
            }
        }
        return number;
    }*/
   static int returnMax(int arr[]){
    int element = 0;
    int count = 0;
    for(int i = 0;i<=arr.length-1;i++){
        if(count==0){
            element=arr[i];
        }
        if(arr[i]==element){
            count++;
        }else{
            count--;
        }
    }
    return element;
   }
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,1,1,1,1};
        System.out.println(returnMax(arr));
    }
}
