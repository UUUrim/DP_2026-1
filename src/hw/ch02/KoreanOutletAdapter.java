package hw.ch02;

public class KoreanOutletAdapter implements Charger {
    private KoreanOutlet koreanOutlet;

    public KoreanOutletAdapter() {
        this.koreanOutlet = new KoreanOutlet();
    }

    @Override
    public int charge() {
        return koreanOutlet.provide();
    }

}
