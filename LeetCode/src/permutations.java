import java.util.ArrayList;
//Q46 Permutations
public class permutations {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        if (nums.length < 1 || nums.length > 6) return result;
        dfs(nums, new boolean[nums.length], new ArrayList<>(), result);
        return result;
    }

    public List<List<Integer>> dfs(int[] nums, boolean[] used, List<Integer> permutation, List<List<Integer>> result) {
        if (permutation.size() == nums.length) {
            result.add(new ArrayList<>(permutation));
        }
        for (int i = 0; i < nums.length; i++) {
            if (!used[i]) {
                used[i] = true;
                permutation.add(nums[i]);
                dfs(nums, used, permutation, result);
                used[i] = false;
                permutation.remove(permutation.size() - 1);
            }
        }
        
        return result;
    }
}
