import java.util.HashSet; // Make sure to import correct util
public class hashset {
    public static void main(String args[]){
       HashSet<String> names = new HashSet<String>();
    names.add("Cade");
    names.add("Dan");
    names.add("Evan");
    names.add("Sebastian");
    System.out.println(names.contains("Cade"));
    names.remove("Cade");
    names.clear();
    names.size(); 
    }
}
