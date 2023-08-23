public class Employee {
    private String fullName;
    private String phoneNumber;
    private String adress;

    public Employee(String fullName, String phoneNumber, String adress) {
        this.fullName = fullName;
        this.phoneNumber = phoneNumber;
        this.adress = adress;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public void logIn(){
        System.out.println(this.fullName + " Üniversiteye giriş yaptı.");
    }
    public void logOut(){
        System.out.println(this.fullName + " üniversiteden çıkış yaptı.");
    }
    public void refectory(){
        System.out.println(this.fullName + " yemekhanede yemek yedi.");
    }
}
