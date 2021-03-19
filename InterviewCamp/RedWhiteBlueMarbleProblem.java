import java.util.*;

class RedWhiteBlueMarbleProblem {

    public static void main(String[] args) {
        int[] a =  {1,0,1,2,1,0,1,2};
        int[] result = solution(a, 1);
        System.out.println(Arrays.toString(result));
    }

    public static int[] solution(int[] a, int pivot) {
        int lower_bound = 0;
        int higher_bound = a.length - 1;
        int i = 0;
        while(i <= higher_bound) {
            if(a[i] > pivot) {
                swap(a, i, higher_bound);
                higher_bound--;
            } else if(a[i] < pivot) {
                swap(a, i, lower_bound);
                lower_bound++;
                i++;
            }
            else {
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