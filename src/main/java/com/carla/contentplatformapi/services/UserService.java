package com.carla.contentplatformapi.services;

import com.carla.contentplatformapi.domain.User;
import com.carla.contentplatformapi.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserRepository repository;

    public List<User> findAll(){
        return repository.findAll();
    }

}
