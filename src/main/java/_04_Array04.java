import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.IntStream;

import static java.util.stream.Collectors.toList;

/**
 * 1부터 100 까지의 숫자 중에 50개의 랜덤한 숫자가 들어있는 배열이 있다.
 * 이 배열을 O(n)의 시간 복잡도로 정렬하라.
 */
public class _04_Array04 {
    public static void main(String[] args) {
        List<Integer> collected = IntStream.rangeClosed(1, 100)
            .boxed()
            .collect(toList());

        Collections.shuffle(collected);

        System.out.println(solution(collected.subList(0, 49).stream().mapToInt(Integer::intValue).toArray()).toString());
    }

    public static List<Integer> solution(int [] numbers) {
        boolean [] contains = new boolean[101];

        for (int i = 0; i < numbers.length; i++) {
            contains[numbers[i]] = true;
        }

        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < contains.length; i++) {
            if (contains[i]) {
                list.add(i);
            }

            if (list.size() >= 50) {
                break;
            }
        }

        return list;
    }
}
