



package com.zipcodewilmington;

import java.util.*;

/**
 * Created by leon on 1/29/18.
 */
public class StringArrayUtils {
    /**
     * @param array array of String objects
     * @return first element of specified array
     */ // TODO
    public static String getFirstElement(String[] array) {
        return array[0];
    }

    /**
     * @param array array of String objects
     * @return second element in specified array
     */
    public static String getSecondElement(String[] array) {
        return array[1];
    }

    /**
     * @param array array of String objects
     * @return last element in specified array
     */ // TODO
    public static String getLastElement(String[] array) {

        return array[array.length-1];
    }

    /**
     * @param array array of String objects
     * @return second to last element in specified array
     */ // TODO
    public static String getSecondToLastElement(String[] array) {

        return array[array.length-2];
    }

    /**
     * @param array array of String objects
     * @param value value to check array for
     * @return true if the array contains the specified `value`
     */ // TODO
    public static boolean contains(String[] array, String value) {
        /* //this works as a for loop.  I'd like to try another way
        boolean containsVal = false;

        for (String val : array) {
            if (val.equals(value)) {
                containsVal = true;
            }
        }
        return containsVal;

         */
        return Arrays.asList(array).contains(value);  // 1-liner.  Convert to list and return true if contains value.
    }

    /**
     * @param array of String objects
     * @return an array with identical contents in reverse order
     */ // TODO
    public static String[] reverse(String[] array) {
       /* //longer way.
        List<String> listToReverse = Arrays.asList(array);  // converts Array to List
        Collections.reverse(listToReverse); // reverse list using Collections method

        return listToReverse.toArray(array); //return array converted from list

         */

        /*
        Collections.reverse(Arrays.asList(array));
        return array;   //this method does not work in the palindrome section.  It seems to re-write the original array
        */

        String[] reversedList = new String[array.length];
        int newArrInd = 0;
        for (int i = array.length-1; i>=0; i --){
            reversedList[newArrInd] = array[i];
            newArrInd++;

        }
        return reversedList;
    }

    /**
     * @param array array of String objects
     * @return true if the order of the array is the same backwards and forwards
     */ // TODO
    public static boolean isPalindromic(String[] array) {


        return Arrays.equals(array, reverse(array));
    }

    /**
     * @param array array of String objects
     * @return true if each letter in the alphabet has been used in the array
     */ // TODO
    public static boolean isPangramic(String[] array) {
        String arrToStr = Arrays.toString(array).toLowerCase();  // convert array to lowercase string
        boolean isPangramic = true;

        for (char i ='a'; i <= 'z'; i ++){  //loop through all characters a-z
            if (!arrToStr.contains(String.valueOf(i))) {  //if the string does not contain the char value for each letter
                isPangramic = false;   //it won't be a pangram
            }
        }
        return isPangramic;
    }

    /**
     * @param array array of String objects
     * @param value value to check array for
     * @return number of occurrences the specified `value` has occurred
     */ // TODO
    public static int getNumberOfOccurrences(String[] array, String value) {
        int counter = 0;

        for (String element : array) {
            if (element.equals(value)) {
                counter++;
            }
        }
        return counter;
    }

    /**
     * @param array         array of String objects
     * @param valueToRemove value to remove from array
     * @return array with identical contents excluding values of `value`
     */ // TODO
    public static String[] removeValue(String[] array, String valueToRemove) {
        int newArraySize = (array.length - getNumberOfOccurrences(array, valueToRemove));
        String[] newArray = new String[newArraySize];
        int counter = 0;

        for (int i = 0; i < array.length; i++){
            if (!array[i].equals(valueToRemove)){
                newArray[counter] = array[i];
                counter++;
            }
        }
        return newArray;
    }

    /**
     * @param array array of chars
     * @return array of Strings with consecutive duplicates removes
     */ // TODO
    public static String[] removeConsecutiveDuplicates(String[] array) {

        List<String> newList = new ArrayList<String>();
        newList.add(array[0]);

        for (int i = 1; i<array.length; i++){
            if (!array[i].equals(array[i-1])) {
                newList.add(array[i]);
            }

        }
       String[] newArray = new String[newList.size()];
       return newList.toArray(newArray);
    }

    /**
     * @param array array of chars
     * @return array of Strings with each consecutive duplicate occurrence concatenated as a single string in an array of Strings
     */ // TODO
    public static String[] packConsecutiveDuplicates(String[] array) {
        String[] condensedArray = removeConsecutiveDuplicates(array);
        int counter = 0;
        for (int i=0; i<array.length-1; i++) {
            if (array[i].equals(array[i+1])) {
                condensedArray[counter]+= array[i];
            } else {
                counter++;
            }
        }

        return condensedArray;
    }


}
