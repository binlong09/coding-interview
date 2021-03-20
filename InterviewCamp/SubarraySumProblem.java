import java.util.*;
import java.lang.Math;

class SubarraySumProblem {

    public static void main(String[] args) {
        int[] a = {-2, -3, 4, -1, -2, 1, 5, -1};
        int result = solution(a);
        System.out.println(result);
    }

    public static int solution(int[] a) {
        if (a == null || a.length == 0) {
            throw new IllegalArgumentException("input array is empty or null");
        }
         int maxSum = a[0], maxEndingHere = a[0];
         for (int i = 1; i < a.length; i++) {
            maxEndingHere = Math.max(maxEndingHere + a[i], a[i]);
            maxSum = Math.max(maxSum, maxEndingHere);
        }
        return maxSum;
    }
}