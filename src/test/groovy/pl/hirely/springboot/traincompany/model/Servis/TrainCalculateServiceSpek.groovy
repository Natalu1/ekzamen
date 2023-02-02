package pl.hirely.springboot.traincompany.model.Servis

import pl.hirely.springboot.traincompany.model.domain.Train
import pl.hirely.springboot.traincompany.model.domain.TrainType
import pl.hirely.springboot.traincompany.model.domain.payment.TrainFactory
import pl.hirely.springboot.traincompany.model.repository.TrainRepository
import spock.lang.Specification
import spock.lang.Subject

import java.time.LocalDate

class TrainCalculateServiceSpek extends Specification {
    private final TrainRepository trainRepository = Mock()
    private final TrainFactory trainFactory = Mock()

    @Subject
    private TrainCalculateService trainCalculateService = new TrainCalculateService(trainFactory, trainFactory)

    def "should property calculate Train income"(){
        def now = LocalDate.now()
        def train1Train = new Train(
                name: "Intersiti",
                trainType: TrainType.PASSENGER,
                purchaseDate: now.minusYears(5))

                trainRepository.findAll() >> [train1Train]

        when:
        def actual = trainCalculateService.getAllTrainsIncome(name: "Intersiti", trainType: TrainType.PASSENGER,
                purchaseDate: now.minusYears(5))

        then:
        actual.find (dto->dto.name == "Intersiti").totalInCome ==
        )

    }


}
