package pl.hirely.springboot.traincompany.model.Servis;

import org.springframework.stereotype.Service;
import pl.hirely.springboot.traincompany.model.domain.payment.TrainFactory;
import pl.hirely.springboot.traincompany.model.dto.TrainIncomeDto;
import pl.hirely.springboot.traincompany.model.repository.TrainRepository;

import java.util.List;

@Service
public class TrainCalculateService {
    private final TrainRepository trainRepository;
    private final TrainFactory trainFactory;

    public TrainCalculateService(TrainRepository trainRepository, TrainFactory trainFactory) {
        this.trainRepository = trainRepository;
        this.trainFactory = trainFactory;
    }
    public List<TrainIncomeDto> getAllTrainsIncome(){
        return trainRepository.findAll().stream()
                .map(train -> new TrainIncomeDto(train.getName(),
                        trainFactory.map(train).calculateIncome(),train.getTrainType()))
                .toList();
    }
}
