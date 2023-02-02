package pl.hirely.springboot.traincompany.controller

import org.spockframework.spring.SpringBean
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest
import org.springframework.test.web.servlet.MockMvc
import pl.hirely.springboot.traincompany.model.Servis.TrainCalculateService
import pl.hirely.springboot.traincompany.model.domain.TrainType
import pl.hirely.springboot.traincompany.model.dto.TrainIncomeDto
import spock.lang.Specification

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status

@WebMvcTest(controllers = TrainController)
class TrainControllerSpek extends Specification {

    @Autowired
    private MockMvc mockMvc

    @SpringBean
    private TrainCalculateService trainCalculateService = Mock()

    def "should all trains in come"() {
        given:
        trainCalculateService.getAllTrainsIncome() >> [new TrainIncomeDto("Intersiti", 20000, TrainType.PASSENGER),
                                                       new TrainIncomeDto("Train", 30000, TrainType.FREIGHT)]
        when:
        def response = mockMvc.perform(get("/trains"))

        then:
        response
                .andExpect(status().isOk())
                .andExpect(jsonPath('$.length()').value(2))
                .andExpect(jsonPath('$[0].name').value("Intersiti"))
                .andExpect(jsonPath('$[0].totalCome').value(20000))
                .andExpect(jsonPath('$[0].trainType').value(TrainType.PASSENGER))

                .andExpect(jsonPath('$[1].name').value("Train"))
                .andExpect(jsonPath('$[1].totalCome').value(30000))
                .andExpect(jsonPath('$[1].trainType').value(TrainType.FREIGHT))


    }

}
