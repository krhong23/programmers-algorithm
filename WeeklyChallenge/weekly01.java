class Solution {
    public long solution(int price, int money, int count) {
        long answer = money;
        for (int i = 1; i <= count; i++) {
            answer -= price * i;
        }

        return answer < 0 ? Math.abs(answer) : 0;
    }
}

class AnotherSolution {
    public long solution(long price, long money, long count) {
        return Math.max(price * (count * (count + 1) / 2) - money, 0);
    }
}