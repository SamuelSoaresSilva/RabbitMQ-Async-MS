package com.ms.user.infrastructure.user;

import com.ms.user.domain.user.User;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    private void saveUser(User user) {

    }

    public void validatedSaveUser(User user){
        saveUser(user);
    }
}
