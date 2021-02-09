import java.util.HashSet;
import java.util.Set;

/**
 * 숫자로 구성된 배열이 주어졌을 때 그 배열에 중복된 숫자가 있는지 확인하는 함수를 작성하라.
 * 중복된 숫자가 있다면 true 없다면 false.
 * 예) 1 2 3 4 5 6 => false
 * 예) 1 1 2 2 3 1 => true
 */
public class _01_Array01 {
    public static void main(String[] args) {
        int [] array = new int[] {1, 2, 3, 4, 5, 6};
        System.out.println(solution(array));

        array = new int[] {1, 2, 3, 1};
        System.out.println(solution(array));
    }

    public static boolean solution(int array[]) {
        Set<Integer> intSet = new HashSet<>();

        for (int curNum : array) {
            if (intSet.contains(curNum)) {
                return true;
            }

            intSet.add(curNum);
        }

        return false;
    }
}
