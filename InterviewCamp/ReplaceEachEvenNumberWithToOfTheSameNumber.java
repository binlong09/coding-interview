import java.util.*;

class ReplaceEachEvenNumberWithToOfTheSameNumber {

    public static void main(String[] args) {
        ArrayList<Integer> a1 = new ArrayList<Integer>();
        a1.add(1);
        a1.add(2);
        a1.add(5);
        a1.add(6);
        a1.add(8);
        ArrayList<Integer> result1 = replaceArray1(a1);
        System.out.println(result1.toString()); // correct output: [1, 2, 2, 5, 6, 6, 8, 8]

        int[] a2 = {2, 4, 1, 0, 3, -1, -1, -1};
        int[] result2 = replaceArray2(a2);
        System.out.println(Arrays.toString(result2)); // correct output: [2, 2, 4, 4, 1, 0, 0, 3]
    }

    // Implementation using ArrayList
    public static ArrayList<Integer> replaceArray1(ArrayList<Integer> array) {
        for(int i = 0; i < array.size(); i++) {
            if(array.get(i) % 2 == 0) {
                array.add(i, array.get(i));
                i++;
            }
        }
        return array;
    }

    // Implementation using in-place array with the assumption that extra space in array is provided from the start
    public static int[] replaceArray2(int[] array) {
        int i = getEndIndex(array);
        int end = array.length - 1;
        while(i >= 0) {
            if(array[i] % 2 == 0) {
                array[end] = array[i];
                end--;
                array[end] = array[i];
                end--;
            } else {
                array[end] = array[i];
                end--;
            }
            i--;
        }
        return array;
    }

    // helper function
    public static int getEndIndex(int[] array) {
        int i = 0;
        while(i <= array.length) {
            i++;
            if(array[i] == -1) {
                return i-1;
            }
        }
        return i;
    }
}