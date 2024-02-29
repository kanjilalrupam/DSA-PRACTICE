
import java.lang.Math;

public class reverseArray {

    public static void reverse(int arr[]) {
        int first = 0;
        int last = arr.length - 1;
        while (first < last) {
            int temp = arr[last];
            arr[last] = arr[first];
            arr[first] = temp;
            first++;
            last--;
        }
    }

    public static void main(String[] args) {
        int arr[] = new int[5];
        for (int i = 0; i < 5; i++) {
            arr[i] = (int) (Math.random() * 10);
        }
        System.out.print("Original Array: ");
        for (int n : arr) {
            System.out.print(n + " ");
        }
        reverse(arr);
        System.out.println();
        System.out.print("Reversed Array: ");
        for (int n : arr) {
            System.out.print(n + " ");
        }
    }
}
