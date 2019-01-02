package codility.com.lessons.l13caterpillar;

import java.util.HashSet;
import java.util.Set;

/**
 * 100%
 * @author rodolfo
 */
public class AbsDistinct {
	public int solution(int[] A) {
		Set<Integer> grupo = new HashSet<>();
		int cont = 0;
		for (int x : A) {
			if (grupo.add(Math.abs(x))) {
				cont++;
			}
		}
		return cont;
	}
}
