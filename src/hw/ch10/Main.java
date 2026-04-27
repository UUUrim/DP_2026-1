package hw.ch10;

public class Main {
    public static void main(String[] args) {
        System.out.println("컴퓨터공학전공 이예서");

        System.out.println("==== RandomStrategy ====");
        Player player1 = new Player("Taro", new RandomStrategy(0));

        System.out.println("\n==== CyclicStrategy ====");
        Player player2 = new Player("Bob", new CyclicStrategy());

        // CyclicStrategy 테스트 : 순환 확인
        System.out.println("CyclicStrategy의 손가락 순환");
        Strategy cyclic = new CyclicStrategy();
        for (int i = 0; i < 9; i++) {
            Hand hand = cyclic.nextHand();
            System.out.println((i+1) + "번째: " + hand);
            cyclic.study(false); // study 호출해도 영향 없음
        }

        // player1과 player2를 10번 게임을 시킴
        for (int i = 0; i < 10; i++) {
            Hand nextHand1 = player1.nextHand();
            Hand nextHand2 = player2.nextHand();
            if (nextHand1.isStrongerThan(nextHand2)) {
                System.out.println("Winner:" + player1);
                player1.win();
                player2.lose();
            } else if (nextHand2.isStrongerThan(nextHand1)) {
                System.out.println("Winner:" + player2);
                player1.lose();
                player2.win();
            } else {
                System.out.println("Even...");
                player1.even();
                player2.even();
            }
        }
        System.out.println("Total result:");
        System.out.println(player1.toString());
        System.out.println(player2.toString());
    }
}
