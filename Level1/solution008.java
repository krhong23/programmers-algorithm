class Solution008 {

    /**
     * 해결안
     *
     * @param s
     * @return
     */
    public String solution01(String s) {
        // 해결 1안) 선택 정렬
        return String.valueOf(selectionSort(s.toCharArray()));
        // 해결 2안) 거품 정렬
        // return String.valueOf(bubbleSort(s.toCharArray()));
        // 해결 3안) 문자열 정렬 후 뒤집기
        // return reverseStr(s);
    }

    /**
     * 선택 정렬
     *
     * @param array
     * @return
     */
    private char[] selectionSort(char[] charArray) {
        for (int i = 0; i < charArray.length; i++) {
            int max = i;
            for (int j = i; j < charArray.length; j++) {
                if (charArray[max] < charArray[j]) max = j;
            }
            swap(charArray, max, i);
        }
        return charArray;
    }

    /**
     * 문자열 정렬 후 뒤집기
     *
     * @param str
     * @return
     */
    private String reverseStr(String str) {
        char[] sol = str.toCharArray();
        Arrays.sort(sol);
        return new StringBuilder(new String(sol)).reverse().toString();
    }

    /**
     * 거품 정렬
     *
     * @param charArray
     * @return
     */
    public char[] bubbleSort(char[] charArray) {
        for (int i = charArray.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (charArray[j] < charArray[j + 1]) {
                    swap(charArray, j, j + 1);
                }
            }
        }
        return charArray;
    }

    /**
     * 교환
     *
     * @param charArray
     * @param index1
     * @param index2
     */
    public void swap(char[] charArray, int index1, int index2) {
        char temp = charArray[index1];
        charArray[index1] = charArray[index2];
        charArray[index2] = temp;
    }
}