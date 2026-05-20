package hw.ch17;
 
public class EvenNumberGenerator extends NumberGenerator {
    private int number;  // 현재 수
    private int end;     // 종료값 (이 값은 포함하지 않는다)
 
    public EvenNumberGenerator(int start, int end) {
        if (start % 2 != 0) {
            throw new IllegalArgumentException("start는 짝수여야 합니다: " + start);
        }
        this.number = start;
        this.end = end;
    }
 
    // 수를 취득한다
    @Override
    public int getNumber() {
        return number;
    }
 
    // 짝수만 순서대로 생성한다 (증가폭 고정 2)
    @Override
    public void execute() {
        while (number < end) {
            notifyObservers();
            number += 2;
        }
    }
}