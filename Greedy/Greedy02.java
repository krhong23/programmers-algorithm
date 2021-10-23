import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

class Greedy02 {

    public String solution(String number, int k) {
        StringBuilder sb = new StringBuilder(number);
        int i;
        int j;
        int index;
        int length;
        for (i = 0; i < k; i++) {
            length = sb.length();
            index = length - 1;
            for (j = 0; j < length - 1; j++) {
                if (sb.charAt(j) < sb.charAt(j + 1)) {
                    index = j;
                    break;
                }
            }
            sb.deleteCharAt(index);
        }
        return sb.toString();
    }

}