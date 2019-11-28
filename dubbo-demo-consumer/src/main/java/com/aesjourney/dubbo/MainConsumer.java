package com.aesjourney.dubbo;

import org.apache.dubbo.config.annotation.Reference;
import org.apache.dubbo.demo.DemoService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

/**
 * @ClassName: MainConsumer
 * @Description: TODO
 * @Author: ZhangChen
 * @Date: 2019/11/26 21:11
 **/

@SpringBootApplication

public class MainConsumer {
    private final Logger logger = LoggerFactory.getLogger(getClass());
    @Reference(url = "dubbo://127.0.0.1:12345")
    public DemoService demoService;

    public static void main(String[] args) throws Exception {
        SpringApplication.run(MainConsumer.class).close();
    }
    @Bean
    public ApplicationRunner runner() {
        return args -> {
            logger.info(demoService.sayHello("mercyblitz"));
        };
    }
}
