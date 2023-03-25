import java.util.ArrayList;
import java.util.LinkedList;

public class LearningGroupService {

    LinkedList<Teacher> teacher;
    ArrayList<Student> student;

    public LearningGroupService() {
        teacher = new LinkedList<>();
        student = new ArrayList<>();
    }

    // Добавил методы
    public void add(Student liststudent) {
        if (!find(liststudent.getIdNumber())) {
            student.add(liststudent);
        } else {
            System.out.println("Student already exists in the List");
        }
    }

    public boolean find(int idNumber) {
        for (Student s : student) {
            if (s.getIdNumber() == idNumber) {
                System.out.println(s);
                return true;
            }
        }
        return false;
    }

    public void addTeacher(Teacher teach) {
        if (!find(teach.getIdNumberTeacher())) {
            teacher.add(teach);
        } else {
            System.out.println("Teacher already exists in the List");
        }

    }

    public boolean findTeacher(int idNumberTeacher) {
        for (Teacher t : teacher) {
            if (t.getIdNumberTeacher() == idNumberTeacher) {
                System.out.println(t);
                return true;
            }
        }
        return false;
    }
}
