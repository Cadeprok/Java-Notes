package Class4;

public class insertionSort {
    public static void main(String args[]) {
        int[] array = { 1, 2, 3, 4, 6, 7 };
        for (int index = 0; index < array.length; index++) {
            Comparable key = array[index];
            int position = index;
            // Shifting larger values to the right
            while (position > 0 && key.compareTo(array[position - 1]) < 0) {
                array[position] = array[position - 1];
                position--;
            }
            array[position] = key; // Why giving error?
        }
        // return array;
    }

    public int[] insertionSort(int[] array) {
        for (int i = 1; i < array.length; i++) {
            int temp = array[i];
            int j = i - 1;
            while (j >= 0 && array[j] > temp) { // Compares item to the left -- if item on left is greater than item on
                                                // right, then swap them
                array[j + 1] = array[j]; // swapping them
                j--; // subtracting to not repeat swapping/ runtime
            }
            array[j + 1] = temp; // original value that was being moved
        }
        return array;
    }
}

// For explaining compareTo()
// https://www.youtube.com/watch?v=g0_pQCxfgKI&ab_channel=NathanS
