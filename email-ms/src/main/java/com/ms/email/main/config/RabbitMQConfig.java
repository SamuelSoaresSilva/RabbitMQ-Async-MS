package com.ms.email.main.config;


import org.springframework.amqp.core.Queue;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RabbitMQConfig {

    @Value("${broker.queue.email.name}")
    private String queue;

    @Bean
    public Queue emailQueue() {
        return new Queue(queue, true);
    }
}
