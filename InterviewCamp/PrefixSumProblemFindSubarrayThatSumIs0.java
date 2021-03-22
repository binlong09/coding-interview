import java.util.*;

class PrefixSumProblemFindSubarrayThatSumIs0 {

	public static void main(String[] args) {
		int[] a = {-1, 2, 1, -4, 2, 3, -1, 2};
		int[] result = solution(a);
		int[] b = {2,4,-2,1,-3,5,-3};
		int[] result2 = solution(b);
		System.out.println(Arrays.toString(result));
		System.out.println(Arrays.toString(result2));
	}
	
	public static int[] solution(int[] a) {
		int sum = 0;
		int[] result = {0, 0};
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		for(int i = 0; i < a.length; i++) {
			sum += a[i];
			if(sum == 0) {
				result[1] = i;
				return result; 
			}
			if(map.containsKey(sum)) {
				result[0] = map.get(sum) + 1;
				result[1] = i;
				return result;
			}
				map.put(sum, i);
			
		}
		return null;
	}

}
