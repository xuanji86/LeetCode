//Q5
public class LongestPalindromicSubStr {
    public String longestPalindrome(String s) {
        String result = "";
        for(int i = 0; i < s.length(); i++){
             String str = getPalindromeString( s,  i,  i);
             if(result.length() < str.length()){
                 result = str;
             }
         }
         
         for(int i = 0; i < s.length(); i++){
             String str = getPalindromeString( s,  i,  i+1);
             if(result.length() < str.length()){
                 result = str;
             }
         }
         return result;
    }
     
     
     public String getPalindromeString(String s, int i, int j){
        while(i >=0 && j < s.length()){
            if(s.charAt(i) != s.charAt(j)){
                break;
            }
            i--;
            j++;
        }
        return s.substring(i+1, j);
    }
}
