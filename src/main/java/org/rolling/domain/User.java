package org.rolling.domain;
import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Table(name = "users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", updatable = false, nullable = false)
    private long userNo;

    @Column(name = "user_id")
    private String userId;

    @Column(name = "user_name")
    private String userName;

    @Column(name = "user_pw")
    private String userPw;

    @Column(name = "rollingpaper_count")
    private int userRollingpaperCount;

    @Builder//빌더 패턴으로 객체 생성
    public User(long no, String id, String name, String pw, int rollingpaperCount){
        this.userNo = no;
        this.userId = id;
        this.userName = name;
        this.userPw = pw;
        this.userRollingpaperCount = rollingpaperCount;
    }
}