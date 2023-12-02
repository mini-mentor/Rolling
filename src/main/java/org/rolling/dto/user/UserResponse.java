package org.rolling.dto.user;

import lombok.Getter;
import org.rolling.domain.User;

@Getter
public class UserResponse {
    private final long id;
    private final String email;
    private final String password;

    public UserResponse(User user){
        this.id = user.getId();
        this.email = user.getEmail();
        this.password = user.getPassword();

    }
}