import org.example.question1.Person;

public class PersonTesting {
    public static void main(String[] args) {
        // Instantiating
        Person person = new Person("Cody", 26, "M");

        // Testing Getters
        System.out.println("**Testing Getters**");
        System.out.println(person.getName());
        System.out.println(person.getAge());
        System.out.println(person.getGender());
        System.out.println();

        // Setting
        person.setName("Paula");
        person.setAge(27);
        person.setGender("F");

        // Testing Setters
        System.out.println("**Testing Setters**");
        System.out.println(person.getName());
        System.out.println(person.getAge());
        System.out.println(person.getGender());
        System.out.println();

        // Testing toString()
        System.out.println("**Testing toString()**");
        System.out.println(person.toString());
    }
}
