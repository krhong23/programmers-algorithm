class Solution {
    public String solution(int[][] scores) {
        String answer = "";

        for (int i = 0; i < scores.length; i++) {
            int me = scores[i][i];
            int max = scores[i][i];
            int min = scores[i][i];

            int sum = 0;
            float avg = 0;
            int rowCount = 0;
            int len = scores.length;

            for (int j = 0; j < len; j++) {
                if (scores[j][i] > max) {
                    max = scores[j][i];
                } else if (scores[j][i] < min) {
                    min = scores[j][i];
                }
                sum += scores[j][i];
            }

            if (me == max || me == min) {
                for (int j = 0; j < scores.length; j++) {
                    if (scores[j][i] == me) {
                        rowCount += 1;
                    }
                }
            }

            if (rowCount == 1) {
                sum -= me;
                len -= 1;
            }
            avg = (float) sum / len;
            answer += findCredit(avg);
        }
        return answer;
    }

    private String findCredit(float score) {
        if (score >= 90) {
            return "A";
        } else if (score >= 80) {
            return "B";
        } else if (score >= 70) {
            return "C";
        } else if (score >= 50) {
            return "D";
        } else {
            return "F";
        }
    }
}