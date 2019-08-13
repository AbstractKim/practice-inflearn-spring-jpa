package com.github.abstractkim.practice.inflearn.springcustomrepository;

import org.springframework.data.jpa.repository.JpaRepository;

public interface PostRepository extends JpaRepository<Post, Long>, PostCustomRepository {
}
