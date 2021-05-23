class Solution007 {

    /**
     * 해결 1안
     *
     * @param s
     * @return true or false (문자열 내 p와 y의 개수 일치 여부)
     */
    boolean solution(String s) {
        String lowerStr = s.toLowerCase();
        if (lowerStr.indexOf('p') == -1 && lowerStr.indexOf('y') == -1) {
            return true;
        }

        int pCount = 0;
        int yCount = 0;

        char[] ch = lowerStr.toCharArray();
        for (int i = 0; i < ch.length; i++) {
            if (ch[i] == 'p') pCount += 1;
            if (ch[i] == 'y') yCount += 1;
        }

        if (pCount == yCount) {
            return true;
        } else {
            return false;
        }
    }

    /**
     * 해결 2안
     *
     * @param s
     * @return true or false (문자열 내 p와 y의 개수 일치 여부)
     */
    boolean solution(String s) {
        s = s.toLowerCase();
        int count = 0;

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'p')
                count++;
            else if (s.charAt(i) == 'y')
                count--;
        }

        if (count == 0) {
            return true;
        } else {
            return false;
        }
    }
}