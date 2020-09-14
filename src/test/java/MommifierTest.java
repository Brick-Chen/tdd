import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MommifierTest {
    @Test
    public void should_throw_null_exception_when_string_is_null(){
        Assertions.assertThrows(NullPointerException.class, ()->{
            Vowel vowel = new Vowel();
            vowel.insertMommy(null);
        });
    }

    @Test
    public void should_return_empty_string_when_string_is_empty() {
        Vowel vowel = new Vowel();
        String emptyString = "";
        String ans = vowel.insertMommy(emptyString);
        Assertions.assertEquals("", ans);
    }

    @Test
    public void should_return_original_string_when_number_of_vowels_below_30_percent() {
        Vowel vowel = new Vowel();
        String vowelBelow30Percent = "pHiLIPs";
        String ans = vowel.insertMommy(vowelBelow30Percent);
        Assertions.assertEquals(vowelBelow30Percent, ans);
    }
}
