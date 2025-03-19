package com.ms.user.infrastructure.user;

import com.ms.user.domain.user.User;
import com.ms.user.main.Response;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/users")
public class UserController {

    private final UserService service;

    public UserController(UserService service) {
        this.service = service;
    }

    @PostMapping()
    public ResponseEntity<Response<UserEntity>> saveUser(@RequestBody @Valid User user) {

        return ResponseEntity
                .status(HttpStatus.CREATED)
                .body(new Response<>(
                        HttpStatus.CREATED,
                        "User created",
                        service.saveUser(user)));
    }

}
