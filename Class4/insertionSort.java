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
}

// For explaining compareTo()
// https://www.youtube.com/watch?v=g0_pQCxfgKI&ab_channel=NathanS
