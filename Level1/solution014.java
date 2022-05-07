public class solution014 {

    /**
     * 채점 결과 (정확성 85.7)
     *
     * @param x
     * @param n
     * @return
     */
    public long[] failSolution(int x, int n) {
        long[] answer = new long[n];
        int increase = x;
        for (int i = 0; i < n; i++) {
            answer[i] = x;
            x = x + increase;
        }
        return answer;
    }

    /**
     * 제한 조건에 따르면 x는 -10000000 이상, 10000000 이하인 정수이고, n은 1000 이하의 자연수이다.
     * int형 x와 int형 n의 연산결과가 int 자료형의 범위를 벗어나 런타임 에러가 발생했다.
     * 데이터 범위가 더 큰 long형으로 변경해서 해결할 수 있었다.
     *
     * @param x
     * @param n
     * @return
     */
    public long[] successSolution(int x, int n) {
        long[] answer = new long[n];
        long increase = 0;
        for (int i = 0; i < n; i++) {
            increase += x;
            answer[i] = increase;
        }
        return answer;
    }
}
