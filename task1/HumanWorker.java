package task1;

public class HumanWorker implements Worker, Eat {
    public void work() {
        System.out.println("������� ��������");
    }

    public void eat() {
        System.out.println("������� ���");
    }

}