package com.ms.user.main;

import org.springframework.http.HttpStatus;

public record Response<T>(
        HttpStatus status,
        String description,
        T data
) {
}
