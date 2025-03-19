package com.ms.user.domain.user;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;

public record User(
        @NotBlank String username,
        @NotBlank @Email String email
)
{ }
