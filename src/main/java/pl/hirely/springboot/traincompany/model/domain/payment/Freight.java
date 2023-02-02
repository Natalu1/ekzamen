package pl.hirely.springboot.traincompany.model.domain.payment;

import java.math.BigDecimal;
import java.time.LocalDate;

public class Freight extends BaseTrain{

    public Freight(LocalDate employmentDate, String name) {
        super(employmentDate, name);
    }
private BigDecimal incomePerDayBase = BigDecimal.valueOf(15000);
    @Override
    public BigDecimal calculateIncome() {
        if (getNumberOrYears()<10){
            return incomePerDayBase.multiply(BigDecimal.valueOf(getNumberOfDay()));
        }else {
            long tenYearsDays = 10*365;
           BigDecimal tenYearsIncome = incomePerDayBase.multiply(BigDecimal.valueOf(tenYearsDays));
           long otherDays = getNumberOfDay() -tenYearsDays;
           BigDecimal otherDayIncome = incomePerDayBase.multiply(BigDecimal.valueOf(0.7)).multiply(BigDecimal.valueOf(otherDays));
           return tenYearsIncome.add(tenYearsIncome);

        }


    }


}
