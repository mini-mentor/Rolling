//package org.rolling.repository;
//
//import org.rolling.domain.RefreshToken;
//import org.springframework.data.jpa.repository.JpaRepository;
//
//import javax.swing.text.html.Option;
//import java.util.Optional;
//
//public interface RefreshTokenRepository extends JpaRepository<RefreshToken, Long> {
//    Optional<RefreshToken> findByUserId(Long userId);
//    Optional<RefreshToken> findByRefreshToken(String refreshToken);
//}
