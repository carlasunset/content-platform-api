package com.carla.contentplatformapi.services;

import com.carla.contentplatformapi.domain.Post;
import com.carla.contentplatformapi.repository.PostRepository;
import com.carla.contentplatformapi.services.exception.ObjectNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class PostService {

    @Autowired
    private PostRepository repository;

    public Post findById(String id) {
        Optional<Post> obj = repository.findById(id);
        return obj.orElseThrow(() -> new ObjectNotFoundException("Object not found!"));
    }
}

