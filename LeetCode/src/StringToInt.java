// Q8
// Implement the myAtoi(string s) function, which converts a string to a 32-bit signed integer (similar to C/C++'s atoi function).
public class StringToInt {
    public int myAtoi(String s){
        int result = 0;
        int flag = 1;
        int i = 0;
        while(i < s.length() && s.charAt(i) == ' '){
            i++;
        }
        if(i < s.length() && s.charAt(i) == '-'){
            flag = -1;
            i++;
        }
        else if(i < s.length() && s.charAt(i) == '+'){
            flag = 1;
            i++;
        }
        while(i < s.length() && Character.isDigit(s.charAt(i))){
            int digit = s.charAt(i) - '0';

            if(result > Integer.MAX_VALUE / 10 || (result == Integer.MAX_VALUE/10 && digit > Integer.MAX_VALUE % 10)){
                return flag == 1 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
            }
            result = result * 10 + digit;
            i++;

        }

        return result * flag;
    }
}
