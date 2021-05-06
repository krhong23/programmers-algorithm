class Solution {

    /**
     * 해결 1안
     *
     * @param a
     * @param b
     * @return long
     */
    public long solution01(int a, int b) {
        long answer = 0;
        if (a == b) {
            return a;
        } else if (a > b) {
            for (int i = b; i <= a; i++) {
                answer += i;
            }
        } else {
            for (int i = a; i <= b; i++) {
                answer += i;
            }
        }
        return answer;
    }

    /**
     * 해결 2안
     *
     * @param a
     * @param b
     * @return long
     */
    public long solution02(int a, int b) {
        return arithmeticProgression(Math.min(a, b), Math.max(b, a));
    }

    /**
     * 등차수열의 합 구하기
     *
     * @param a
     * @param b
     * @return long
     */
    private long arithmeticProgression(long a, long b) {
        return (b - a + 1) * (a + b) / 2;
    }
}