package midtermReview;

import java.util.Scanner;

public class main {
    public static void main(String args[]) {

        // Initializing int array
        // For sorting and searching!
        int[] arr = { 1, 23, 4, 5, 1, 1, 45, 65 };
        int[] newArr = insertionSort(arr);
        for (int i = 0; i < newArr.length; i++) {
            if (i != newArr.length - 1) {
                System.out.print(newArr[i] + ", ");
            } else {
                System.out.print(newArr[i]);
            }
        }

        // For Try and Except Stuff

        // Try block is followed by one or more catch clauses
        // When an exception occurs within the try block processing immediately
        // jumps to the first catch clauses that matches the exception type.

        String code;
        char zone;
        int district, valid = 0, banned = 0;
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter product code (XXX to quit): ");
        code = scan.nextLine();

        while (!code.equals("XXX")) {
            try {
                zone = code.charAt(9);
                district = Integer.parseInt(code.substring(3, 7));
                valid++;
                if (zone == 'R' && district > 2000)
                    banned++;
            } catch (StringIndexOutOfBoundsException exception) { // Catching certain error
                System.out.println("Improper code length: " + code); // If that error is catched, then this is displayed
            } catch (NumberFormatException exception) { // Catching certain error
                System.out.println("District is not numeric: " + code); // If that error is catched, then this
                                                                        // is displayed
            }
            System.out.print("Enter product code (XXX to quit): ");
            code = scan.nextLine();
        }
        System.out.println("# of valid codes entered: " + valid);
        System.out.println("# of banned codes entered: " + banned);

        // A try statement can have an optional finnally clause, which is always
        // exectured
        // If no exception, the statements in the finally clause are exectuted.
        // If an exception is generated, the statements in the finally clause are
        // executed after the
        // statements in the appropriate catchc clause finish.

        // Two types of execptions

        // Checked or unchecked exceptions
        // Checked means the program should explicitly handle the exception when it
        // occurs

        // An unchecked exception does not require explicit handling (Runtime Exception
        // or any of its descendants)

        // VIEW GOOGLE SLIDES FOR ALL EXCEPTIONS FOR CHECKED AND UNCHECKED!!!!!!!!!
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

    public static int[] selectionSort(int[] arr) {
        int min;
        int temp;
        int[] array = { 1, 2, 3, 4, 6, 7 };
        for (int index = 0; index < arr.length - 1; index++) {
            min = index;
            // IGNORE compareTo() function error
            for (int scan = index + 1; scan < array.length; scan++) {
                if (arr[scan].compareTo(arr[min]) < 0) { // For comparing the two values, if the value is ___
                    min = scan; // Found new minimum value;
                }
            }
            temp = array[min]; // Storing minimum value in temporary variable
            arr[min] = array[index]; // Setting index value of new minimum to value of item being swapped
            arr[index] = temp; // Setting minimum to index value of value that was recently swapped.
        }
        return arr;
    }

    public static int binarySearch(int[] arr, Comparable target) {
        int min = 0, max = arr.length, mid = 0;
        boolean found = false;
        while (!found && min <= max) {
            mid = (min + max) / 2;
            if (arr[mid] == target)
                found = true;
            else if (target.compareTo(arr[mid]) < 0)
                max = mid - 1;
            else
                min = mid + 1;
        }
        if (found)
            return arr[mid];
        else
            return null;
    }
}
