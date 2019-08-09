package com.github.abstractkim.practice.inflearn.springjpasetting;

import org.hibernate.Session;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

@Component
@Transactional
public class JpaRunner implements ApplicationRunner {
    @PersistenceContext
    EntityManager entityManager;

    @Override
    public void run(ApplicationArguments args) throws Exception {
        Account account = new Account();
        account.setUsername("bskim");
        account.setPassword("jpa");
//        entityManager.persist(account);
        final Session session = entityManager.unwrap(Session.class);


        Account accountForSesstion = new Account();
        accountForSesstion.setUsername("bskim");
        accountForSesstion.setPassword("hibernate");

        Study study = new Study();
        study.setName("myStudy");
        study.setAccount(accountForSesstion);
        session.save(accountForSesstion);
        session.save(study);

    }
}
