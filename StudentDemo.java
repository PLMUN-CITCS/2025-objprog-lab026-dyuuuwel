// Student class demonstrating object-oriented concepts
class Student {
    // Private instance variables (Encapsulation)
    private String name;
    private int id;
    private double gpa;

    // Static variable to track the number of students created
    private static int studentCount = 0;

    // Constructor to initialize student attributes
    public Student(String name, int id, double gpa) {
        this.name = name;
        this.id = id;
        this.gpa = gpa;
        studentCount++; // Increment student count when a new student is created
    }

    // Instance method to display student details
    public void displayStudentInfo() {
        System.out.println("Student ID: " + id + ", Name: " + name + ", GPA: " + gpa);
    }

    // Static method to display total student count
    public static void displayStudentCount() {
        System.out.println("Total students: " + studentCount);
    }
}

// Main class containing the main method
public class StudentDemo {
    public static void main(String[] args) {
        // Creating student objects
        Student student1 = new Student("Alice", 101, 3.8);
        Student student2 = new Student("Bob", 102, 3.5);
        Student student3 = new Student("Charlie", 103, 3.9);

        // Displaying student details
        student1.displayStudentInfo();
        student2.displayStudentInfo();
        student3.displayStudentInfo();

        // Displaying total number of students using static method
        Student.displayStudentCount();
    }
}
