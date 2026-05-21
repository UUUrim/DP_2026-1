package hw.ch19;

public class Main {
    public static void main(String[] args) {
        System.out.println("컴퓨터공학전공 이예서");

        SafeFrame frame = new SafeFrame("State Sample");
        while (true) {
            for (int hour = 0; hour < 24; hour++) {
                frame.setClock(hour);   // 시간 설정 
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                }
            }
        }
    }
}
