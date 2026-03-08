package StringProblems;

public class ReverseSentence {
    static String rev(String s){
       StringBuilder result = new StringBuilder();
        int n = s.length();
        int prev = n-1;
        for(int i = n-1;i>=0;i--){
            if(s.charAt(i)==' '){
                 for(int j = i+1;j<=prev;j++){
                    result.append(s.charAt(j));             
                 }
                 result.append(' ');
                  prev = i;
            }
        }
        for(int i =0;i<prev;i++){
            result.append(s.charAt(i));
        }

        return result.toString();
    }
    public static void main(String[] args) {
        String s = "hello my boy";
        System.out.println(rev(s));
    }
}
