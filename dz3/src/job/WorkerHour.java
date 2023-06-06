package job;

public class WorkerHour extends BaseWorker{

    public WorkerHour(String name, int speed) {
        super(name, speed);
    }


    @Override
    public double averageSalary()
    {
        return 20.8 * 8 * getSpeed();
    }
}
