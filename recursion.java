import java.util.Scanner;

// THIS NOTES PAGE COVERS RECURSION -- IF NEEDED REVIEW SCANNER ON W3SCHOOLS (https://www.w3schools.com/java/java_user_input.asp)
public class recursion {
    public static void main(String[] args) {
        System.out.println("FIRST EXAMPLE: ");
        int result = calculate(10);
        System.out.println("The result is " + result + "!");

        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println("SECOND EXAMPLE");
        System.out.println("NEW CHALLENGE: CREATE A FUNCTION THAT CALCULATES THE FACTORIAL OF ANY NUMBER GIVEN.");
        System.out.println();
        System.out.println();
        Scanner userInput = new Scanner(System.in);
        boolean temp = true;
        while (temp) {
            System.out.println(
                    "Please enter a number you would like to find the factorial of. Please do not enter a number less than or equal to 1");
            String theInput = userInput.nextLine();
            if (Integer.parseInt(theInput) >= 1) { // Integer.parseInt(String temp) takes in a String and converts it to
                                                   // an int. If help is needed, view this webpage:
                                                   // https://stackoverflow.com/questions/5585779/how-do-i-convert-a-string-to-an-int-in-java
                int factorialCalculated = calculateFactorial(Integer.parseInt(theInput), Integer.parseInt(theInput));
                System.out.println(factorialCalculated);
                temp = false;
            } else {
                temp = true;
            }
        }
        userInput.close(); // Closes Scanner "userInput" to prevent memory leaks. More information about
                           // this can be viewed here:
                           // https://www.tutorialspoint.com/java/util/scanner_close.htm#:~:text=The%20java.,()%20method%20closes%20this%20scanner.

    }

    static int calculate(int input) {
        if (input > 0) {
            System.out.println(input);
            return calculate(input - 1); // Calls calculate function until input <= 0
        } else {
            return 1000; // Once the input is <= 0, then it'll return 1000.
        }
    }

    // SEE NEXT FUNCTION FOR A MORE COMPLICATED AND REALISTIC PROBLEM.

    // TASK: CREATE A FUNCTION THAT CALCULATES THE FACTORIAL OF ANY NUMBER GIVEN.

    static int calculateFactorial(int userInput, int placeHolder) {
        while (placeHolder > 1) {
            userInput = userInput * (placeHolder - 1);
            placeHolder--;
            return calculateFactorial(userInput, placeHolder);
        }
        return userInput;
    }
}
