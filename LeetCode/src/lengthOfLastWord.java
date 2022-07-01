public class lengthOfLastWord {
    public int lengthOfLastWord(String s) {
        if(s.length() <= 1){
            return s.length();
        }
        String str[]=s.split(" ");
        String s1=str[str.length-1];
        return s1.length();
    }
}
