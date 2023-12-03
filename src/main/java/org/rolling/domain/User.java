//package org.rolling.domain;
//import jakarta.persistence.*;
//import lombok.*;
//import org.springframework.security.core.GrantedAuthority;
//import org.springframework.security.core.authority.SimpleGrantedAuthority;
//import org.springframework.security.core.userdetails.UserDetails;
//
//import java.util.Collection;
//import java.util.List;
//
//@Entity
//@Getter
//@NoArgsConstructor(access = AccessLevel.PROTECTED)
//@Table(name = "users")
//public class User implements UserDetails {
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    @Column(name = "id", updatable = false)
//    private long id;
//
//    @Column(name = "email",nullable = false, unique = true)
//    private String email;
//
//    @Column(name = "password")
//    private String password;
//
//    @Column(name = "nickname", unique = true)
//    private String nickname;
//
//    @Builder//빌더 패턴으로 객체 생성
//    public User(String email, String password, String nickname){
//        this.email = email;
//        this.password = password;
//        this.nickname = nickname;
//    }
//
//    // 사용자 이름 변경
//    public User update(String nickname) {
//        this.nickname = nickname;
//
//        return this;
//    }
//
//    @Override
//    public Collection<? extends GrantedAuthority> getAuthorities() {
//        return List.of(new SimpleGrantedAuthority("user"));
//    }
//
//    @Override
//    public String getUsername() {
//        return email;
//    }
//
//    @Override
//    public String getPassword() {
//        return password;
//    }
//
//    @Override
//    public boolean isAccountNonExpired() {
//        // 만료되었는지 확인하는 로직
//        return true; // true -> 만료되지 않았음
//    }
//
//    // 계정 잠금 여부 반환
//    @Override
//    public boolean isAccountNonLocked() {
//        // 계정이 잠금되었는지 확인하는 로직
//        return true; // true -> 잠금되지 않았음
//    }
//
//    // 패스워드의 만료 여부 반환
//    @Override
//    public boolean isCredentialsNonExpired() {
//        // 패스워드가 만료되었는지 확인하는 로직
//        return true; // true -> 만료되지 않았음
//    }
//
//    // 계정 사용 가능 여부 반환
//    @Override
//    public boolean isEnabled() {
//        // 계정이 사용 가능한지 확인하는 로직
//        return true; // true -> 사용 가능
//    }
//}