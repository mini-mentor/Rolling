//package org.rolling.dto.user;
//
//import lombok.AllArgsConstructor;
//import lombok.Getter;
//import lombok.NoArgsConstructor;
//import lombok.Setter;
//import org.rolling.domain.User;
//
//@NoArgsConstructor
//@AllArgsConstructor
//@Getter
//@Setter
//public class AddUserRequest {
//    private long id;
//    private String email;
//    private String password;
//
//    public User toEntity() {
//        return User.builder()
//                .email(email)
//                .password(password)
//                .build();
//    }
//}