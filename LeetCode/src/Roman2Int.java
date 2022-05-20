import java.util.HashMap;
import java.util.Map;
// Q13 Roman to Integer
class Roman2Int{
    public int romanToInt(String s) {
        Map<Character, Integer> map = new HashMap();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);
        int result = 0;
        char prev = ' ';
        for(int i = s.length()-1; i>=0;i--){
            char curr = s.charAt(i);
            result = result + map.get(curr);
            if((prev == 'V' || prev == 'X') && curr == 'I'){
                result = result - 2;
            }else if((prev == 'L' || prev == 'C') && curr == 'X'){
                result = result - 20;
            }else if((prev == 'D' || prev == 'M') && curr == 'C'){
                result = result - 200;
            }
            prev = curr;
        }
        return result;
    }
}