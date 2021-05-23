class Solution002 {

    /**
     * 해결 1안
     *
     * @param phone_number
     * @return String
     */
    public String solution01(String phone_number) {
        char[] ch = phone_number.toCharArray();
        for (int i = 0; i < ch.length - 4; i++) {
            ch[i] = '*';
        }
        return String.valueOf(ch);
    }

    /**
     * 해결 2안
     *
     * @param phone_number
     * @return String
     */
    public String solution02(String phone_number) {
        return phone_number.substring(0, phone_number.length() - 4).replaceAll("[0-9]", "*")
                + phone_number.substring(phone_number.length() - 4);
    }
}
