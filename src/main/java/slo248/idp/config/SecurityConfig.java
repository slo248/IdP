package slo248.idp.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;

@Configuration
public class SecurityConfig {
    @Bean
    UserDetailsService userDetailsService() {
        var manager = new InMemoryUserDetailsManager();
        manager.createUser(
                User.withUsername("john")
                        .password("P@ssw0rd1!")
                        .roles("ADMIN")
                        .build());
        manager.createUser(
                User.withUsername("amy")
                        .password("P@ssw0rd2!")
                        .roles("USER")
                        .build());
        manager.createUser(
                User.withUsername("bill")
                        .password("P@ssw0rd3!")
                        .roles("USER")
                        .build());
        return manager;
    }
}
