
// NOTES FOR CLASSES AND OBJECTS
public class classes {
    public static void main(String[] args) {
        Student student1 = new Student(); // Creating an object
        // below is assigning values to student 'Cade' otherwise it would be null
        student1.grade = 100;
        student1.GPA = 4.0;
        student1.name = "Cade";
        System.out.println(
                student1.name + " has a " + student1.grade + " in this class and has a " + student1.GPA + " GPA");

        Student student2 = new Student(20, 1.4, "Dan");
        System.out.println(
                student2.name + " has a " + student2.grade + " in this class and has a " + student2.GPA + " GPA");
    }
}

class Student {
    // below are instances variables
    int grade;
    double GPA;
    String name;

    Student() {
    }

    Student(int studentGrade, double studentGPA, String studentName) {
        grade = studentGrade;
        GPA = studentGPA;
        name = studentName;
    }
}
