package org.rolling.dto.user;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.rolling.domain.User;

@NoArgsConstructor
@AllArgsConstructor
@Getter
public class AddUserRequest {
    private int userNo;
    private String userId;
    private String userPw;
    private String userName;
    private int rollingpaperCount;

    public User toEntity() {
        return User.builder()
                .no(userNo)
                .id(userId)
                .pw(userPw)
                .name(userName)
                .rollingpaperCount(rollingpaperCount)
                .build();
    }
}