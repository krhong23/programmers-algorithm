class Solution {

    /**
     * 해결 1안
     *
     * @param s
     * @return
     */
    public String solution01(String s) {
        return String.valueOf(selectionSort(s.toCharArray()));
    }

    /**
     * 선택 정렬
     *
     * @param array
     * @return
     */
    private char[] selectionSort(char[] array) {
        for (int i = 0; i < array.length; i++) {
            int max = i;
            for (int j = i; j < array.length; j++) {
                if (array[max] < array[j]) max = j;
            }
            char temp = array[max];
            array[max] = array[i];
            array[i] = temp;
        }
        return array;
    }
}