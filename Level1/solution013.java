import java.util.Arrays;

class Solution13 {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];

        for (int x = 0; x < commands.length; x++) {
            int i = commands[x][0];
            int j = commands[x][1];
            int k = commands[x][2];

            int[] result = {};

            for (int y = 0; y < array.length; y++) {
                if ((i - 1) <= y && y < j) {
                    result = Arrays.copyOf(result, result.length + 1);
                    result[result.length - 1] = array[y];
                }
            }

            Arrays.sort(result);
            answer[x] = result[k - 1];
        }
        return answer;
    }
}