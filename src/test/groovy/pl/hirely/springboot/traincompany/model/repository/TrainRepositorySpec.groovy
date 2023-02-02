package pl.hirely.springboot.traincompany.model.repository

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest
import spock.lang.Specification
import spock.lang.Subject

@DataJpaTest
class TrainRepositorySpec extends Specification {

    @Autowired
    @Subject
    private TrainRepository trainRepository

    def "should find all trains"() {
        when:
        def actual = trainRepository.findAll()

        then:
        actual.size() == 2
        actual*.name as Set == ['Test passenger train', 'Test freight train'] as Set
    }
}
