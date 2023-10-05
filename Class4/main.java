package Class4;

import java.util.Scanner;

// NOTES FOR TRY AND CATCH 
// NOTES FOR SORTING
public class main {
    public static void main(String args[]) {
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
            } catch (StringIndexOutOfBoundsException exception) {
                System.out.println("Improper code length: " + code);
            } catch (NumberFormatException exception) {
                System.out.println("District is not numeric: " + code);
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
}
