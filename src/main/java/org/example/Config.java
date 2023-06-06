package org.example;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Config {
    @Bean
    public CompHello compHello(@Value("${jwt.asdf}") String asdf) {
        return new CompHello(asdf);
    }
}
