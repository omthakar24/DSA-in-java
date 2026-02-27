package StringProblems;

public class ReturnOdd {
    static int calculate(String num){
        int number = Integer.parseInt(num);
        while(number %2 !=1){
            number = number/10;
        }
        return number;
    }
    static String stringimplementation(String num){
        int n = num.length()-1;
        int j = 0;
        for(int i=n;i>=0;i--){
            if((num.charAt(i)-'0')%2==1){
               while(num.charAt(j)-'0'==0){
                j++;
               }
               return(num.substring(j, i+1));
        }
    }return"";
}
 
    public static void main(String[]args){
        String s = "021345656";
        System.out.println(stringimplementation(s));
    }
}
