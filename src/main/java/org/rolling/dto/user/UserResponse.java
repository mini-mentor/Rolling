package org.rolling.dto.user;

import lombok.Getter;
import org.rolling.domain.User;

@Getter
public class UserResponse {
    private final long userNo;
    private final String userId;
    private final String userName;
    private final String userPw;
    private final int rollingpaperCount;

    public UserResponse(User user){
        this.userNo = user.getUserNo();
        this.userId = user.getUserId();
        this.userName = user.getUserName();
        this.userPw = user.getUserPw();
        this.rollingpaperCount = user.getUserRollingpaperCount();

    }
}