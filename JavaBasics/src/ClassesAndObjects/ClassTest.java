package ClassesAndObjects;

class Person {
    // Instance variables
    // Data and methods
    String name;
    int age;

    void speak() {
        System.out.println("My name is: " + name + " and I am " + age + " years old!");
    }
}

public class ClassTest {
    public static void main(String[] args) {

        Person Rishit = new Person();
        Rishit.name = "Rishit Rakapali";
        Rishit.age = 15;

        System.out.println(Rishit.name);
        System.out.println(Rishit.age);

        Rishit.speak();
    }
}

