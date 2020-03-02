package rocks.zipcode.assessment2.arrays;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * @author leon on 28/11/2018.
 */
public class StringArrayUtils {
    /**
     * @param arrayToBeSpliced - array to be evaluated
     * @param startingIndex    - starting index of array to be spliced
     * @param endingIndex      - ending index of array
     * @return an array with all elements between `startingIndex` and `endingIndex`
     */
    public static String[] getSubArray(String[] arrayToBeSpliced, int startingIndex, int endingIndex) {
        return null;
    }


    /**
     * @param arrayToBeSpliced - array to be evaluated
     * @param startingIndex    - starting index of array to be spliced
     * @return an array all elements between after `startingIndex`
     */
    public static String[] getEndingArray(String[] arrayToBeSpliced, int startingIndex) {

////        return arrayToBeSpliced[1, arrayToBeSpliced.length-1]
//        List<String[]> results = new ArrayList<String[]>();
//        String[] tmp = new String[arrayToBeSpliced.length - startingIndex];
//        for (int i = startingIndex; i < arrayToBeSpliced.length; i++) {
//
//            results.add(tmp);
//        }
//        return tmp;
        String[] subarray = new String[(arrayToBeSpliced.length) - startingIndex];
        if (startingIndex < arrayToBeSpliced.length) {
            for (int i = 0; i < subarray.length; i++) {
                subarray[i] = arrayToBeSpliced[startingIndex + i];
            }
        }
            return subarray;}
        }


