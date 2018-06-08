public class Main {


    public static void main(String[] args) {


        String text = "The wizard quickly jinxed the gnomes before they vaporized.";
        String morse = "- .... .   .-- .. --.. .- .-. -..   --.- ..- .. -.-. -.- .-.. -.--   .--- .. -. -..- . -..   - .... .   --. -. --- -- . ...   -... . ..-. --- .-. .   - .... . -.--   ...- .- .--. --- .-. .. --.. . -.. .-.-.-";

        InputConverter inputConverter = new InputConverter();

        inputConverter.run(true, morse);
        inputConverter.run(false, text);


    }

}


