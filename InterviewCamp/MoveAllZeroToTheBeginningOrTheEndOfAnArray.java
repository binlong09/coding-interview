import java.util.*;

class MoveAllZeroToTheBeginningOfAnArray {

    public static void main(String[] args) {
        int[] a = {2, 4, 0, 3, 1, 0, 0};
        int[] result = solution(a);
        System.out.println(Arrays.toString(result));
        int[] result2 = solutionReverse(a);
        System.out.println(Arrays.toString(result2));
    }

    public static int[] solution(int[] a) {
        int b = 0;
        int i = 0;
        while(i < a.length) {
            if (a[i] == 0) {
                a = swap(a, i, b);
                b++;
            }
            i++;
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

    public static int[] solutionReverse(int[] a) {
        int b = a.length - 1;
        int i = a.length - 1;
        while(i >= 0) {
            if(a[i] == 0) {
                a = swap(a, i, b);
                b--;
            }
            i--;
        }
        return a;
    }
}