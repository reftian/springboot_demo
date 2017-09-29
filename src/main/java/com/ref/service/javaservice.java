package com.ref.service;


import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;

/**
 * Created by admi on 2017/9/29.
 */
@Service
@Slf4j
public class javaservice {

    @PostConstruct
    public void init() {
        log.info("测试服务启动。。。。");
    }
}
