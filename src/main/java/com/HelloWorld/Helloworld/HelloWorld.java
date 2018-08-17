package com.HelloWorld.Helloworld;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorld {

    @Autowired
    @Qualifier("alterText")
    TextInput alter;

    @Autowired
    @Qualifier("changeText")
    TextInput change;

    @RequestMapping("/")
    public String index() {
        return change.makeText("Herbal");
    }

}
