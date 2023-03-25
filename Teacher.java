
public class Teacher {
    // Класс студент
    // Закрытые поля
    private String firstNameT;
    private int idNumberTeacher;
    private String lastNameT;
    private String speciality;

    public Teacher() {

    }

    public Teacher(String firstNameT, int idNumberTeacher, String lastNameT, String speciality) {
        this.firstNameT = firstNameT;
        this.idNumberTeacher = idNumberTeacher;
        this.lastNameT = lastNameT;
        this.speciality = speciality;
    }

    // Закрытые поля доступны только в рамках своего класса
    public String getFirstNameT() {
        return firstNameT;
    }

    public void setFirstNameT(String firstNameT) {
        this.firstNameT = firstNameT;
    }

    public int getIdNumberTeacher() {
        return idNumberTeacher;
    }

    public void setIdNumberTeacher(int idNumberTeacher) {
        this.idNumberTeacher = idNumberTeacher;
    }

    public String getLastNameT() {
        return lastNameT;
    }

    public void setLastNameT(String lastNameT) {
        this.lastNameT = lastNameT;
    }

    public String getSpeciality() {
        return speciality;
    }

    public void setSpeciality(String speciality) {
        this.speciality = speciality;
    }

    @Override
    public String toString() {
        return "Teacher{"
                + " FirstNameT" + firstNameT + ", idNumberT" + idNumberTeacher
                + ", lastNameT" + lastNameT + " , Speciality" + speciality + "}";
    }
}
