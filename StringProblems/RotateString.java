package StringProblems;

public class RotateString {
static boolean isPossible(String s, String target) {
    if (s.length() != target.length()) return false;
    if (s.equals(target)) return true;

    char[] c = s.toCharArray();

    for(int k = 0; k < s.length(); k++) {

        char temp = c[0];

        for(int i = 0; i < c.length - 1; i++){
            c[i] = c[i + 1];
        }

        c[c.length - 1] = temp;

        if(new String(c).equals(target)){
            return true;
        }
    }

    return false;
}
    public static void main(String []args){
        String s = "abcde";
        String target = "cdeba";
        System.out.print(isPossible(s,target));
    }
}
