public class Main {
    public static void main(String[] args) {
        Employee n1employee = new Employee("Furkan", "0121201021", "İstanbul");
        System.out.println(n1employee.getAdress());

        Academician number1 = new Academician("Ali Koç", "1234567890", "Ankara", "Math", "Prof.");
        System.out.println(number1.getTitle());
        number1.logIn();
        number1.giveLesson();

        Officer o1 = new Officer("Fatih", "1212121212", "Yenikapı", "student affairs", "09.00 - 18.00");
        System.out.println(o1.getShift());

        Lecturer l1 = new Lecturer("Tezcan", "222113311", "Edirne", "Music", "Doc.", "12");
        l1.giveLesson();
        System.out.println(l1.getFullName());
        l1.logIn();
        System.out.println(l1.getDepartment());

        LabAssistant labA1 = new LabAssistant("Şeyma", "122121221212", "Üsküdar", "Geo", "Assitant", 9);
        System.out.println(labA1.getFullName());
        System.out.println(labA1.getTitle() + " " + labA1.getFullName() + " " + labA1.getOfficeHour());
        labA1.makeQuiz();
    }
}