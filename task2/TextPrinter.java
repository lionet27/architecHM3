package task2;

public class TextPrinter implements Printer {
    
    Text text;

    public TextPrinter(Text text) {
        this.text = text;
    }
    
    @Override
    public void print() {
        System.out.println(text.getText());
    }

}
