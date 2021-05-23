import java.util.*;

class Solution011 {

    public int[] solution01(int[] arr, int divisor) {
        List<Integer> answer = new ArrayList<Integer>();

        for (int i : arr) {
            if (i % divisor == 0) answer.add(i);
        }

        if (answer.size() < 1) answer.add(-1);
        answer.sort(null);
        return answer.stream().mapToInt(Integer::intValue).toArray();
    }

    public int[] solution02(int[] arr, int divisor) {
        int[] answer = Arrays.stream(arr).filter(factor -> factor % divisor == 0).toArray();
        if (answer.length == 0) answer = new int[]{-1};
        Arrays.sort(answer);
        return answer;
    }

}