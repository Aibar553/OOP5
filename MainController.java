import java.util.Scanner;

public class MainController {
    public static void main(String args[]) {

        // Методы в контроллере
        LearningGroupService gu = new LearningGroupService();
        Student student = new Student();
        Teacher teacher = new Teacher();

        student.setFirstNameT("Nigga");
        student.setIdNumber(3433);
        student.setLastNameT("Fucking");
        gu.add(student);
        teacher.setFirstNameT("Compton");
        teacher.setIdNumberTeacher(233);
        teacher.setLastNameT("Ghetto");
        teacher.setSpeciality("IS");
        gu.addTeacher(teacher);
        Scanner input = new Scanner(System.in);
        int option = 0;
        // С помощью циклов можем добавить данные
        do {
            menu();
            option = input.nextInt();
            switch (option) {
                case 1:
                    System.out.print("What is the Student id Number ?");
                    int idNumber = input.nextInt();
                    System.out.print("What is the Student's name");
                    String firstName = input.nextLine();
                    System.out.print("What is the Student's lastname");
                    String lastName = input.nextLine();
                    student = new Student(firstName, idNumber, lastName);
                    gu.add(student);
                    System.out.println(student.toString());
                    break;
                case 2:
                    System.out.print("What is the Teacher id Number ?");
                    int setIdNumberTeacher = input.nextInt();
                    System.out.print("What is the Teacher's name");
                    String firstNameT = input.nextLine();
                    System.out.print("What is the Teach23ert's lastname");
                    String lastNameT = input.nextLine();
                    System.out.print("What is the Teacher's speciality");
                    String speciality = input.nextLine();
                    teacher = new Teacher(firstNameT, setIdNumberTeacher, lastNameT, speciality);
                    gu.addTeacher(teacher);
                    System.out.println(teacher.toString());
                    break;
                case 3:
                    System.out.print(
                            "What is the Student id ? ");
                    int idNumberOfStudent = input.nextInt();
                    if (!gu.find(idNumberOfStudent)) {
                        System.out.println(
                                "Student id does not exist\n");
                    }
                    break;
                case 4:
                    System.out.print(
                            "What is the Student id ? ");
                    int idNumberOfTeacher = input.nextInt();
                    if (!gu.findTeacher(idNumberOfTeacher)) {
                        System.out.println(
                                "Student id does not exist\n");
                    }
                    break;
                case 5:
                    System.out.println(
                            "\nThank you for using the program. Goodbye!\n");
                    System.exit(0);
                    break;
                default:
                    System.out.println("\nInvalid input\n");
                    break;
            }
        } while (option != 5);
    }

    public static void menu() {
        System.out.println("MENU");
        System.out.println("1: Add Student");
        System.out.println("2: Add Teacher");
        System.out.println("3: Find Student");
        System.out.println("4: Find Student");
        System.out.println("5: Exit");
        System.out.print("Enter your selection : ");
    }
}
