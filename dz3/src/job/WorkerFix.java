package job;

public class WorkerFix extends BaseWorker{


    public WorkerFix(String name, int speed) {
        super(name, speed);
    }

    @Override
    double averageSalary() {
        return getSpeed();
    }
}
