package org.rolling.dto;

import lombok.Getter;
import org.rolling.domain.User;

@Getter
public class UserResponse {
    private final int no;
    private final String email;
    private final  String pw;
    private final String name;
    private  final int rolling_paper_no;

    public UserResponse(User user){
        this.no = user.getUser_no();
        this.email = user.getUser_id();
        this.pw = user.getUser_pw();
        this.name = user.getUser_name();
        this.rolling_paper_no = user.getUser_rollingpaper_count();
    }
}