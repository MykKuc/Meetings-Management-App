package com.example.vismameetingappwithdb.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;

/* Comments, notes about this:
- endpoint /logout by default turime sita

Basic Authentication (simpliest):
  .httBasic - cia yra basic
    Drawbacks yra, kad you CANT LOG OUT.

    ANT Matcher po authorizeRequests()  galima parasyti .antMatchers() ir .permitaAll() visus tuos isvardintus permitina.
    .antMatchers() svarbu, nes nereikalauja joio prisijungimo panaudojus.
*/

@Configuration
@EnableWebSecurity
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {

    private final PasswordEncoder passwordEncoder;

    @Autowired
    public WebSecurityConfig(PasswordEncoder passwordEncoder){
        this.passwordEncoder = passwordEncoder;
    }

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http
                .authorizeRequests()

                .antMatchers("/","index","/getmeetings")
                .permitAll()

                .anyRequest()
                .authenticated()
                .and()
                .httpBasic();
    }

    @Override
    @Bean
    protected UserDetailsService userDetailsService() {
       UserDetails userMykoliux = User.builder()
                .username("Mykoliux")
                .password(passwordEncoder.encode("password")) //Password must be encoded, otherwise we get an error.
                .roles("STUDENT") // ROLE_STUDENT
               .build();

       UserDetails userLinda = User.builder()
               .username("Linda")
               .password(passwordEncoder.encode("password123"))
               .roles("ADMIN")
               .build();

       return new InMemoryUserDetailsManager(userMykoliux,userLinda);
    }

}
