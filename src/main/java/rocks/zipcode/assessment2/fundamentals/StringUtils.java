package rocks.zipcode.assessment2.fundamentals;

/**
 * @author leon on 28/11/2018.
 */
public class StringUtils {
    /**
     * @param stringToBePadded - string value to be flushed right
     * @param amountOfPadding - amount of padding to be flushed left
     * @return `stringToBePadded` flushed right by left-padding
     */
    public static String padLeft(String stringToBePadded, int amountOfPadding) {
        String newString = StringUtils.padLeft(stringToBePadded, amountOfPadding);
return newString;
    }

    /**
     * @param stringToBePadded - string value to be flushed left
     * @param amountOfPadding - amount of padding to be flushed right
     * @return `stringToBePadded` flushed right by right-padding
     */
    public static String padRight(String stringToBePadded, int amountOfPadding) {
        return null;
    }

    /**
     * @param stringToBeRepeated - string value to be repeated
     * @param numberOfTimeToRepeat - number of times to repeat `stringToBeRepeated`
     * @return the string repeated and concatenated `n` times
     */
    public static String repeatString(String stringToBeRepeated, int numberOfTimeToRepeat) {
String outputString  = "";
        for (int i = 1; i <= numberOfTimeToRepeat; i++)
          outputString += stringToBeRepeated;
        return outputString;
    }

    /**
     * @param string - string to be evaluated
     * @return - true if string only contains alpha characters
     */
    public static Boolean isAlphaString(String string) {
        char[] chars = string.toCharArray();

        for (char c : chars) {
            if (!Character.isLetter(c) && !Character.isSpaceChar(c)){
                return false;
        }
    }
            return true;
        }

    /**
     * @param string - string to be evaluated
     * @return - true if string only contains numeric characters
     */
    public static Boolean isNumericString(String string) {
            char[] chars = string.toCharArray();

            for (char c : chars) {
                if (!Character.isDigit(c)) {
                    return false;
                }
            }
            return true;
    }

    /**
     * @param string - string to be evaluated
     * @return - true if string only contains special characters
     */
    public static Boolean isSpecialCharacterString(String string) {
        char[] chars = string.toCharArray();

        for (char c : chars) {
            if (Character.isLetterOrDigit(c)) {
                return false;
            }
        }
        return true;
    }
    }
