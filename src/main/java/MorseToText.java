class MorseToText {

    String convert(String spaceSplitMorseWord) {

        StringBuilder translatedMorse = new StringBuilder();
        int splitMorseCharactersLength = spaceSplitMorseWord.split(" ").length;
        String[] spaceSplitMorseLetters = spaceSplitMorseWord.split(" ");
        for (int i = 0; i < splitMorseCharactersLength; i++) {

            if (".-".equals(spaceSplitMorseLetters[i])) {
                translatedMorse.append("a");

            } else if ("-...".equals(spaceSplitMorseLetters[i])) {
                translatedMorse.append("b");

            } else if ("-.-.".equals(spaceSplitMorseLetters[i])) {
                translatedMorse.append("c");

            } else if ("-..".equals(spaceSplitMorseLetters[i])) {
                translatedMorse.append("d");

            } else if (".".equals(spaceSplitMorseLetters[i])) {
                translatedMorse.append("e");

            } else if ("..-.".equals(spaceSplitMorseLetters[i])) {
                translatedMorse.append("f");

            } else if ("--.".equals(spaceSplitMorseLetters[i])) {
                translatedMorse.append("g");

            } else if ("....".equals(spaceSplitMorseLetters[i])) {
                translatedMorse.append("h");

            } else if ("..".equals(spaceSplitMorseLetters[i])) {
                translatedMorse.append("i");

            } else if (".---".equals(spaceSplitMorseLetters[i])) {
                translatedMorse.append("j");

            } else if ("-.-".equals(spaceSplitMorseLetters[i])) {
                translatedMorse.append("k");

            } else if (".-..".equals(spaceSplitMorseLetters[i])) {
                translatedMorse.append("l");

            } else if ("--".equals(spaceSplitMorseLetters[i])) {
                translatedMorse.append("m");

            } else if ("-.".equals(spaceSplitMorseLetters[i])) {
                translatedMorse.append("n");

            } else if ("---".equals(spaceSplitMorseLetters[i])) {
                translatedMorse.append("o");

            } else if (".--.".equals(spaceSplitMorseLetters[i])) {
                translatedMorse.append("p");

            } else if ("--.-".equals(spaceSplitMorseLetters[i])) {
                translatedMorse.append("q");

            } else if (".-.".equals(spaceSplitMorseLetters[i])) {
                translatedMorse.append("r");

            } else if ("...".equals(spaceSplitMorseLetters[i])) {
                translatedMorse.append("s");

            } else if ("-".equals(spaceSplitMorseLetters[i])) {
                translatedMorse.append("t");

            } else if ("..-".equals(spaceSplitMorseLetters[i])) {
                translatedMorse.append("u");

            } else if ("...-".equals(spaceSplitMorseLetters[i])) {
                translatedMorse.append("v");

            } else if (".--".equals(spaceSplitMorseLetters[i])) {
                translatedMorse.append("w");

            } else if ("-..-".equals(spaceSplitMorseLetters[i])) {
                translatedMorse.append("x");

            } else if ("-.--".equals(spaceSplitMorseLetters[i])) {
                translatedMorse.append("y");

            } else if ("--..".equals(spaceSplitMorseLetters[i])) {
                translatedMorse.append("z");
            } else if (".-.-.-".equals(spaceSplitMorseLetters[i])) {
                translatedMorse.append(".");
            }
        }

        return translatedMorse.toString();

    }
}