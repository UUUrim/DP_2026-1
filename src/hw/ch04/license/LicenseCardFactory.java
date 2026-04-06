package hw.ch04.license;

import hw.ch04.framework.Factory;
import hw.ch04.framework.Product;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class LicenseCardFactory extends Factory{
    private int licenseCounter = 100;
    private String baseDate;

    public LicenseCardFactory(String baseDate) {
        this.baseDate = baseDate;
    }

    protected synchronized Product createProduct(String owner) {
        // baseDate 기준으로 validYears 후를 만료일로 자동 계산
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        String expiryDate = LocalDate.parse(baseDate, formatter)
                                     .plusYears(10)
                                     .format(formatter);

        return new LicenseCard(owner, licenseCounter++, baseDate, expiryDate);
    }

    @Override
    protected void registerProduct(Product product) {
        System.out.println(product + "을 등록했습니다.");
    }
}
