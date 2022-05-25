// Q27
public class removeElement {
    public int removeElement(int[] nums, int val) {
        int result = 0;
        if(nums.length == 0) return 0;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] != val){
                nums[result] = nums[i];
                result++;
            }
        }
        return result;
    }
}
