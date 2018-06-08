class TextToMorse {

    String convert(String spaceSplitWord) {

        StringBuilder translatedText = new StringBuilder();
        for (int i = 0; i < spaceSplitWord.length(); i++) {

            switch (spaceSplitWord.toLowerCase().charAt(i)) {
                case 'a':
                    translatedText.append(".- ");
                    break;
                case 'b':
                    translatedText.append("-... ");
                    break;
                case 'c':
                    translatedText.append("-.-. ");
                    break;

                case 'd':
                    translatedText.append("-.. ");
                    break;

                case 'e':
                    translatedText.append(". ");
                    break;

                case 'f':
                    translatedText.append("..-. ");
                    break;

                case 'g':
                    translatedText.append("--. ");
                    break;

                case 'h':
                    translatedText.append(".... ");
                    break;

                case 'i':
                    translatedText.append(".. ");
                    break;

                case 'j':
                    translatedText.append(".--- ");
                    break;

                case 'k':
                    translatedText.append("-.- ");
                    break;

                case 'l':
                    translatedText.append(".-.. ");
                    break;

                case 'm':
                    translatedText.append("-- ");
                    break;

                case 'n':
                    translatedText.append("-. ");
                    break;

                case 'o':
                    translatedText.append("--- ");
                    break;

                case 'p':
                    translatedText.append(".--. ");
                    break;

                case 'q':
                    translatedText.append("--.- ");
                    break;

                case 'r':
                    translatedText.append(".-. ");
                    break;

                case 's':
                    translatedText.append("... ");
                    break;

                case 't':
                    translatedText.append("- ");
                    break;

                case 'u':
                    translatedText.append("..- ");
                    break;

                case 'v':
                    translatedText.append("...- ");
                    break;

                case 'w':
                    translatedText.append(".-- ");
                    break;

                case 'x':
                    translatedText.append("-..- ");
                    break;

                case 'y':
                    translatedText.append("-.-- ");
                    break;

                case 'z':
                    translatedText.append("--.. ");
                    break;
                case '.':
                    translatedText.append(".-.-.-");

                default:
                    break;
            }
        }

        return translatedText.toString();
    }
}