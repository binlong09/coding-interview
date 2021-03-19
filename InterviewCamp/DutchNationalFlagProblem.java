import java.util.*;

class DutchNationalFlagProblem {

    public static void main(String[] args) {
        int[] a = {8, 2, 4, 1, 6, 3, 7, 5};
        int[] result = solution(a, 4);
        int[] b = {5,2,4,4,6,4,4,};
        int[] resultB = solution(b, 4);
        System.out.println(Arrays.toString(result));
        System.out.println(Arrays.toString(resultB));
    }

    public static int[] solution(int[] a, int pivot) {
        int less = 0;
        int more = a.length - 1;
        int i = 0;
        while(i <= more) {
            if(a[i] > pivot) {
                swap(a, i, more);
                more--;
            } else if(a[i] < pivot) {
                swap(a, i, less);
                i++;
                less++;
            } else {
                i++;
            }
        }
        return a;
    }

    public static int[] swap(int[] a, int firstIndex, int secondIndex) {
        int firstTemp = a[firstIndex];
        int secondTemp = a[secondIndex];
        a[firstIndex] = secondTemp;
        a[secondIndex] = firstTemp;
        return a;
    }
}