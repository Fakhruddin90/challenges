package codility.com.lessons.l10prime;

// https://app.codility.com/programmers/lessons/10-prime_and_composite_numbers/min_perimeter_rectangle/
public class MinPerimeterRectangle {
	public int solution(int N) {
		int min = Integer.MAX_VALUE;
		int newValue;
		for (int i = 1; i * i <= N; i++) {
			if (N % i == 0) {
				newValue = 2 * (i + N / i);
				min = min < newValue ? min : newValue;
			}
		}
		return min;
	}
}
