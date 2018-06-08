class InputConverter {

    String run(boolean morseToEnglish, String input) {

        if (morseToEnglish) {
            StringBuilder morseToEnglishText = new StringBuilder();
            MorseToText morseToText = new MorseToText();
            int splitMorseLength = input.split(" {3}").length;
            String[] convertedText = new String[splitMorseLength];
            String[] spaceSplitMorseWords = input.split(" {3}");

            for (int i = 0; i < splitMorseLength; i++) {

                convertedText[i] = morseToText.convert(spaceSplitMorseWords[i]);

                if (i == 0) {
                    convertedText[i] = morseToText.convert(spaceSplitMorseWords[i]).substring(0, 1).toUpperCase()
                            + morseToText.convert(spaceSplitMorseWords[i]).substring(1);
                }
                if (i == splitMorseLength - 1)
                    morseToEnglishText.append(convertedText[i]);
                else morseToEnglishText.append(convertedText[i]).append(" ");

            }
            System.out.println(morseToEnglishText);
            return morseToEnglishText.toString();

        } else {

            StringBuilder englishToMorse = new StringBuilder();
            TextToMorse textToMorse = new TextToMorse();
            int splitTextLength = input.split(" ").length;

            String[] convertedText = new String[splitTextLength];
            String[] spaceSplitWords = input.split(" ");

            for (int i = 0; i < splitTextLength; i++) {
                convertedText[i] = textToMorse.convert(spaceSplitWords[i]);
                if (i == splitTextLength - 1)
                    englishToMorse.append(convertedText[i]);
                else
                    englishToMorse.append(convertedText[i]).append("  ");
            }
            System.out.println(englishToMorse);
            return englishToMorse.toString();
        }
    }
}