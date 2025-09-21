/*Create a Student class to manage student data with the following features:
Static:
○       A static variable universityName shared across all students.
○       A static method displayTotalStudents() to show the number of students enrolled.
This:
○       Use this in the constructor to initialize name, rollNumber, and grade.
Final:
○       Use a final variable rollNumber for each student that cannot be changed.
Instanceof:
○       Check if a given object is an instance of the Student class before performing operations like displaying or updating grades.

*/

public class Student {
    static String universityName = "Chitkara University";
    String name;
    final int rollNumber;
    String grade;
    static int totalStudents = 0;

    Student(String name, int rollNumber, String grade) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.grade = grade;
        totalStudents++;
    }

    void displayStudentDetails() {
        if (this instanceof Student) {
            System.out.println("Name of University : " + universityName);
            System.out.println("Name of student : " + name);
            System.out.println("Roll number of student : " + rollNumber);
            System.out.println("Grade of Student : " + grade);
        }
    }

    static void displayTotalStudents() {
        System.out.println("Total number of students : " + totalStudents);
    }

    public static void main(String args[]) {
        Student s1 = new Student("Kamal", 19, "A");
        Student s2 = new Student("Navya", 12, "C");

        s1.displayStudentDetails();
        s2.displayStudentDetails();

        Student.displayTotalStudents();

    }

}
