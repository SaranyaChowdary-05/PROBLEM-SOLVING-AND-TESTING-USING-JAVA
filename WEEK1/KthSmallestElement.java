QUESTION:
Given an array of integers and a positive integer K, write a program
to find:The Kth smallest element

PROGRAM:
import java.util.*;

public class KthSmallestElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        
        int k = sc.nextInt();
        Arrays.sort(arr);
        System.out.println(arr[k - 1]);
    }
}
