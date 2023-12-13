//package vn.edu.iuh.fit.www_doanhoaian_week05.backend.config;
//
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.security.config.Customizer;
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
//import org.springframework.security.config.annotation.web.configuration.WebSecurityConfiguration;
//import org.springframework.security.core.userdetails.User;
//import org.springframework.security.core.userdetails.UserDetails;
//import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
//import org.springframework.security.crypto.password.PasswordEncoder;
//import org.springframework.security.provisioning.InMemoryUserDetailsManager;
//import org.springframework.security.web.SecurityFilterChain;
//
//@Configuration
//@EnableWebSecurity
//public class Sercuruty  {
//
//    @Bean
//    public InMemoryUserDetailsManager userDetailsService(PasswordEncoder encoder) {
//        UserDetails userDetails = User.withUsername("user")
//                .password(encoder.encode("111"))
//                .roles("User")
//                .build();
//
//        UserDetails admin = User.withUsername("Admin")
//                .password(encoder.encode("111"))
//                .roles("Admin")
//                .build();
//
//        return new InMemoryUserDetailsManager(userDetails, admin);
//    }
//
//    @Bean
//    public SecurityFilterChain filterChain(HttpSecurity httpSecurity) throws Exception {
//        httpSecurity.authorizeHttpRequests((auth) -> {
//                    auth
//
////                            .requestMatchers("/").hasRole("User")
//                            .requestMatchers("/list").hasRole("User")
////                            .requestMatchers("/moreinfor/{id}").hasRole("Admin")
//                            .anyRequest().permitAll();
//                }
//
//
//        );
//        httpSecurity.httpBasic(Customizer.withDefaults());
//        return httpSecurity.build();
//    }
//
//    @Bean
//    public static PasswordEncoder passwordEncoder() {
//        return new BCryptPasswordEncoder();
//    }
//
//}
