package Class4;

public class main2 {
    // Linear Search is very simple
    // Doesn't need to be sorted to use
    // Go through the data structure one by one using a for loop for(int i = 0; i <
    // array.length; i++){}

    // BINARY SEARCH - REMEMBER PYTHON -- SPLITTING INTO HALVES
    // Assumes the the array is sorted
    public static void main(String args[]) {
        int[] array = { 1, 2, 3, 4, 6, 7 };
        int min = 0;
        int max = array.length;
        int midpoint = 0;
        boolean found = false;
        int target = 5;
        while (!found && min <= max) {
            midpoint = (min + max) / 2;
            if (array[midpoint] == target) {
                found = true;
            } else {
                if (array[midpoint] > target) {
                    midpoint = max - 1;
                } else {
                    midpoint = min + 1;
                }
            }
            if (found) {
                // return midpoint;
            } else {
                // return null;
            }
        }
    }
}