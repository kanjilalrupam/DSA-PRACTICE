
class Solution {
    public int maxSubArray(int[] nums) {
        int max = Integer.MIN_VALUE;
        int cur = 0;
        for (int i = 0; i < nums.length; i++) {
            cur += nums[i];
            if (cur < 0) {
                cur = 0;
            }
            max = Math.max(cur, max);

        }
        return max;
    }
}

public class maxSubArray {
    public static void main(String[] args) {
        int arr[] = { -2, 1, -3, 4, -1, 2, 1, -5, 4 };
        Solution ob = new Solution();

        System.out.println(ob.maxSubArray(arr));
    }
}
