package package1;

import java.util.*;

public class Program4 {
	public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 8, 9, 12, 46, 76, 82, 15, 20, 30);
        List<Integer> multiples = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
        Map<Integer, Integer> counts = new HashMap<>();

        for (int multiple : multiples) {
            int count = 0;
            for (int number : numbers) {
                if (number % multiple == 0) {
                    count++;
                }
            }
            counts.put(multiple, count);
        }

        System.out.println(counts);
    }
}
