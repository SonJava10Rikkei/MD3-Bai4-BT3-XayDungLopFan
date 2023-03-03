package classAndObject;

public class Main {
    public static void main(String[] args) {
        Fan f1 = new Fan();
        Fan f2 = new Fan();

        f1.setSpeed(f1.FAST);
        f1.setRadius(10.0);
        f1.setColor("yellow");
        f1.setOn(true);

        f2.setSpeed(f1.MEDIUM);
        f2.setRadius(5.0);
        f2.setColor("blue");
        f2.setOn(false);

        System.out.println("Fan f1 la: " + f1);
        System.out.println("Fan f2 la: " + f2);

    }
}
