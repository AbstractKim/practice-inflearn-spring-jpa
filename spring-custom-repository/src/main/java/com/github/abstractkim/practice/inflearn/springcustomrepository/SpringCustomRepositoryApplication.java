package com.github.abstractkim.practice.inflearn.springcustomrepository;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories
public class SpringCustomRepositoryApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringCustomRepositoryApplication.class, args);
    }

}
