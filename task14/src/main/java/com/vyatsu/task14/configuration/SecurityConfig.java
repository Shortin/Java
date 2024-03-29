package com.vyatsu.task14.configuration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

import javax.sql.DataSource;


@Configuration
@EnableWebSecurity
@EnableGlobalMethodSecurity(prePostEnabled = true)
public class SecurityConfig extends WebSecurityConfigurerAdapter {
private DataSource dataSource;
@Autowired
public void setDataSource(DataSource dataSource) {
    this.dataSource = dataSource;
}
@Override
protected void configure(AuthenticationManagerBuilder auth) throws Exception { // (1)
    auth.jdbcAuthentication().dataSource(dataSource);
}
@Override
protected void configure(HttpSecurity http) throws Exception {
    http.authorizeRequests()
            //.anyRequest().permitAll()
            .antMatchers("/products/delete/**").hasAnyRole("ADMIN")
            .and()
            .formLogin()
              .loginPage("/products")
              .loginProcessingUrl("/authenticateTheUser")
              .defaultSuccessUrl("/products");
            //.permitAll();
}
}

