import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        List<Patient> patients = new ArrayList<>();
        List<Doctor> doctors = new ArrayList<>();

        while(true){
            System.out.println("\nHospital Management System");
            System.out.println("1, Add Patients");
            System.out.println("2, Add Doctors");
            System.out.println("3, Display all details");
            System.out.println("4, Exiting the System");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice){
                case 1 :
                    System.out.print("Enter Patient ID: ");
                    int pid = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Enter Patient Name: ");
                    String name = scanner.nextLine();
                    System.out.print("Enter Patient Age: ");
                    int age = scanner.nextInt();
                    scanner.nextLine(); // Consume newline
                    System.out.print("Enter Patient Contact Number: ");
                    int conNumber = scanner.nextInt();

                    Patient patient = new Patient();
                    patient.setPatientDetails(pid, name, age, conNumber);
                    patients.add(patient);
                    System.out.println("Patient added successfully.");

                    break;

                case 2 :
                    System.out.println("Enter Doctor Id: ");
                    int did = scanner.nextInt();
                    scanner.nextLine();
                    System.out.println("Enter Doctor Name: ");
                    String dname = scanner.nextLine();
                    System.out.print("Enter Specializations (comma-separated): ");
                    String specializationsInput = scanner.nextLine();
                    ArrayList<String> specializations = new ArrayList<>(Arrays.asList(specializationsInput.split(",")));

                    Doctor doctor = new Doctor();
                    doctor.setDoctorDetails(did,dname,specializations);

                    System.out.println("Enter Number of available slots");
                    int numSlots = scanner.nextInt();
                    scanner.nextLine();

                    for(int i = 0; i<numSlots; i++){
                        System.out.print("Enter Slot " + (i + 1) + ": ");
                        String slot = scanner.nextLine();
                        doctor.addSlot(slot);
                    }

                    doctors.add(doctor);
                    System.out.println("Doctor added successfully.");
                    break;

                case 3 :

                    System.out.println("\nPatients:");
                    for (Patient p : patients) {
                        p.displayPatientDetails();
                    }

                    System.out.println("\nDoctors:");
                    for(Doctor d : doctors){
                        d.displayDoctorDetails();
                    }
                    break;

                case 4:
                    System.out.println("Exiting the system. Good Bye... ");
                    scanner.close();
                    System.exit(0);


                default:
                    System.out.println("Invalid choice. Please try again");

            }
        }




    }
}








//Patient p = new Patient(1,"Malith",22,771233233);
////                p.setPatientDetails(2,"Kavi",21,9009309);