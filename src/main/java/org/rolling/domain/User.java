package org.rolling.domain;
import jakarta.persistence.*;
import lombok.*;

import java.util.Date;

@Entity
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Table(name = "users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "user_no", updatable = false)
    private int user_no;

    @Column(name = "user_name", nullable = false)
    private String user_name;

    @Column(name = "user_id", nullable = false)
    private String user_id;

    @Column(name = "user_pw", nullable = false)
    private String user_pw;

    @Column(name = "user_rollingpaper_count", nullable = false)
    private int user_rollingpaper_count;

    @Builder//빌더 패턴으로 객체 생성
    public User(int user_no, String user_name, String user_id, String user_pw
    , int user_rollingpaper_count){
        this.user_no = user_no;
        this.user_name = user_name;
        this.user_id = user_id;
        this.user_pw = user_pw;
        this.user_rollingpaper_count = user_rollingpaper_count;
    }
}