import java.util.Arrays;

class Greedy03 {

    public int solution(int[] people, int limit) {
        int answer = 0;
        Arrays.sort(people);

        int start = 0;
        int end = people.length - 1;

        while (start <= end) {
            int sum = people[start] + people[end];
            if (start != end-- && sum <= limit) start++;
            answer++;
        }

        return answer;
    }

}