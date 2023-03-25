public class Student {
    // Класс студент
    // Закрытые поля
    private String firstName;
    private int idNumber;
    private String lastName;

    public Student() {

    }

    // Конструктор
    public Student(String firstName, int idNumber, String lastName) {
        this.firstName = firstName;
        this.idNumber = idNumber;
        this.lastName = lastName;
    }

    // Закрытые поля доступны только в рамках своего класса
    public String getFirstNameT() {
        return firstName;
    }

    public void setFirstNameT(String firstName) {
        this.firstName = firstName;
    }

    public int getIdNumber() {
        return idNumber;
    }

    public void setIdNumber(int idNumber) {
        this.idNumber = idNumber;
    }

    public String getLastNameT() {
        return lastName;
    }

    public void setLastNameT(String lastName) {
        this.lastName = lastName;
    }

    @Override
    public String toString() {
        return "Student{"
                + " FirstName" + firstName + ", idNumber" + idNumber
                + ", lastName" + lastName + "}";
    }
}
