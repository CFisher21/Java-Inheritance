import org.example.question1.CollegeStudent;

public class CollegeStudentTesting {
    public static void main(String[] args) {
        // Instantiating
        CollegeStudent CS = new CollegeStudent("Teacher", 43, "M", "12345", 4.0, "Computer Science", 2022);

        // Testing Getters
        System.out.println("**Getters**");
        System.out.println(CS.getName());
        System.out.println(CS.getAge());
        System.out.println(CS.getGender());
        System.out.println(CS.getIdNum());
        System.out.println(CS.getGPA());
        System.out.println(CS.getMajor());
        System.out.println(CS.getYear());
        System.out.println();

        // Setters
        CS.setName("Student");
        CS.setAge(25);
        CS.setGender("F");
        CS.setIdNum("54321");
        CS.setGPA(4.1);
        CS.setYear(2023);

        // Testing toString()
        System.out.println("**Setters**");
        System.out.println(CS.toString());
    }
}
