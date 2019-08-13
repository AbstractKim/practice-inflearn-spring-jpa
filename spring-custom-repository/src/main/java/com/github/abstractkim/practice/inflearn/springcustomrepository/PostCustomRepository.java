package com.github.abstractkim.practice.inflearn.springcustomrepository;

import java.util.List;

public interface PostCustomRepository<T> {
    List<Post> findMyPost();

    void delete(T post);
}
