package org.example;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Config {
    public CompHello compHello(@Value("${jwt.asdf}") String asdf) {
        return new CompHello(asdf);
    }
}
