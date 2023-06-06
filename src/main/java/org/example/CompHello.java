package org.example;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class CompHello {
    public void chello(@Value("${jwt.asdf}") String asdf) {
        System.out.println(asdf);
        System.out.println("Hello asdfasdf");
    }
}
