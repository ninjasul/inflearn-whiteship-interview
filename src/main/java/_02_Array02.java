/**
 * 주어진 문자열을 거꾸로 뒤집은 문자열을 만드는 함수를 작성하라.
 * 예) hello => olleh
 * 예) happy new year => reay wen yppah
 */
public class _02_Array02 {
    public static void main(String[] args) {
        String input = "hello";
        System.out.println(solution(input.toCharArray()));

        input = "happy new year";
        System.out.println(solution(input.toCharArray()));
    }

    public static char[] solution(char[] input) {
        for (int i = 0; i < input.length/2; i++) {
            char temp = input[i];
            input[i] = input[input.length-i-1];
            input[input.length-i-1] = temp;
        }

        return input;
    }
}
