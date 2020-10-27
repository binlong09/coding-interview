import java.util.*;

class FindIfArrayHasDuplicates {

    public static void main(String[] args) {
        int[] a = {7,5,2,3,0,2,1};
        int returnedPair = findDuplicates(a);
        System.out.println(returnedPair);
    }

    public static int findDuplicates(int[] array) {
        HashMap<Integer, Boolean> map = new HashMap<Integer, Boolean>();

        for (int i = 0; i < array.length; i++) {
            if (map.get(array[i]) != null) {
                return array[i];
            }
            map.put(array[i], false);
        }

        return -1;
    }

}