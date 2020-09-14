public class Vowel {
    private static final String WORD = "mommy";

    public String insertMommy(String s) {
        if (s == null) {
            throw new NullPointerException();
        }
        if (s.length() == 0) {
            return "";
        }
        return s;
    }
}
