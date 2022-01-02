package com.Sample.Sales.management.System.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

@EnableWebSecurity
@Configuration
public class SecurityConfig extends WebSecurityConfigurerAdapter {
    private static final String ROLE_1 = "ADMIN";
    private static final String ROLE_2 = "USER";

    // In-memory users with roles
    @Override
    protected void configure(AuthenticationManagerBuilder authenticationManagerBuilder) throws Exception {
        authenticationManagerBuilder.inMemoryAuthentication()
                .withUser("admin")
                .password(passwordEncoder().encode("@123"))
                .roles(ROLE_1)
                .and()
                .withUser("user")
                .password(passwordEncoder().encode("123"))
                .roles(ROLE_2);
    }
    @Bean
    public PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }
    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.authorizeRequests()
                .antMatchers("/user/**").hasRole(ROLE_1)
                .antMatchers("/orders/**").hasRole(ROLE_1)
                .antMatchers("/spare_parts/**").hasRole(ROLE_1)
                .antMatchers("/sparepartstype/**").hasRole(ROLE_1)
                .antMatchers("/user/**").hasAnyRole(ROLE_2, ROLE_1)
                .and().formLogin();
    }
      }

    /*

    .antMatcher("/spare_parts/**").authorizeRequests().anyRequest().hasRole("ADMIN")
                        .and().formLogin()
                        .permitAll().and()
                .antMatcher("/sparepartstype/**").authorizeRequests().anyRequest().hasRole("ADMIN")
                        .and().formLogin()
                        .permitAll().and()
                .antMatcher("/user/**").authorizeRequests().anyRequest().hasRole("ADMIN")
                        .and().formLogin()
                        .permitAll();
     */
/*
  @Override
    public void configure(AuthenticationManagerBuilder auth) throws Exception
    {
        auth.inMemoryAuthentication().withUser("user")
                .password("toor").roles("USER");
        auth.inMemoryAuthentication().withUser("Admin")
                .password("admin").roles("ADMIN");
    }

    public void configure(HttpSecurity http) throws Exception
    {
        http.antMatcher("/user/**").authorizeRequests().anyRequest().hasRole("USER")
                .and().formLogin().permitAll();




 */