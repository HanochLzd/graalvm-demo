package com.hanoch.graalvmdemo.web;

import com.hanoch.graalvmdemo.jni.HelloWorld;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
public class HelloController {


    @GetMapping("/hello")
    public String hello() {
        log.info("Media Manager Service starting.");
        log.info("Media Manager Service starting===" + System.getProperty("java.library.path"));
        new HelloWorld().print();
        log.info("cpp add res = {}", new HelloWorld().add(1, 2));
        new HelloWorld().printAb(1, 3);
        return "HelloWorld";
    }

}
