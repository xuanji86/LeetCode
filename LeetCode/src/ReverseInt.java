// Q7
// Given a signed 32-bit integer x, return x with its digits reversed. If reversing x causes the value to go outside the signed 32-bit integer range [-231, 231 - 1], then return 0.
public class ReverseInt {
    public int reverse(int x) {
        if(x<10 && x>-10){return x;}
        long reverse = 0;
        if(x < 0){
            x = Math.abs(x);
            int number = x;
            while(number > 0){
                reverse = reverse * 10 + number % 10;
                number = number / 10;
            }
            reverse = -reverse;
        }else if(x%10 == 0){
            String str = Integer.toString(x);
            str.substring(0,str.length()-1);
            int NewNumber = Integer.parseInt(str);
            int number = NewNumber;
            while(number > 0){
                reverse = reverse * 10 + number % 10;
                number = number / 10;
            }
        }else{
            int number = x;
            while(number > 0){
                reverse = reverse * 10 + number % 10;
                number = number / 10;
            }
        }
        if(reverse> Math.pow(2,31)-1 || reverse < -1 * Math.pow(2,31)){
            return 0;
        }
        return (int)reverse;

    }
}
