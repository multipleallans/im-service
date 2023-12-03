package com.im.controller;

import com.im.client.UdpIntegrationClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RefreshScope
@RestController
public class TestController {

    @Value("${test.content}")
    private String testContent;

    @Autowired
    UdpIntegrationClient udpIntegrationClient;

    @RequestMapping("/get")
    public String get() {
        return testContent;
    }

    @RequestMapping("/testSendUdp")
    public String testSendUdp(String msg) {
        udpIntegrationClient.sendMessage(msg);
        return msg;
    }
}
