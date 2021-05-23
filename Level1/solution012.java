import java.util.stream.Stream;

class Solution012 {

    public boolean solution01(int x) {
        String temp = Integer.toString(x);
        int sum = 0;
        for (int i = 0; i < temp.length(); i++) {
            sum += temp.charAt(i) - '0';
        }

        return x % sum == 0;
    }

    public boolean solution02(int x) {
        int[] digits = Stream.of(String.valueOf(x).split("")).mapToInt(Integer::parseInt).toArray();
        int sum = 0;
        for (int i : digits) {
            sum += i;
        }

        return x % sum == 0;
    }
}