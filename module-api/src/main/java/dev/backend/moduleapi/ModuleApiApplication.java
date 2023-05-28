package dev.backend.moduleapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication (
        scanBasePackages = {"dev.backend.moduleapi", "dev.backend.modulecommon"}
)
@EntityScan("dev.backend.modulecommon.domain")
@EnableJpaRepositories(basePackages = "dev.backend.modulecommon.repositories")
public class ModuleApiApplication {

    public static void main(String[] args) {
        SpringApplication.run(ModuleApiApplication.class, args);
    }

}
