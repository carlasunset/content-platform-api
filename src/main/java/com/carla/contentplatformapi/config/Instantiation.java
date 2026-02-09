package com.carla.contentplatformapi.config;

import com.carla.contentplatformapi.domain.Post;
import com.carla.contentplatformapi.domain.User;
import com.carla.contentplatformapi.dto.AuthorDTO;
import com.carla.contentplatformapi.repository.PostRepository;
import com.carla.contentplatformapi.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;

import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.TimeZone;

@Configuration
public class Instantiation implements CommandLineRunner {

    @Autowired
    private UserRepository repository;

    @Autowired
    private PostRepository postRepository;

    @Override
    public void run(String... args) throws Exception {
        SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
        format.setTimeZone(TimeZone.getTimeZone("GMT"));

        repository.deleteAll();
        postRepository.deleteAll();

        User maria = new User(null, "Maria Brown", "maria@gmail.com");
        User alex = new User(null, "Alex Green", "alex@gmail.com");
        User bob = new User(null, "Bob Grey", "bob@gmail.com");
        repository.saveAll(Arrays.asList(maria, alex, bob));

        Post post1 = new Post(null, format.parse("21/03/2018"), "Trip time!", "I'm traveling to São Paulo. See you!", new AuthorDTO(maria));
        Post post2 = new Post(null, format.parse("23/03/2018"), "Good morning!", "Feeling happy this morning!", new AuthorDTO(maria));
        postRepository.saveAll(Arrays.asList(post1, post2));
    }
}
