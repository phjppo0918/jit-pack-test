package org.example;

import org.springframework.beans.factory.annotation.Value;

public class CompHello {
    private final String adsf;

    public CompHello(String adsf) {
        this.adsf = adsf;
    }

    public void chello() {
        System.out.println(adsf);
        System.out.println("Hello asdfasdf");
    }
}
