public class search {
    public int search(int[] nums, int target) {
        int index = 0;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] == target){
                index = i;
                return index;
            }
        }
        return -1;
    }
}
