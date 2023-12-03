//package org.rolling.config.oauth;
//
//import lombok.RequiredArgsConstructor;
//import org.rolling.config.TokenAuthenticationFilter;
//import org.rolling.config.jwt.TokenProvider;
//import org.rolling.repository.RefreshTokenRepository;
//import org.rolling.service.user.UserService;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.http.HttpStatus;
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//import org.springframework.security.config.annotation.web.configuration.WebSecurityCustomizer;
//import org.springframework.security.config.http.SessionCreationPolicy;
//import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
//import org.springframework.security.oauth2.client.web.AuthorizationRequestRepository;
//import org.springframework.security.oauth2.core.endpoint.OAuth2AuthorizationRequest;
//import org.springframework.security.web.SecurityFilterChain;
//import org.springframework.security.web.authentication.AuthenticationSuccessHandler;
//import org.springframework.security.web.authentication.HttpStatusEntryPoint;
//import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;
//import org.springframework.security.web.util.matcher.AntPathRequestMatcher;
//
//@RequiredArgsConstructor
//@Configuration
//public class WebOAuthSecurityConfig {
//    private final OAuth2UserCustomService oAuth2UserCustomService;
//    private final TokenProvider tokenProvider;
//    private final RefreshTokenRepository refreshTokenRepository;
//    private final UserService userService;
//
//    @Bean
//    public WebSecurityCustomizer configure() {// 스프링 시큐리티 기능 비활성화
//        return (web) -> web.ignoring()
//                .requestMatchers(toString())
//                .requestMatchers("/img/**", "/css/**", "/js/**");
//    }
//
//    @Bean
//    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
//        // 토큰 방식으로 인증을 하기 때문에 기존에 사용하던 폼로그인, 세션 비활성화
//        http.csrf().disable()
//                .httpBasic().disable()
//                .formLogin().disable()
//                .logout().disable();
//
//        http.sessionManagement()
//                .sessionCreationPolicy(SessionCreationPolicy.STATELESS);
//
//        // 헤더를 확인할 커스텀 필터 추가
//        http.addFilterBefore(tokenAuthenticationFilter(), UsernamePasswordAuthenticationFilter.class);
//
//        // 토큰 재발급 URL은 인증없이 접근 가능하도록 설정. 나머지 API URL은 인증 필요
//        http.authorizeHttpRequests()
//                .requestMatchers("/api/token").permitAll()
//                .requestMatchers("/api/**").authenticated()
//                .anyRequest().permitAll();
//
//        http.oauth2Login()
//                .loginPage("/login")
//                .authorizationEndpoint()
//                // Authorization 요청과 관련된 상태 저장
////                .authorizationRequestRepository(oAuth2AuthorizationRequestBasedOnCookieRepository())
//                .and()
////                .successHandler(oAuth2SuccessHandler())// 인증 성공 시 실행할 핸들러
//                .userInfoEndpoint()
//                .userService(oAuth2UserCustomService);
//
//        http.logout()
//                .logoutSuccessUrl("/login");
//
//        // /api 로 시작하는 url의 경우, 401 상태 코드를 반환하도록 예외 처리
//        http.exceptionHandling()
//                .defaultAuthenticationEntryPointFor(new HttpStatusEntryPoint(HttpStatus.UNAUTHORIZED),
//                        new AntPathRequestMatcher("/api/**"));
//        return http
//                .authorizeHttpRequests()// 인증, 인가 설정
//                .requestMatchers("/login", "/signup", "/user").permitAll()
//                .anyRequest().authenticated()
//                .and()
//                .formLogin()// 폼 기반 로그인 설정
//                .loginPage("/login")
//                .defaultSuccessUrl("http://127.0.0.1:5502/main.html")
//                .and()
//                .logout()
//                .logoutSuccessUrl("/login")
//                .invalidateHttpSession(true)
//                .and()
//                .csrf().disable()// csrf 비활성화
//                .build();
//    }
//
////    @Bean
////    public AuthenticationSuccessHandler oAuth2SuccessHandler() {
////        return new OAuth2SuccessHandler(tokenProvider,
////                refreshTokenRepository,
////                oAuth2AuthorizationRequestBasedOnCookieRepository(),
////                userService);
////    }
//
//    @Bean
//    public TokenAuthenticationFilter tokenAuthenticationFilter() {
//        return new TokenAuthenticationFilter(tokenProvider);
//    }
//
////    @Bean
////    public AuthorizationRequestRepository<OAuth2AuthorizationRequest> oAuth2AuthorizationRequestBasedOnCookieRepository() {
////        return new OAuth2AuthorizationRequestBasedOnCookieRepository();
////    }
//
//    @Bean
//    public static BCryptPasswordEncoder bCryptPasswordEncoder() {
//        return new BCryptPasswordEncoder();
//    }
//}
