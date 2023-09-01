// HashMaps are essentially Javas version of Dictionaries (Python)
// It is necessary to use the correct import. 
import java.util.HashMap;
public class hashmap {
    public static void main(String args[]){
        HashMap<String, Integer> students = new HashMap<String, Integer>();
        students.put("Cade", 4);
        students.put("Daniel", 1);
        System.out.println(students);

        students.get("Cade"); // Gets valued associated with Key: "Cade"
        students.clear(); // clears all values in HashMap
        students.size(); // Gets # of Keys ---- [0 to size()-1]

        // FOR EACH STATEMENT IS OFTEN USED. 
        students.keySet(); // To only get key
        students.values(); // To only get value
    }
}
