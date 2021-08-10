class Solution {
    public String solution(int[][] scores) {
        String answer = "";
        for (int i = 0; i < scores.length; i++) {
            int my = scores[i][i];
            int max = scores[i][0];
            int min = scores[i][0];

            int sum = 0;
            for (int j = 0; j < scores[i].length; j++) {
                if (max < scores[i][j]) {
                    max = scores[i][j];
                }
                if (min > scores[i][j]) {
                    min = scores[i][j];
                }
                sum += scores[i][j];
            }

            int average = 0;
            System.out.println("my:" + my + ", max:" + max + ", min:" + min);
            if (my > max || my < min) {
                average = (sum - my) / (scores.length - 1);

            } else {
                average = sum / scores.length;

            }
            System.out.println("i:" + i + ", sum:" + sum + ", avg:" + average);
            answer += findCredit(average);
        }
        return answer;
    }

    private String findCredit(int score) {
        if (score <= 90) {
            return "A";
        } else if (score <= 80) {
            return "B";
        } else if (score <= 70) {
            return "C";
        } else if (score <= 50) {
            return "D";
        } else {
            return "F";
        }

    }
}