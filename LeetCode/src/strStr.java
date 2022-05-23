// Q28
public class strStr {
    public int strStr(String haystack, String needle) {
        if(needle.length() == 0 || needle == null){
            return 0;
        }
        for(int i = 0; i < haystack.length(); i++){
            if(i+needle.length() > haystack.length()){
                break;
            }
            if(haystack.charAt(i) == needle.charAt(0)){
                if(haystack.substring(i, i+needle.length()).equals(needle)){
                    return i;
                }
            }
        }
        return -1;
    }
}
