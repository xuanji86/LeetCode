public class maxSubArray {
    public int maxSubArray(int[] nums) {
        if(nums.length==0) return 0;
        if(nums.length==1) return nums[0];
        int max=nums[0];
        int currMaxSum = nums[0];
        for(int i=1;i<nums.length;i++){
            currMaxSum = Math.max(nums[i], currMaxSum + nums[i]);
            max = Math.max(max, currMaxSum);
        }
        return max;
    }
}
