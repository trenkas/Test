import java.util.Arrays;
import java.util.List;

public class Teacher extends Person {

    List<Subject> listTeacher = Arrays.asList(Subject.values());

    public Teacher(int age, String name) {
        super(age, name);

    }

    @Override
    public String toString() {
        return "Teacher " + name + " age of " + age ;
    }
}
