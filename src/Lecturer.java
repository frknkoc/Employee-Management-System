public class Lecturer extends Academician{
    private String doorNumber;

    public Lecturer(String fullName, String phoneNumber, String adress, String department, String title, String doorNumber) {
        super(fullName, phoneNumber, adress, department, title);
        this.doorNumber = doorNumber;
    }

    public String getDoorNumber() {
        return doorNumber;
    }

    public void setDoorNumber(String doorNumber) {
        this.doorNumber = doorNumber;
    }
}
