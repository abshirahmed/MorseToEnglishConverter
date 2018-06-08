import org.junit.Test;

import static org.junit.Assert.*;

public class InputConverterTest {

    @Test
    public void run() {
        InputConverter inputConverter = new InputConverter();
        String text = "The wizard quickly jinxed the gnomes before they vaporized.";
        String morse = "- .... .   .-- .. --.. .- .-. -..   --.- ..- .. -.-. -.- .-.. -.--   .--- .. -. -..- . -..   - .... .   --. -. --- -- . ...   -... . ..-. --- .-. .   - .... . -.--   ...- .- .--. --- .-. .. --.. . -.. .-.-.-";

        assertEquals(text, inputConverter.run(true, morse));
        assertEquals(morse, inputConverter.run(false, text));

    }
}