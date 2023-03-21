package poc.microsservico.venda;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EntityScan({"poc.microsservico.core"})
@EnableJpaRepositories({"poc.microsservico.core.repository"})
public class VendaApplication {

    public static void main(String[] args) {
        SpringApplication.run(VendaApplication.class, args);
    }

}
