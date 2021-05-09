class Solution {

    /**
     * 해결 1안
     *
     * @param n
     * @return int (약수의 합)
     */
    public int solution01(int n) {
        int answer = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) answer += i;
        }
        return answer;
    }

    /**
     * 해결 2안
     *
     * @param n
     * @return int (약수의 합)
     */
    public int solution02(int n) {
        int answer = 0;
        for (int i = 1; i <= n / 2; i++) {
            if (n % i == 0) answer += i;
        }
        return answer + n;
    }
}