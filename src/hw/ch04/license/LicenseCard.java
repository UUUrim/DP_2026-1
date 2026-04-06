package hw.ch04.license;

import hw.ch04.framework.Product;

public class LicenseCard extends Product {
    private String holder;
    private int licenseNumber;
    private String issuedDate;
    private String expiryDate;

    public LicenseCard(String holder, int licenseNumber, String issuedDate, String expiryDate) {
        System.out.println(holder + "의 카드를 " + licenseNumber + "번으로 만듭니다.");
        this.holder = holder;
        this.licenseNumber = licenseNumber;
        this.issuedDate = issuedDate;
        this.expiryDate = expiryDate;
    }

    @Override
    public void use() {
        System.out.println(toString() + "을 사용합니다.");
    }

    @Override
    public String toString() {
        return "[LicenseCard:" + holder + "(" + licenseNumber + ")] - 유효기간: " + issuedDate + " ~ " + expiryDate;
    }

}
