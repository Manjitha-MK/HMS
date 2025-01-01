import java.util.ArrayList;

public class Patient {
    private int pid;
    private String name;
    private int age;
    private int conNumber;
    private ArrayList<String> medicalHistory;

//    public Patient(int Pid, String Name, int Age, int ConNumber){
//        this.pid = Pid;
//        this.name = Name;
//        this.age = Age;
//        this.conNumber = ConNumber;
//    }

    public  void setPatientDetails(int pid, String name, int age, int conNumber){
        this.pid = pid;
        this.name = name;
        this.age = age;
        this.conNumber = conNumber;
    }


    public  void addMedicalHistory(String diagnosis, String treatment){
        medicalHistory.add("diagnosis" + diagnosis + "treatment" + treatment);
    }

    public void displayPatientDetails() {
        System.out.println("Patient ID: " + pid);
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Contact Number: " + conNumber);
        System.out.println("Medical History: " + medicalHistory);
    }

    public int getPatientId(){
        return pid;
    }

}
