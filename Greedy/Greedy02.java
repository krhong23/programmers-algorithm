import java.util.Arrays;
import java.util.Collections;

class Greedy02 {

    public String solution(String number, int k) {
        String answer = "";
        // 1. string to int array
        int[] digits = new int[number.length()];
        for (int i = 0; i < number.length(); i++) {
            digits[i] = number.charAt(i) - '0';
        }

        // 2. sort array
        digits = Arrays.stream(digits).boxed()
                .sorted(Collections.reverseOrder())
                .mapToInt(Integer::intValue)
                .toArray();

        // 3. digit
        int limit = number.length() - k;
        int[] ia = new int[limit];
        for (int i = 0; i < limit; i++) {
            ia[i] = digits[i];
        }

        return Arrays.toString(ia).replaceAll("[^0-9]", "");
    }

}