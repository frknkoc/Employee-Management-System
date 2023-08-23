public class Academician extends Employee{
    private String department;
    private String title;

    public Academician(String fullName, String phoneNumber, String adress, String department, String title) {
        super(fullName, phoneNumber, adress);
        this.department = department;
        this.title = title;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void giveLesson(){
        System.out.println(this.title + " " + this.getFullName() + " üniversitede ders verdi.");
    }

    @Override
    public void logIn(){
        System.out.println(this.getTitle() + " " + this.getFullName() + " " + this.getDepartment() + " " + this.getAdress());
    }
}
