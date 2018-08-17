package com.HelloWorld.Helloworld;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("alterText")
public class alterText implements TextInput {

    public String makeText(String s) {
        return s.toUpperCase();
    }
}
