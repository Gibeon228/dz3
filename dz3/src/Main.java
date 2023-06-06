import job.BaseWorker;
import job.WorkerFix;
import job.WorkerHour;

public class Main {
    public static void main(String[] args) {

        /**
         * Я не уверен, что правильно понял задание, но я думаю это массив сотрудников на базе
         * абстрактного класса
         */

        BaseWorker[] baseWorkers = {
                new WorkerFix("Станислав", 100000),
                new WorkerFix("Владимир", 90000),
                new WorkerFix("Светлана", 95000),
                new WorkerHour("Екатерина", 150),
                new WorkerHour("Петр", 100),
                new WorkerHour("Василий", 115),
        };

        System.out.println("Hello world!");
    }
}