package com.ms.user.domain.user;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;

import java.util.UUID;

public record User(
        @NotBlank String username,
        @NotBlank @Email String email
)
{ }
