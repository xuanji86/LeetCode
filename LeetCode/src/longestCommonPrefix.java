// Q14
public class longestCommonPrefix {
    public String longestCommonPrefix(String[] strs) {
        if(strs.length == 0 || strs == null){
            return "";
        }
        return longestCommonPrefix(strs, 0, strs.length-1);
    }

    private String longestCommonPrefix(String[] strs, int i, int j) {
        if(i == j){
            return strs[i];
        }else{
            int mid = (i+j)/2;
            String left = longestCommonPrefix(strs, i, mid);
            String right = longestCommonPrefix(strs, mid+1, j);
            return commonPrefix(left, right);
        }
    }

    private String commonPrefix(String left, String right) {
        int min = Math.min(left.length(), right.length());
        for(int i = 0; i < min; i++){
            if(left.charAt(i) != right.charAt(i)){
                return left.substring(0, i);
            }
        }
        return left.substring(0, min);
    }
}
