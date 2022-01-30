package com.braindata.dubbodemo;

import com.braindata.dubbodemo.intf.StuRpcService;
import com.braindata.rocketmq.MessageSource;
import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@EnableBinding({MessageSource.class})
@SpringBootApplication(scanBasePackages = "com.braindata")
//@EnableDubbo
public class DubboDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(DubboDemoApplication.class, args);
    }

}
