package task1;

public class Main {
    public static void main(String[] args) {
        RobotWorker worker = new RobotWorker();
        worker.work();
        HumanWorker humanWorker = new HumanWorker();
        humanWorker.work();
        humanWorker.eat(); 
    }
}