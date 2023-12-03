package com.im.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

/**
 * BusinessServiceImpl
 *
 * @author wliduo[i@dolyw.com]
 * @date 2020/5/20 11:59
 */
@Slf4j
@Service
public class BusinessServiceImpl implements BusinessService {

    @Override
    @Async("threadPoolTaskExecutor")
    public void udpHandleMethod(String message) throws Exception {
        log.info("业务开始处理");
        Thread.sleep(3000);
        log.info("业务处理完成");
    }
}
