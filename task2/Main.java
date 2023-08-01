package task2;

public class Main {
    public static void main(String[] args) {
        Text myText = new Text("Hello, world!");
        TextPrinter myPrinter = new TextPrinter(myText);
        myPrinter.print();
    }
}
