package main;

import array.Array;
import validate.Validator;

public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Array array = new Array();
        int number = Validator.getInt("Enter number of array:",
                "Error range(number>0)", "Invalid",
                1, Integer.MAX_VALUE);
        array.generate(number);
        int key = Validator.getInt("Enter search value:",
                "Error range", "Invalid",
                Integer.MIN_VALUE, Integer.MAX_VALUE);
        System.out.print("The array: ");
        array.displayArray();
        array.displayIndex(key,"Found " +key+ " at index: ");
    }

}
