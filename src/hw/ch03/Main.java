package hw.ch03;

public class Main {
    public static void main(String[] args) {

        System.out.println("컴퓨터공학전공 이예서");

        // [3-1] 기본 테스트
        AbstractDisplay d1 = new CharDisplay('H');
        AbstractDisplay d2 = new StringDisplay("Hello");
        d1.display();
        d2.display();

        // [3-2] Step 1 테스트: 반복 횟수 제어 
        // AbstractDisplay d1 = new CharDisplay('X', 3);
        // AbstractDisplay d2 = new StringDisplay("Test", 7);
        // d1.display();
        // d2.display();

        // [3-3] Step 2 테스트: 새로운 Display
        // AbstractDisplay num = new NumberDisplay(42, 4);
        // num.display();

    }
}
