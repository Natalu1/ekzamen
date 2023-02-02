package pl.hirely.springboot.traincompany.model.dto;

import pl.hirely.springboot.traincompany.model.domain.TrainType;

import java.math.BigDecimal;

public class TrainIncomeDto {
    private String name;
    private BigDecimal totalInCome;
    private TrainType trainType;

    public TrainIncomeDto(String name, BigDecimal totalInCome, TrainType trainType) {
        this.name = name;
        this.totalInCome = totalInCome;
        this.trainType = trainType;
    }


    public void setName(String name) {
        this.name = name;
    }

    public void setTotalInCome(BigDecimal totalInCome) {
        this.totalInCome = totalInCome;
    }

    public String getName() {
        return name;
    }

    public BigDecimal getTotalInCome() {
        return totalInCome;
    }

}
