package org.example;

import org.example.util.TestUtil;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@EnableWebMvc
@ServletComponentScan("org.example")
@ComponentScan(value = "org.example",lazyInit = true)
@SpringBootApplication
public class WebApplication extends SpringBootServletInitializer {

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
        boolean l = TestUtil.test(2);
        System.out.println(l);
        return builder.sources(WebApplication.class);
    }

    public static void main(String[] args) {
        SpringApplication.run(WebApplication.class, args);
    }

}