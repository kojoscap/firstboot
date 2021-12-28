package com.kojos.firstboot.service;

import com.kojos.firstboot.model.Role;
import com.kojos.firstboot.model.Users;
import com.kojos.firstboot.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private PasswordEncoder passwordEncoder;

    public Users save(Users users){
        String encodedPassword = passwordEncoder.encode(users.getPassword());
        users.setPassword(encodedPassword);
        users.setEnabled(true);

        Role role = new Role();
        role.setId(1l);
//        users.getRoles().add(role);
        return userRepository.save(users);

    }
}
