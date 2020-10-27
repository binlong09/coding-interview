import java.util.*;

class FindAPairOfIntegerThatSumsUpToX {

    public static void main(String[] args) {
        int[] a = { 6,3,5,2,1,7 };
        int target = 4;
        int[] returnedPair = findIntegerPair(a, target);
        System.out.println(Arrays.toString(returnedPair));
    }

    public static int[] findIntegerPair(int[] array, int target) {
        int[] returnPair = new int[2];

        HashMap<Integer, Boolean> map = new HashMap<Integer, Boolean>();

        for(int i = 0; i < array.length; i++) {
            if(map.get(target - array[i]) != null) {
                returnPair[0] = array[i];
                returnPair[1] = target - array[i];
                return returnPair;
            }
            map.put(array[i], true);
        }

        return returnPair;
    }

}