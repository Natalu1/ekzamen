package pl.hirely.springboot.traincompany.model.domain.payment;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public abstract class BaseTrain {


    private LocalDate purchaseDate;
    private String name;

    public BaseTrain(LocalDate purchaseDate, String name) {
        this.purchaseDate = purchaseDate;
        this.name = name;
    }

    public LocalDate getPurchaseDate() {
        return purchaseDate;
    }

    public String getName() {
        return name;
    }

    public void setPurchaseDate(LocalDate purchaseDate) {
        this.purchaseDate = purchaseDate;
    }

    public void setName(String name) {
        this.name = name;
    }

    public abstract BigDecimal calculateIncome();

    protected long getNumberOfWeeks() {
        return ChronoUnit.WEEKS.between(purchaseDate, LocalDate.now());
    }

    protected long getNumberOrYears() {
        return ChronoUnit.YEARS.between(purchaseDate, LocalDate.now());
    }

    protected long getNumberOfDay() {
        return ChronoUnit.DAYS.between(purchaseDate, LocalDate.now());
    }
}
