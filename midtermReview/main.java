package midtermReview;

public class main {
    public static void main(String args[]) {

        // Initializing int array
        int[] arr = { 1, 23, 4, 5, 1, 1, 45, 65 };
        System.out.println(insertionSort(arr));
        selectionSort(arr);

    }

    public static int[] insertionSort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int temp = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > temp) { // Compares item to the left -- if item on left is greater than item
                                              // onright, then swap them
                arr[j + 1] = arr[j]; // swapping them
                j--; // subtracting to not repeat swapping/ runtime
            }
            arr[j + 1] = temp; // original value that was being moved
        }
        return arr;
    }

    public static void selectionSort(int[] arr) {

    }
}
