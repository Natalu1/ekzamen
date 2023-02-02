package pl.hirely.springboot.traincompany.model.domain.payment;

import java.math.BigDecimal;
import java.time.LocalDate;

public class Passenger extends BaseTrain{
    public Passenger(LocalDate employmentDate, String name) {
        super(employmentDate, name);
    }
    private BigDecimal incomePerWeek = BigDecimal.valueOf(1000);
    @Override
    public BigDecimal calculateIncome() {
       long weeks = getNumberOfWeeks();

        return incomePerWeek.multiply(BigDecimal.valueOf(weeks));
    }
}
