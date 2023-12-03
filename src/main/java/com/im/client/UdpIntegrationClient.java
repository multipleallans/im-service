package com.im.client;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.integration.ip.udp.UnicastSendingMessageHandler;
import org.springframework.integration.support.MessageBuilder;
import org.springframework.stereotype.Service;

/**
 * IntegrationClientConfig
 *
 * @author wliduo[i@dolyw.com]
 * @date 2020/5/20 15:59
 */
/**
 * Integration发送方式
 *
 * @author wliduo[i@dolyw.com]
 * @date 2020/5/20 15:53
 */
@Slf4j
@Service
public class UdpIntegrationClient {

    @Autowired
    private UnicastSendingMessageHandler unicastSendingMessageHandler;

    public void sendMessage(String message) {
        log.info("发送UDP: {}", message);
        unicastSendingMessageHandler.handleMessage(MessageBuilder.withPayload(message).build());
        log.info("发送成功");
    }

}
