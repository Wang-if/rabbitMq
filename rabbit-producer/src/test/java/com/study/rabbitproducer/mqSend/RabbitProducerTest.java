package com.study.rabbitproducer.mqSend;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class RabbitProducerTest {
    @Autowired
    private RabbitProducer producer;

    @Test
    public void testStringSend() throws InterruptedException {
        for (int i = 0; i < 10; i++) {
            Thread.sleep(3000);
            producer.stringSend();
        }
    }

    @Test
    public void testFanoutSend() {
        producer.fanoutSend();
    }


    @Test
    public void testTopic() {
        producer.topicTopic1Send();
        producer.topicTopic2Send();
        producer.topicTopic3Send();
    }
}