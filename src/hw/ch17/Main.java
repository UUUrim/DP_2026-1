package hw.ch17;

public class Main {
    public static void main(String[] args) {
        System.out.println("컴퓨터공학전공 이예서");
        
        NumberGenerator generator = new EvenNumberGenerator(0, 30);
        Observer observer1 = new DigitObserver();
        Observer observer2 = new GraphObserver();
        Observer observer3 = new RangeObserver();
        generator.addObserver(observer1);
        generator.addObserver(observer2);
        generator.addObserver(observer3);
        generator.execute();
    }
}
