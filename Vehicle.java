/*Create a Vehicle class with the following features:
Static:
○       A static variable registrationFee common for all vehicles.
○       A static method updateRegistrationFee() to modify the fee.
This:
○       Use this to initialize ownerName, vehicleType, and registrationNumber in the constructor.
Final:
○       Use a final variable registrationNumber to uniquely identify each vehicle.
Instanceof:
○       Check if an object belongs to the Vehicle class before displaying its registration
○       details.
 */
public class Vehicle {
    static double registrationFee=1500;
    String ownerName;
    String vehicleType;
    final int registrationNumber;

    Vehicle(String ownerName, String vehicleType, int registrationNumber){
        this.ownerName=ownerName;
        this.vehicleType=vehicleType;
        this.registrationNumber=registrationNumber;
    }

    void displayVehicleDetails(){
        if(this instanceof Vehicle){
            System.out.println("Registration fee : " + registrationFee);
            System.out.println("Name of the owner : " + ownerName);
            System.out.println("Type of vehicle : " + vehicleType);
            System.out.println("Registration Number : " + registrationNumber);
        }
    }



    static void updateRegistrationFee(int newRegistrationFee){
        registrationFee=newRegistrationFee;
        System.out.println("Updated registration fee : " + newRegistrationFee);


    }
    public static void main(String args[]){
        Vehicle v1=new Vehicle("Kamal", "Activa", 121);
        Vehicle v2=new Vehicle("Tavu", "Cycle", 110);

        v1.displayVehicleDetails();
        v2.displayVehicleDetails();

        updateRegistrationFee(1000);
        System.out.println("New fee updated!");

    }
    
}
