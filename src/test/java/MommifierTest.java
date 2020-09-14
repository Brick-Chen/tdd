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

    @Test
    public void should_return_original_string_when_continuous_vowel_not_exist() {
        Vowel vowel= new Vowel();
        String noContinuousVowel = "rat";
        String ans = vowel.insertMommy(noContinuousVowel);
        Assertions.assertEquals(noContinuousVowel, ans);
    }

    @Test
    public void should_return_new_string_insert_with_mommy() {
        Vowel vowel = new Vowel();
        String validString = "aaa";
        String ans = vowel.insertMommy(validString);
        Assertions.assertEquals("amommyamommya", ans);
    }
}
