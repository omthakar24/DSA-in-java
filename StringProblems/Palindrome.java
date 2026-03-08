package StringProblems;

public class Palindrome {
    static boolean isPalindrome(String s,int low,int high){
        if(low>=high){
            return true;
        }
        if(s.charAt(low)!=s.charAt(high)){
            return false;
        }
        return isPalindrome(s,low+1,high-1);
         
    }
    public static void main(String[] args) {
        String s = "doggo";
        System.out.println(isPalindrome(s.toLowerCase(), 0, s.length()-1));
    }
}
