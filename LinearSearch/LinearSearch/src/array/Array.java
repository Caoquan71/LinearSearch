
package array;

import java.util.Random;


public class Array {

    private int arr[];

    /**
     * This method create a random array
     *
     * @param arraySize size of array
     */
    public void generate(int arraySize) {
        Random rand = new Random();
        arr = new int[arraySize];
        for (int i = 0; i < arraySize; i++) {
            arr[i] = rand.nextInt(arraySize);
        }
    }

    /**
     * This method is used to display arrays on the screen.
     */
    public void displayArray() {
        System.out.print(" [");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
            if (i < arr.length - 1) {
                System.out.print(", ");
            } else {
                System.out.print("]");
            }
        }
        System.out.println("");
    }
    /**
     * This method display the index of key on the screen
     * 
     * @param key       the value to be searched for
     * @param messInform the message used to Notify users which value of key
     * they are looking for
     */
    public void displayIndex(int key,String messInform) {
        System.out.print(messInform);
        System.out.println(linearSearch(key));
    }

    /**
     * This method uses linear search to return position of the key, if not
     * found key will return -1 value
     *
     * @param  key the value to be searched for
     * @return position of the key ,if not found key will return -1 value
     */
    public int linearSearch(int key) {
        int size = arr.length;
        for (int i = 0; i < size; i++) {
            if (arr[i] == key) {
                return i;
            }
        }
        return -1;

    }
}
