package classAndObject;

public class Fan {
    public final int SLOW = 1;
    public final int MEDIUM = 2;
    public final int FAST = 3;

    private int speed = this.SLOW;

    private boolean on = false;

    private double radius = 5;

    private String color = "blue";


    public Fan() {
    }

    @Override
    public String toString() {
        String speedString = "";
        switch (this.speed) {
            case SLOW:
                speedString = "Slow";
                break;
            case MEDIUM:
                speedString = "Medium";
                break;
            case FAST:
                speedString = "Fast";

        }
        if (this.on) {
            return "Fan is on {" +
                    " speed=" + speed + " " + speedString +
                    ", on=" + on +
                    ", radius=" + radius +
                    ", color='" + color + '\'' +
                    '}';

        } else {
            return "Fan is off {" +
                    " on=" + on +
                    ", radius=" + radius +
                    ", color='" + color + '\'' +
                    '}';
        }
    }

    public int getSLOW() {
        return SLOW;
    }

    public int getMEDIUM() {
        return MEDIUM;
    }

    public int getFAST() {
        return FAST;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public boolean isOn() {
        return on;
    }

    public void setOn(boolean on) {
        this.on = on;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
