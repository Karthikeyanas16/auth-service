package com.lti.mod.services.authservice.service;

import com.lti.mod.services.authservice.model.User;

import javax.swing.text.html.Option;
import java.util.List;
import java.util.Optional;

public interface UserService {
    User saveUser(User user);

    User findByName(String name);

    User findByEmail(String email);


}
