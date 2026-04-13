package hw.ch06;

import hw.ch06.framework.Product;

public class BorderLine implements Product {
    private char borderChar;

    public BorderLine(char borderChar) {
        this.borderChar = borderChar;
    }

    @Override
    public void use(String s) {
        int len = s.length();
        for (int i = 0; i < len; i++) {
            System.out.print(borderChar);
        }

        System.out.println();
        System.out.println(s);

        for (int i = 0; i < len; i++) {
            System.out.print(borderChar);
        }
        System.out.println("\n");
    }

    @Override
    public Product createCopy() {
        Product p = null;
        try {
            p = (Product)clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return p;
    }
    
}
