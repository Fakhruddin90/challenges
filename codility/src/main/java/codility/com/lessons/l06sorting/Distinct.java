package codility.com.lessons.l06sorting;

import java.util.HashSet;
import java.util.Set;

/**
 * 100%
 * @author 08115341622
 * https://app.codility.com/programmers/lessons/6-sorting/distinct/
 */
public class Distinct {
	public int solution(int[] A) {
		Set<Integer> diferentes = new HashSet<>();
		for (int x : A) {
			diferentes.add(x);
		}
		return diferentes.size();
    }
}
