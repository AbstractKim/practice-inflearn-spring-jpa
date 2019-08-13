package com.github.abstractkim.practice.inflearn.springcustomrepository;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

@RunWith(SpringRunner.class)
@DataJpaTest
public class PostRepositoryTest {

    @Autowired
    PostRepository postRepository;

    @Test
    public void crud(){
        //given
        Post post = createPost();

        //when
        final Post savedPost = postRepository.save(post);
        postRepository.flush();;

        //test
        assertThat(savedPost.getId()).isNotNull();
    }

    @Test
    public void customRepository(){

        final Post post = createPost();
        postRepository.save(post);

        final List<Post> myPost = postRepository.findMyPost();
        assertThat(myPost.size()).isGreaterThanOrEqualTo(1);
    }

    private Post createPost() {
        Post post = new Post();
        post.setTitle("1st title");
        post.setBody("1st body");
        return post;
    }
}