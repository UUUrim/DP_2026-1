package hw.ch02;

public class Main {
    public static void main(String[] args) {
        System.out.println("컴퓨터공학전공 이예서");

        // 어댑터를 사용하여 스마트폰에 연결
        Charger charger = new KoreanOutletAdapter();
        Smartphone smartphone = new Smartphone(charger);

        // 스마트폰 충전
        smartphone.charge();
    }
}
