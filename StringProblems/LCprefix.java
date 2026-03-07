package StringProblems;
import java.util.Arrays;
public class LCprefix{
    static String prefix(String[] arr){
    StringBuilder s = new StringBuilder();
        String first = arr[0];
        String last = arr[arr.length-1];
        for(int i =0;i <Math.min(first.length(),last.length());i++){
            if(first.charAt(i)!=last.charAt(i)){
                return s.toString();
            }
            s.append(first.charAt(i));
        }return s.toString();
    }
    public static void main(String[] args) {
        String arr[] = {"Flower","Flows","Flaw","Flex"};
        Arrays.sort(arr);
        System.out.println(prefix(arr));
    
    }
}