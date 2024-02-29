public class rotatedArray {
    public static void main(String[] args) {
        int arr[] = { 4, 5, 6, 7, 0, 1, 2 };
        int target = 0;
        Solution s = new Solution();
        System.out.println(s.search(arr, target));
    }
}

class Solution {
    public int search(int[] nums, int key) {
        int start = 0;
        int end = nums.length - 1;
        while (start <= end) {
            int mid = (start + end) / 2;
            if (nums[mid] == key) {
                return mid;
            }

            if (nums[start] <= nums[mid]) {
                if (nums[start] <= key && key <= nums[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            } else {
                if (nums[mid] <= key && key <= nums[end]) {
                    start = mid + 1;

                } else {
                    end = mid - 1;
                }
            }

        }
        return -1;
    }
}