package pl.hirely.springboot.traincompany.model.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.hirely.springboot.traincompany.model.domain.Train;

public interface TrainRepository extends JpaRepository<Train, Long> {

}
