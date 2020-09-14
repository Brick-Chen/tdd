import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MommifierTest {
    @Test
    public void should_throw_null_exception_when_string_is_null() throws NullPointerException{
        Assertions.assertThrows(NullPointerException.class, ()->{
            Vowel vowel = new Vowel();
            vowel.insertMommy(null);
        });
    }
}
