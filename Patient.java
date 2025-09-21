/*Create a Patient class with the following features:
Static:
○       A static variable hospitalName shared among all patients.
○       A static method getTotalPatients() to count the total patients admitted.
This:
○       Use this to initialize name, age, and ailment in the constructor.
Final:
○       Use a final variable patientID to uniquely identify each patient.
Instanceof:
○       Check if an object is an instance of the Patient class before displaying its details.
 */
public class Patient {
    static String hospitalName="Neelam Hospital";
    static int totalPatients=0;
    String name;
    int age;
    String ailment;
    final int patientID;

    Patient(String name, int age, String ailment, int patientID){
        this.name=name;
        this.age=age;
        this.ailment=ailment;
        this.patientID=patientID;
        totalPatients++;
    }

    void displayPatientDetails(){
        if(this instanceof Patient){
        System.out.println("Hospital Name : " + hospitalName);
        System.out.println("Patient Name : " + name);
        System.out.println("Patient Age : " + age);
        System.out.println("Patient ailment : " + ailment);
        System.out.println("Patient Id : " + patientID);
    }
}

    static void getTotalPatients(){
        System.out.println("Total number of patients : " + totalPatients);

    }

    public static void main(String args[]){
        Patient p1=new Patient("Renu", 20, "Fever", 19);
        Patient p2=new Patient("Tiya", 19, "Cough", 10);
        
        p1.displayPatientDetails();
        p2.displayPatientDetails();

        Patient.getTotalPatients();
    }
    
}
