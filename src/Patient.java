import java.util.ArrayList;

public class Patient {
    private int pid;
    private String name;
    private int age;
    private int conNumber;
    private ArrayList<String> medicalHistory;

    public Patient(int Pid, String Name, int Age, int ConNumber){
        this.pid = Pid;
        this.name = Name;
        this.age = Age;
        this.conNumber = ConNumber;
    }

    public  void setPatientDetails(int pid, String name, int age, int conNumber){
        this.pid = pid;
        this.name = name;
        this.age = age;
        this.conNumber = conNumber;
    }
    public void run(){
        System.out.println("Name : " + name +" ID: " + pid + " Age : " + age + " Contact : " + conNumber);
    }

//    public void setName(String name) {
//        this.name = name;
//    }

    public  void addMedicalHistory(String diagnosis, String treatment){

    }

}
