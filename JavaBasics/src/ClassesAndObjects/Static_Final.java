package ClassesAndObjects;

class MyPerson {
    // Finals
    // Final means constant - you cannot chance the value after
    // the variable has been assigned
    public final static int Lucky_Number = 7;


    /*
    Instance variables - every separate object get a copy of this
    variable
     */
    public String name;

    /*
    Static variables or class variables belong to the class
    and don't get their own copies for each object
     */
    public static String description;

    public void showName() {
        System.out.println(name);

        //Instance methods can access static vars
        System.out.println(description);
    }

    public static void showInfo() {
        System.out.println("Hello");

        // Static methods can access static vars
        System.out.println(description);

        // They cannot access instance vars
        // Won't work: System.out.println(name);
    }
}

public class Static_Final {
    public static void main(String[] args) {
        // Access description variable with the class not an object of the class
        MyPerson.description = "I am someone ";
        System.out.println(MyPerson.description);

        // Access static method with class name not object of the class
        MyPerson.showInfo();


        MyPerson person1 = new MyPerson();
        MyPerson person2 = new MyPerson();

        person1.name = "bob";
        person2.name = "sue";

        person1.showName();
        person2.showName();

        System.out.println(Math.PI);





    }
}
