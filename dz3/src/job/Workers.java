package job;

import java.util.Arrays;
import java.util.Comparator;

public class Workers implements Sort{
    private BaseWorker[] baseWorkers;

    public Workers(BaseWorker[] baseWorkers) {
        this.baseWorkers = baseWorkers;
    }

    public void sortAverageSalary() {
        Arrays.sort(baseWorkers, Comparator.comparing(BaseWorker::averageSalary));
    }

    public  void printWorkersInfo() {
        for (BaseWorker baseWorker : baseWorkers){
            System.out.println("Имя " + baseWorker.getName() + " | средняя зарплата: " + baseWorker.averageSalary());
        }
    }
}
