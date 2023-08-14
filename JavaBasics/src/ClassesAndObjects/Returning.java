package ClassesAndObjects;

class newPerson {
    String name;
    int age;

    void speak () {
        System.out.println("My name is: " + age);
    }

    // When returning values change void to the correct data type
    int YearsToRetirement() {
        int yearsLeft = 65 - age;

        return yearsLeft;
    }

    String getName() {
        return name;
    }
}


public class Returning {
    public static void main(String[] args) {
        newPerson person1 = new newPerson();
        person1.name = "Joe";
        person1.age = 15;

        int years  = person1.YearsToRetirement();
        System.out.println("Years to retirement: " + years);
    }
}
