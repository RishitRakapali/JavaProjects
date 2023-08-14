package ClassesAndObjects;

class Robot {
    public void speak(String txt) {
        System.out.println(txt);
    }

}

public class MethodParameters {
    public static void main(String[] args) {

        Robot rish = new Robot();

        rish.speak(" Ello ello!");

    }
}
