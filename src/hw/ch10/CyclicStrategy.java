package hw.ch10;

public class CyclicStrategy implements Strategy {

    private int currentHandValue = 0;

    @Override
    public Hand nextHand() {
        Hand hand = Hand.getHand(currentHandValue);

        currentHandValue = (currentHandValue + 1) % 3;

        return hand;
    }

    @Override
    public void study(boolean win) {
    }
}