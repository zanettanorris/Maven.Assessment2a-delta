package rocks.zipcode.assessment2.fundamentals;

public class BasicStringUtils {
    /**
     * @param string1 - Base string to be added to
     * @param string2 - String to add to `string1`
     * @return concatenation of `string1` and `string2`
     */
    public static String concatentate(String string1, String string2) {
        String output = "";
        output = string1 + string2;
        return output;
    }

    /**
     * @param string1 - String to be reversed
     * @return an identical string with characters in reverse order
     */
    public static String reverse(String string1) {
        String output = "";
        for (int i = string1.length() - 1; i >= 0; i--) {
            output = output + string1.charAt(i);
        }
        return output;
    }


    /**
     * @param string1 - first string to be reversed
     * @param string2 - second string to be reversed
     * @return concatenation of the reverse of `string1` and reverse of `string2`
     */
    public static String reverseThenConcatenate(String string1, String string2) {

        String reverse1 = "";
        for (int i = string1.length() - 1; i >= 0; i--) {
            reverse1 = reverse1 + string1.charAt(i);
        }

        String reverse2 = "";
        for (int j = string2.length() - 1; j >= 0; j--) {
            reverse2 = reverse2 + string2.charAt(j);
        }

        String output = concatentate(reverse1, reverse2);
        return output;

    }

    /**
     * @param string             - the string to be manipulated
     * @param charactersToRemove - Characters that should be removed from `string`
     * @return `string` with `charactersToRemove` removed
     */
    public static String removeCharacters(String string, String charactersToRemove) {
        StringBuilder sb = new StringBuilder();

        char[] charsToRemove = charactersToRemove.toCharArray();
        char[] baseStringChars = string.toCharArray();

        for (int i = 0; i < charsToRemove.length; i++) {
            for (int j = 0; j < baseStringChars.length; j++) {
                if (baseStringChars[j] == charsToRemove[i]) {
                }
            }
        }
            return sb.toString();
        }

        /**
         * @param string - the string to be manipulated
         * @param charactersToRemove - characters to be removed from the string
         * @return reverse of `string` with `charactersToRemove` removed
         */
        public static String removeCharactersThenReverse (String string, String charactersToRemove){

            return null;
        }
    }
