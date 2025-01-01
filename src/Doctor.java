import java.util.ArrayList;

public class Doctor {
    private int did;
    private String dname;
    private ArrayList<String> specializations;
    private ArrayList<String> availableSlots;

    public Doctor(){
        specializations = new ArrayList<>();
        availableSlots = new ArrayList<>();
    }

    public void setDoctorDetails(int did,String dname,  ArrayList<String> specializations){
        this.did = did;
        this.dname = dname;
        this.specializations = specializations;
    }

    public void addSlot(String slots){
        availableSlots.add(slots);
    }

    public void removeSlot(String slots){
        availableSlots.remove(slots);
    }

    public void displayDoctorDetails(){
        System.out.println("Enter Doctor Id: " +did);
        System.out.println("Enter Doctor Name: " +dname);
        System.out.println("Specializations: " +specializations);
        System.out.println("Available Slots: " +availableSlots);
    }

    public int getDid(){
        return did;
    }

    public ArrayList<String> getAvailableSlots() {
        return availableSlots;
    }


}


