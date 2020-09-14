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
        if (!vowelRatioValid(s)) {
            return s;
        }
        return "";
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
            if (Character.isLetter(c) && isVowel(Character.toLowerCase(c))) {
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
}
