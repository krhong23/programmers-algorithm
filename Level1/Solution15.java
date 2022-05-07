public class Solution15 {

    public int[] solution(int[] answers) {
        int[] a = {1, 2, 3, 4, 5};
        int[] b = {2, 1, 2, 3, 2, 4, 2, 5};
        int[] c = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};

        int resultA = this.calculate(answers, a);
        int resultB = this.calculate(answers, b);
        int resultC = this.calculate(answers, c);

        int[] answer = {resultA, resultB, resultC};

        // TODO 가장 높은 점수를 받은 사람 리턴하기 (동일할 경우 오름차순 정렬 후 리턴)
        return answer;
    }

    private int calculate(int[] answers, int[] solving) {
        int correct = 0;
        for (int i = 0; i < answers.length; i++) {
            if (solving[i % solving.length] == answers[i]) {
                correct += 1;
            }
        }
        return correct;
    }

}
