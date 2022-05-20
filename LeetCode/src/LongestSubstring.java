import java.util.HashMap;
import java.util.Map;
// Q3
// Given a string s, find the length of the longest substring without repeating characters.
public class LongestSubstring {
    public int lengthOfLongestSubstring(String s) {
        int max = 0;
        int start = 0;
        int end = 0;
        Map<Character, Integer> map = new HashMap<>();
        while (end < s.length()) {
            char c = s.charAt(end);
            if (map.containsKey(c)) {
                start = Math.max(start, map.get(c) + 1);
            }
            map.put(c, end);
            end++;
            max = Math.max(max, end - start);
        }
        return max;
    }
}
