package pl.hirely.springboot.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@Configuration
@EnableJpaRepositories(basePackages = {
        "pl.hirely.springboot.traincompany.model.repository"
})
public class JpaConfig {

}
