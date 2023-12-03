//package org.rolling.service.token;
//
//import lombok.RequiredArgsConstructor;
//import org.rolling.domain.RefreshToken;
//import org.rolling.repository.RefreshTokenRepository;
//import org.springframework.stereotype.Service;
//
//@RequiredArgsConstructor
//@Service
//public class RefreshTokenService {
//    private final RefreshTokenRepository refreshTokenRepository;
//
//    public RefreshToken findByRefreshToken(String refreshToken) {
//        return refreshTokenRepository.findByRefreshToken(refreshToken)
//                .orElseThrow(() -> new IllegalArgumentException("Unexpected token"));
//    }
//}
