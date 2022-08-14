//Q34
public class searchRange {
    public int[] searchRange(int[] nums, int target) {
        int i = 0, j = nums.length, m = 0;
        int ind = -1;
        int res[] = new int[2];
        
        while(i < j) {
            m = (i+j)/2;
            if(nums[m] == target) {
                ind = m;
                break;
            } else if(nums[m] < target) {
                i = m + 1;
            } else {
                j = m;
            }
        }
        
        if(ind == -1) {
            res[0] = -1;
            res[1] = -1;
            return res;
        }
        int tmp = ind;
        while(tmp >= 0 && nums[tmp] == target) {
            res[0] = tmp;
            tmp--;
        }
        tmp = ind;
        while(tmp < nums.length && nums[tmp] == target) {
            res[1] = tmp;
            tmp++;
        }
        return res;
    }
}
