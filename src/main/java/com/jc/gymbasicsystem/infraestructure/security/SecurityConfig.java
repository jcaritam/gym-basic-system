package com.jc.gymbasicsystem.infraestructure.security;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.authentication.configuration.AuthenticationConfiguration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;



@Configuration
@EnableWebSecurity
public class SecurityConfig {
    @Bean
    public PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }

    @Bean
    protected SecurityFilterChain configure(HttpSecurity httpSecurity) throws Exception {

        httpSecurity.cors(Customizer.withDefaults())
                .csrf((csrf) -> csrf.disable())
                .authorizeHttpRequests((auth) -> auth
                        .requestMatchers("/api/employees").permitAll()
                        .requestMatchers("/api/employees/create").permitAll()
                        .anyRequest().authenticated()
                );

        return httpSecurity.build();
    }

    @Bean
    public AuthenticationManager authenticationManagerBean(
            AuthenticationConfiguration configuration
    ) throws Exception {
        return configuration.getAuthenticationManager();
    }
}
