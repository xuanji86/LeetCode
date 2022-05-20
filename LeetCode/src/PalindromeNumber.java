// Given an integer x, return true if x is palindrome integer.
// An integer is a palindrome when it reads the same backward as forward.
public class PalindromeNumber {
    public boolean isPalindrome(int x) {
        if (x < 0){
            return false;
        }
        int reverse = 0;
        int number = x;
        while (number > 0){
            reverse = reverse * 10 + number % 10;
            number = number / 10;
        }
        if(reverse == x){
            return true;
        }
        return false;
    }
}
