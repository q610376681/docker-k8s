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
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

@SpringBootApplication
public class Main {
    public static void main(String[] args) throws Exception {
        SpringApplication.run(Main.class,args);
    }
}
