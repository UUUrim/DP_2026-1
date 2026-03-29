package hw.ch03;

public class NumberDisplay extends AbstractDisplay {
    private int displayNumber; // 표시해야 하는 숫자

    // 생성자 
    public NumberDisplay(int displayNumber, int repeatCount) {
        super(repeatCount);
        this.displayNumber = displayNumber;
    }

    @Override
    public void open() {
        // 시작 문자열 "<<"를 표시한다
        System.out.println("<<Number>>");
    }

    @Override
    public void print() {
        System.out.println(displayNumber);
    }

    @Override
    public void close() {
        // 종료 문자열 ">>"를 표시한다 
        System.out.println("<<Number>>");
    }
    
}
