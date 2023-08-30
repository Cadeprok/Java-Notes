// NOTES FOR ARRAYS AND ARRAYLISTS
import java.util.ArrayList; // is needed to use ArrayLists
public class array {
    public static void main (String[] args){
        // BELOW ARE NOTES FOR ARRAYS
        String[] students = {"Cade", "Evan", "Dan", "Sebastian"}; // "String[]"" is type of array, "students" is name of array

        System.out.println(students.length); //  Arrays only use .length
        System.out.print(students[0]); // Prints index 0
        for(int i = 0; i < students.length; i++){
            System.out.print(students[i]); // Prints index i
        }
        
        // BELOW ARE NOTES FOR ARRAYLISTS
        // See import at top
        ArrayList<String> cars = new ArrayList<String>(); // Creates ArrayList object
        cars.add("Kia"); // Adds element to ArrayList
        cars.add("Toyota");
        cars.add("BMW");

        System.out.println(cars);
        String temp = cars.get(0); // retrieves value of index 0 in arraylist
        System.out.println(temp); 
        
        for(int i = 0; i < cars.size(); i++){
            System.out.print(cars.get(i)); // Prints index i
        }
        // ArrayList also has a .sort method -- view online 
    }
}
