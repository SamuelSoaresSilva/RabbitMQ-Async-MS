package com.ms.user.infrastructure.user;

import com.ms.user.domain.user.User;
import jakarta.transaction.Transactional;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    private final UserRepository repository;

    public UserService(UserRepository repository) {
        this.repository = repository;
    }

    @Transactional
    public UserEntity saveUser(User user) {
        return repository.save(validatedSaveUser(user));
    }

    private UserEntity validatedSaveUser(User user){
        UserEntity userEntity = new UserEntity();
        BeanUtils.copyProperties(user, userEntity);
        return userEntity;
    }
}
