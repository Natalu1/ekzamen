package pl.hirely.springboot.traincompany.model.domain.payment

import pl.hirely.springboot.traincompany.model.domain.Train
import pl.hirely.springboot.traincompany.model.domain.TrainType
import spock.lang.Specification
import spock.lang.Subject

import java.time.LocalDate

class TrainFactorySpec extends Specification {
    @Subject
    TrainFactory trainFactory = new TrainFactory()

    def "should return base train trainType from ENUM trainType"() {
        given:
        Train train = new Train(trainType: trainType,
                purchaseDate: LocalDate.now().minusYears(4),
                name: "Train")

        when:
        def actual = trainFactory.map(train)

        then:
        actual.class == expectedActual
        actual.purchaseDate == LocalDate.now().minusYears(4)
        actual.name == "Train"

        where:
        trainType           || expectedActual

        TrainType.FREIGHT   || Freight.class
        TrainType.PASSENGER || Passenger.class
    }

}
