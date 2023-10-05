package Class4;

public class selectionSort {
    public static void main(String args[]) {
        // For swapping the values of the first and second
        // temp = first;
        // first = second;
        // second = temp;

        // Swapping array values at positions i and j
        // temp = a[i]
        // a[i] = a[j]
        // a[j] = temp;

        int min;
        Comparable temp;
        int[] array = { 1, 2, 3, 4, 6, 7 };
        for (int index = 0; index < array.length - 1; index++) {
            min = index;
            // IGNORE compareTo() function error
            for (int scan = index + 1; scan < array.length; scan++) {
                if (array[scan].compareTo(array[min]) < 0) { // For comparing the two values, if the value is ___
                    min = scan; // Found new minimum value;
                }
            }
            temp = array[min]; // Storing minimum value in temporary variable
            array[min] = array[index]; // Setting index value of new minimum to value of item being swapped
            array[index] = temp; // Setting minimum to index value of value that was recently swapped.
        }

    // WHAT DOES COMPARETO() METHOD DO?
    //

    // This would be in a class
    // For example:
    // public class Contact implements Comparable
    // So when you do array[scan].compareTo(array[min]
    // You are comparing contact1 (array[scan]) to contact2 (array[min])
    // There are errors because I dont feel like typing out all of the code
    public int compareTo() {
        // Returns a positive integer if string1 is lexicographically greater than
        // string2
        // Returns a negative if string2 is greater than string1, and zero if both are
        // equal.
        return 1;
    }

    // For explaining compareTo()
    // https://www.youtube.com/watch?v=g0_pQCxfgKI&ab_channel=NathanS

    
    
    

    

    


   




