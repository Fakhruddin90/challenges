package codility.com.lessons.l09maxsliceproblem;

/**
 * 100%
 * @author 08115341622
 */
public class MaxSliceSum {
	public int solution(int[] A) {
		if (A.length == 1) {
			return A[0];
		}

		int max_ending = 0;
		int max_slice = 0;

		for (int a : A) {
			max_ending = Math.max(0, max_ending + a);
			max_slice = Math.max(max_slice, max_ending);
		}

		if (max_slice == 0) {
			max_slice = A[0];
			for (int a : A) {
				max_slice = Math.max(max_slice, a);
			}
		}
		return max_slice;
	}
}
