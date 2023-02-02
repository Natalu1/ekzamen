package pl.hirely.springboot.company

import org.springframework.boot.test.context.SpringBootTest
import spock.lang.Specification

@SpringBootTest
class TrainCompanyApplicationSpec extends Specification {

    def "Spring context loads"() {
        expect:
        true
    }
}
