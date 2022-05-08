import java.util.ArrayList;
import java.util.List;

public class Solution15 {

    public int[] solution(int[] answers) {
        int[] a = {1, 2, 3, 4, 5};
        int[] b = {2, 1, 2, 3, 2, 4, 2, 5};
        int[] c = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};
        int[] students = new int[3];

        // 학생별 채점하기
        students[0] = this.calculate(answers, a);
        students[1] = this.calculate(answers, b);
        students[2] = this.calculate(answers, c);

        // 가장 높은 점수를 받은 사람 리턴하기 (동일할 경우 오름차순 정렬 후 리턴)
        List<Integer> answer = new ArrayList<>();
        int max = Math.max(Math.max(students[0], students[1]), students[2]);

        for (int i = 0; i < students.length; i++) {
            if (max == students[i]) {
                answer.add(i + 1);
            }
        }

        // ArrayList to Array
        int[] answerArray = new int[answer.size()];
        for (int i = 0; i < answerArray.length; i++) {
            answerArray[i] = answer.get(i);
        }

        return answerArray;
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
