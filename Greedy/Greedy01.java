import java.util.Arrays;

class Greedy01 {
    public int solution(int n, int[] lost, int[] reserve) {
        int answer = 0;

        answer = n - lost.length;
        Arrays.sort(lost);
        Arrays.sort(reserve);

        // 여분의 체육복을 갖고 왔는데 도난당한 학생들
        for (int i = 0; i < lost.length; i++) {
            for (int j = 0; j < reserve.length; j++) {
                if (lost[i] == reserve[j]) {
                    lost[i] = -1;
                    reserve[j] = -1;
                    answer++;
                    break;
                }
            }
        }

        // 여분의 체육복을 빌려입는 학생들
        for (int i = 0; i < lost.length; i++) {
            for (int j = 0; j < reserve.length; j++) {
                if (lost[i] - reserve[j] == 1 || reserve[j] - lost[i] == 1) {
                    reserve[j] = -1;
                    answer++;
                    break;
                }
            }
        }

        return answer;
    }
}