import org.example.question1.Student;

public class StudentTesting {

    public static void main(String[] args) {
        // Instantiating
        Student student = new Student("Cody", 26, "M", "12345", 4.0);

        // Testing Getters
        System.out.println("**Testing Getters**");
        System.out.println(student.getName());
        System.out.println(student.getAge());
        System.out.println(student.getGender());
        System.out.println(student.getIdNum());
        System.out.println(student.getGPA());
        System.out.println();

        // Setters
        student.setName("Paula");
        student.setAge(27);
        student.setGender("F");
        student.setIdNum("54321");
        student.setGPA(4.1);

        // Testing Setters
        System.out.println("**Testing Setters**");
        System.out.println(student.getName());
        System.out.println(student.getAge());
        System.out.println(student.getGender());
        System.out.println(student.getIdNum());
        System.out.println(student.getGPA());

    }
}
