// Q26
public class removeDuplicates {
    public int removeDuplicates(int[] nums) {
        int number = 0;
        if(nums.length == 0) return 0;
        for(int i = 1; i < nums.length; i++){
            if(nums[i] != nums[number]){
                number++;
                nums[number] = nums[i];
            }
        }
        return number+1;
    }
}
