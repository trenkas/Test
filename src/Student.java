
import java.util.Arrays;
import java.util.List;

public class Student extends Person {

    private String grade;
    List<Subject> listStudent = Arrays.asList(Subject.values());



    public Student(int age, String name, String grade) {
        super(age, name);
        this.grade = grade;

    }

    @Override
    public String toString() {
        return "Student " + name + " age of " + age + " studies in grade " + grade;
    }

    public void addSubject(Subject subject) {
        Subject.seeSubject(subject.name());

    }

    public void showSubject() {
        Subject[] values = Subject.values();
        System.out.printf("Student " + name + " studies the following list of subjects: ");
        for (Subject value : values) {
            System.out.printf(value.name() + " , ");

        }
        System.out.println("\n");
    }
}

