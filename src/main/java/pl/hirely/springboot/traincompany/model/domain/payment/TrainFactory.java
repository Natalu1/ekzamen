package pl.hirely.springboot.traincompany.model.domain.payment;

import org.springframework.stereotype.Component;
import pl.hirely.springboot.traincompany.model.domain.Train;

@Component
public class TrainFactory {

    public BaseTrain map(Train train) {
        return switch (train.getTrainType()) {
            case FREIGHT -> new Freight(train.getPurchaseDate(), train.getName());
            case PASSENGER -> new Passenger(train.getPurchaseDate(), train.getName());
        };
    }
}
