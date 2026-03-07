package StringProblems;

import java.util.Arrays;

public class Anagram {
    static boolean isAnagram(String s,String t){
        if(s.length()!=t.length()){
            return false;
        }
        int arr[] = new int[26];
        Arrays.fill(arr, 0);
        for(int i = 0;i<s.length();i++){
            char c = s.charAt(i);
            arr[c-'a']= 1;
        }
        for(int i = 0;i<t.length();i++){
            char c = t.charAt(i);
            arr[c-'a']= 0;
        }
        for(int i = 0;i<arr.length;i++){
            if(arr[i]==1){
                return false;
            }
        }

        return true;
    }
    public static void main(String[] args){
        String s = "cat";
        String t = "tac";
        System.out.println(isAnagram(s.toLowerCase(), t.toLowerCase()));
    }
}
