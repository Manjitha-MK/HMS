import java.util.ArrayList;

public class Doctor {
    private int did;
    private String name;
    private ArrayList<String> specializations;
    private ArrayList<String> availableSlots;

    public Doctor(){
        specializations = new ArrayList<>();
        availableSlots = new ArrayList<>();
    }

    public void setDoctorDetails(int did,String name,  ArrayList<String> specializations){
        this.did = did;
        this.name = name;
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
        System.out.println("Enter Doctor Name: " +name);
        System.out.println("Specializations: " +specializations);
        System.out.println("Available Slots: " +availableSlots);
    }


}


