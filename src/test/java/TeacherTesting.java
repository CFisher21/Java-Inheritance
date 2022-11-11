import org.example.Teacher;

public class TeacherTesting {
    public static void main(String[] args) {
        // Instantiating
        Teacher teacher = new Teacher("Teacher", 46, "M", "History", 40000);

        // Testing Getters
        System.out.println("**Testing Getters**");
        System.out.println(teacher.getName());
        System.out.println(teacher.getAge());
        System.out.println(teacher.getGender());
        System.out.println(teacher.getSubject());
        System.out.println(teacher.getSalary());
        System.out.println();

        // Using Setters
        teacher.setName("Student");
        teacher.setAge(45);
        teacher.setGender("F");
        teacher.setSubject("Math");
        teacher.setSalary(46000);

        // Testing Setters
        System.out.println("**Testing Setters**");
        System.out.println(teacher.getName());
        System.out.println(teacher.getAge());
        System.out.println(teacher.getGender());
        System.out.println(teacher.getSubject());
        System.out.println(teacher.getSalary());
        System.out.println();

        // Testing toString()
        System.out.println("**Testing toString()**");
        System.out.println(teacher.toString());
    }
}
