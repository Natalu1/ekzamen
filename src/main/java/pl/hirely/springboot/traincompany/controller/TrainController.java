package pl.hirely.springboot.traincompany.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pl.hirely.springboot.traincompany.model.Servis.TrainCalculateService;
import pl.hirely.springboot.traincompany.model.dto.TrainIncomeDto;

import java.util.List;

@RestController
@RequestMapping("/trains")
public class TrainController {
    private final TrainCalculateService trainCalculateService;

    public TrainController(TrainCalculateService trainCalculateService) {
        this.trainCalculateService = trainCalculateService;
    }

    @GetMapping
    public List<TrainIncomeDto> getAllTrainsIncome() {
        return trainCalculateService.getAllTrainsIncome();
    }
}
