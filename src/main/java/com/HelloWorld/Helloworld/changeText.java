package com.HelloWorld.Helloworld;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("changeText")
public class changeText implements TextInput {

    public String makeText(String s) {
        return "Wazzup " + s;
    }
}
