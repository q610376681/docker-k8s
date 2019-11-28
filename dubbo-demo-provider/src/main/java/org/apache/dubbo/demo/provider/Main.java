package org.apache.dubbo.demo.provider;

/**
 * @ClassName: Main
 * @Description: TODO
 * @Author: ZhangChen
 * @Date: 2019/11/26 21:00
 **/
import org.apache.dubbo.demo.DemoService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.builder.SpringApplicationBuilder;

@EnableAutoConfiguration
public class Main {
    public static void main(String[] args) throws Exception {
        new SpringApplicationBuilder(Main.class)
                .run(args);
    }
}
