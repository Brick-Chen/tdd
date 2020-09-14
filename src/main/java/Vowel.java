public class Vowel {
    private static final String WORD = "mommy";
    private static final double RATIO = 0.3;

    public String insertMommy(String s) {
        if (s == null) {
            throw new NullPointerException();
        }
        if (s.length() == 0) {
            return "";
        }
        int pos;
        if (!vowelRatioValid(s) || (pos = indexOfContinueVowel(s)) == -1) {
            return s;
        }
        StringBuilder builder = new StringBuilder(s);
        builder.insert(pos, WORD);
        return insertMommy(builder.toString());
    }

    /**
     * check whether the total number of vowels(a e i o u)
     * count more than 30% of the length of string
     * @param s String
     * @return ture or false
     */
    private boolean vowelRatioValid(String s) {
        double cnt = 0;
        for(int i = 0; i < s.length(); ++i) {
            char c = s.charAt(i);
            if (isVowel(Character.toLowerCase(c))) {
                cnt += 1;
            }
        }
        return cnt / s.length() > RATIO;
    }

    /**
     * check whether a character is vowel(a e i o u)
     * @param c character
     * @return true or false
     */
    private boolean isVowel(char c) {
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c =='u';
    }

    /**
     * return first index of continuous vowels appear
     * @param s string
     * @return first index of continuous vowels appear
     * if no continuous vowel, return -1
     */
    private int indexOfContinueVowel(String s) {
        int prev = -1;
        for(int i = 0; i < s.length(); ++i) {
            char c = s.charAt(i);
            if (Character.isLetter(c) && isVowel(Character.toLowerCase(c))) {
                if (i != 0 && c == Character.toLowerCase(s.charAt(i - 1))) {
                    prev = i - 1;
                    break;
                }
            }
        }
        return prev;
    }
}
