public class LabAssistant extends Academician{
    private int officeHour;

    public LabAssistant(String fullName, String phoneNumber, String adress, String department, String title, int officeHour) {
        super(fullName, phoneNumber, adress, department, title);
        this.officeHour = officeHour;
    }

    public int getOfficeHour() {
        return officeHour;
    }

    public void setOfficeHour(int officeHour) {
        this.officeHour = officeHour;
    }

    public void makeQuiz(){
        System.out.println(this.getTitle() + " " + this.getFullName() + " quiz yaptı.");
    }
}
