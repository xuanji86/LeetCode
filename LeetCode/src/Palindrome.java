// Given an integer x, return true if x is palindrome integer.
// An integer is a palindrome when it reads the same backward as forward.
public class Palindrome {
    public boolean isPalindrome(int x) {
        String y = Integer.toString(x);
        int front = 0;
        int back = y.length() - 1;
        while(front < back){
            if(y.charAt(front)!=y.charAt(back)){
                return false;
            }
            front++;
            back--;

        }        
        return true;
    }

}