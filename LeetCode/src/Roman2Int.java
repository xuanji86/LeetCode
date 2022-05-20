import java.util.HashMap;
import java.util.Map;

class Roman2Int{
    private Map<Character, Integer> map = new HashMap();
    public int romanToInt(String s) {
        return 0;
    }

    public void Roman2IntMap(){
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);
    }
}