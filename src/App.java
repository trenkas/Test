public class App {
    public static void main(String[] args) {
        Student student1 = new Student(20, "Tanya", "10-B");

        student1.addSubject(Subject.HISTORY);
        student1.addSubject(Subject.seeSubject("chemistry"));

        System.out.println(student1);
        student1.showSubject();
        System.out.println(student1.listStudent);


        Teacher teacher1 = new Teacher(35, "Tetiana Sergievna");
        System.out.println( teacher1 +" teaches the following list of subjects: " + teacher1.listTeacher);

    }
}
