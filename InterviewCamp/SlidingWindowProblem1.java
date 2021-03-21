import java.util.*;

class SlidingWindowProblem1 {

	public static void main(String[] args) {
		int[] a = {5,3,1,7,6,4,2,3};
		int[] result = solution(a, 14);
		System.out.println(Arrays.toString(result));
	}

	public static int[] solution(int[] a, int target) {
		int start = 0;
		int end = 0;
		int[] result = new int[2];
		int sum = a[0];
		while (start < a.length) {
			if(start > end) {
				end = start;
				sum = a[start];
			} 
			if(sum < target) {
				if(end == a.length - 1) {
					break;
				} else {
					end++;
					sum = sum + a[end];
				}
			} else if(sum > target) {
				sum = sum - a[start];
				start++;
			}
			else {
				result[0] = start;
				result[1] = end;
				return result;
			}
		}
		return null;
	}
}
