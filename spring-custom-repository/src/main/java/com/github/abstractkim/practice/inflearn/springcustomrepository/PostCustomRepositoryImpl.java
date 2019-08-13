package com.github.abstractkim.practice.inflearn.springcustomrepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;
import java.util.List;

@Repository
@Transactional
public class PostCustomRepositoryImpl implements PostCustomRepository<Post> {
    @Autowired
    EntityManager entityManger;

    @Override
    public List<Post> findMyPost() {
        final TypedQuery<Post> query = entityManger.createQuery("SELECT p FROM Post AS p", Post.class);
        final List<Post> resultList = query.getResultList();
        return resultList;
    }

    @Override
    public void delete(Post post) {
        System.out.println("Custom delete");
        entityManger.remove(post);
    }
}
