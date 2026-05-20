package hw.ch17;
 
public class RangeObserver implements Observer {
    @Override
    public void update(NumberGenerator generator) {
        int number = generator.getNumber();
        String label;
        if (number < 10) {
            label = "Low";
        } else if (number < 20) {
            label = "Mid";
        } else {
            label = "High";
        }
        System.out.println("RangeObserver: [" + label + "] " + number);
    }
}