package com.hanoch.graalvmdemo;

import com.hanoch.graalvmdemo.jni.HelloWorld;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class GraalvmDemoApplication {

	public static void main(String[] args) {
		new HelloWorld().print();
		SpringApplication.run(GraalvmDemoApplication.class, args);
	}

}
