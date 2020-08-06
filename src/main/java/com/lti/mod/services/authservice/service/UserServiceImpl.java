package com.lti.mod.services.authservice.service;

import com.lti.mod.services.authservice.model.User;
import com.lti.mod.services.authservice.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class UserServiceImpl implements com.lti.mod.services.authservice.service.UserService {

    @Autowired
    private com.lti.mod.services.authservice.repository.UserRepository userRepository;

    @Autowired
    private PasswordEncoder passwordEncoder;

    @Override
    public User saveUser(User user) {
        user.setPassword(passwordEncoder.encode(user.getPassword()));
        return userRepository.save(user);
    }

    @Override
    public User findByName(String name) {
        return userRepository.findByName(name).orElse(null);

    }

    @Override
    public User findByEmail(String email) {
        return userRepository.findByEmail(email).orElse(null);
    }

}
