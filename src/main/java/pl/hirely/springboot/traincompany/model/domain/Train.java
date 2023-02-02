package pl.hirely.springboot.traincompany.model.domain;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "train")
public class Train {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Potrzebne, aby baza danych sama inkrementowała klucz główny typu SERIAL (zobacz: V1_0__schema.sql)
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "type")
    @Enumerated(EnumType.STRING)
    private TrainType trainType;

    @Column(name = "purchase_date")
    private LocalDate purchaseDate;

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public TrainType getTrainType() {
        return trainType;
    }

    public LocalDate getPurchaseDate() {
        return purchaseDate;
    }


}
