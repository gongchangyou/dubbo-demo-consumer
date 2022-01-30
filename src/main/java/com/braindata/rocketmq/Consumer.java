package com.braindata.rocketmq;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.cloud.stream.function.StreamBridge;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

/**
 * @author gongchangyou
 * @version 1.0
 * @date 2022/1/26 5:00 下午
 */
@Component
public class Consumer implements CommandLineRunner {

    @Autowired
    private MessageSource messageSource;

    @Autowired
    private StreamBridge messageChannel;

    /**
     * Callback used to run the bean.
     *
     * @param args incoming main method arguments
     * @throws Exception on error
     */
    @Override
    public void run(String... args) throws Exception {
        System.out.printf("asdf");
        while(true) {
            messageSource.input1().subscribe(msg -> System.out.println("payload=" + new String((byte[])msg.getPayload())));
        }
    }
}
