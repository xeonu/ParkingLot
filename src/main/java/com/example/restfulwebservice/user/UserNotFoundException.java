package com.example.restfulwebservice.user;

// 2xx -> ok
// 4xx -> client 오류
// 5xx -> server 오

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND) // 400번대 오류로 출력
public class UserNotFoundException extends RuntimeException {
    public UserNotFoundException(String message) {
        super(message);
    }
}
