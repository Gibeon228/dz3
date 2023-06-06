package job;

public abstract class BaseWorker {

    protected String name;
    //protected int time;
    protected double speed;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public BaseWorker(String name, int speed) {
        this.name = name;
        this.speed = speed;
    }

    abstract double averageSalary();
}
