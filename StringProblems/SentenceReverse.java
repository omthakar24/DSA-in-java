package StringProblems;

import java.util.ArrayList;

public class SentenceReverse {
    static void reverse(String s,char[] c){
        int current = 0;
        int prev = s.length()-1;
        int n = s.length()-1;
        for(int i=n;i>=0;i--){
            if(s.charAt(i)==' '){
                for(int j = i+1; j<=prev;j++){
                    c[current] = s.charAt(j);
                    current++;
                }c[current++]=' ';
                prev = i-1;
            }
        }
            for (int j = 0;j<=prev;j++){
                c[current]=s.charAt(j);
                current++;
            }
        

    }
    public static void main(String[]args){
        String s = "Hello my boy";
        char[] c = new char[s.length()];
        reverse(s,c);
        for (int i = 0;i<c.length;i++){
        System.out.print(c[i]);
    }
}
}
