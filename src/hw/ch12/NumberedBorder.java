package hw.ch12;

public class NumberedBorder extends Border {

    public NumberedBorder(Display display) {
        super(display);
    }

    // 내용물의 가로폭에 4를 더한 값을 반환
    @Override
    public int getColumns() {
        return 4 + display.getColumns();
    }

    // 내용물과 동일한 행 수를 반환
    @Override
    public int getRows() {
        return display.getRows();
    }

    @Override
    public String getRowText(int row) {
        return String.format("%2d| ", row + 1) + display.getRowText(row);
    }
}