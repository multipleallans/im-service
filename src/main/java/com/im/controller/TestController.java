package com.im.controller;

import com.im.cache.BootNettyUdpDataCache;
import com.im.dto.BootNettyUdpData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RefreshScope
@RestController
public class TestController {

    @Value("${test.content}")
    private String testContent;



    @RequestMapping("/get")
    public String get() {
        return testContent;
    }

    @RequestMapping("/testSendUdp")
    public String testSendUdp(String msg) {
        return msg;
    }

    @GetMapping(value = {"", "/"})
    public String index() {
        return "netty springBoot udp server demo";
    }

    @GetMapping("/dataList")
    public List<BootNettyUdpData> clientList() {
        return BootNettyUdpDataCache.bootNettyUdpDataList;
    }
}
