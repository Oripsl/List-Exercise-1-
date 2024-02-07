import java.util.ArrayList;

public class ListExercise {
    public static void main(String[] args) {

        ArrayList<Student> students = new ArrayList<>();
        Student studente1 = new Student("Piero", 15);
        Student studente2 = new Student("Franco", 18);
        Student studente3 = new Student("Carlo", 12);
        Student studente4 = new Student("Giacomo", 19);

        students.add(studente1);
        students.add(studente2);
        students.add(studente3);
        students.add(studente4);

        for(Student student: students) {
            System.out.println("Name: " + student.getName() + ", age: " + student.getAge());
        }

    }
}
