
import java.io.*;
import java.util.*;

class chocolate {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.addAll(Arrays.asList(3, 4, 1, 9, 56, 7, 9, 12));
        int n = 8;
        int m = 5;

        Solution ob = new Solution();

        System.out.println(ob.findMinDiff(arr, n, m));
    }

}
// } Driver Code Ends

// User function Template for Java

class Solution {
    public long findMinDiff(ArrayList<Integer> a, int n, int m) {
        // your code here
        long min = Long.MAX_VALUE;
        Collections.sort(a);
        int i = 0;
        int j = i + m - 1;
        while (j < n) {
            min = Math.min(min, a.get(j) - a.get(i));
            i++;
            j++;
        }
        return min;
    }
}
