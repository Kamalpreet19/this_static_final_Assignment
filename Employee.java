/*Design an Employee class with the following features:
Static:
○       A static variable companyName shared by all employees.
○       A static method displayTotalEmployees() to show the total number of employees.
This:
○       Use this to initialize name, id, and designation in the constructor.
Final:
○       Use a final variable id for the employee ID, which cannot be modified after assignment.
Instanceof
○       Check if a given object is an instance of the Employee class before printing the employee details.
 */

public class Employee {
    static String companyName = "Infosys";
    String name;
    final int id;
    String designation;
    int totalEmployees = 0;

    Employee(String name, int id, String designation) {
        this.name = name;
        this.id = id;
        this.designation = designation;
        totalEmployees++;

    }

    void displayEmployeeDetails() {
        if (this instanceof Employee) {
            System.out.println("Name of the company : " + companyName + "\nName of the employee : " + name
                    + "\nId of the employee : " + id + "\nDesignation of the employee : " + designation);
        } else {
            System.out.println("Invalid id");
        }

    }

    static void displayTotalEmployees() {
        System.out.println("Name of the company : " + companyName);
    }

    public static void main(String args[]) {
        Employee e1 = new Employee("Kamalpreet", 11, "Senior Manager");
        Employee e2 = new Employee("Naina", 11, "Sales Manager");
        e1.displayEmployeeDetails();
        e2.displayEmployeeDetails();
        Employee.displayTotalEmployees();

    }

}
