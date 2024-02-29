
import java.io.*;
import java.util.*;

class MaxMin {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int a[] = { 50, 41, 52, 36, 26 };
        int n = a.length;

        Solution ob = new Solution();
        System.out.println(ob.findSum(a, n));

    }
}
// } Driver Code Ends

// User function Template for Java

class Solution {
    @SuppressWarnings("removal")
    public int findSum(int A[], int N) {
        // code here.
        ArrayList<Integer> arr = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            arr.add(new Integer(A[i]));
        }

        int max = Collections.max(arr);
        int min = Collections.min(arr);
        System.out.println(max);
        System.out.println(min);
        int sum = max + min;
        return sum;
    }
}
