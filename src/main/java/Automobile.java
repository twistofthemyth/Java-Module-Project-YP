public class Automobile {
    private final String name;
    private int speed;

    public Automobile(String name, int speed) {
        this.name = name;
        this.speed = speed;
    }

    public String getName() {
        return this.name;
    }

    public double getSpeed() {
        return this.speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }
}
