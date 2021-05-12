class Solution {

    public String[] solution(String[] strings, int n) {
        for (int i = 0; i < strings.length; i++) {
            int max = i;
            for (int j = i; j < strings.length; j++) {
                if (strings[max].toCharArray()[n] == strings[j].toCharArray()[n]) {
                    if (strings[max].compareTo(strings[j]) > 0) max = j;
                } else if (strings[max].toCharArray()[n] > strings[j].toCharArray()[n]) {
                    max = j;
                }
            }
            swap(strings, max, i);
        }
        return strings;
    }

    /**
     * 교환하기
     *
     * @param strings
     * @param index1
     * @param index2
     */
    public void swap(String[] strings, int index1, int index2) {
        String temp = strings[index1];
        strings[index1] = strings[index2];
        strings[index2] = temp;
    }
}