package com.ref.service;


import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.math.BigInteger;
import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 * Created by admi on 2017/9/29.
 */
@Service
@Slf4j
public class javaservice {

    final String finalparam="这个是finale数据";
    @PostConstruct
    public void init() {
        log.info("测试服务启动。。。。");
        System.out.println("hello word!");

        double douparam=16.54;
        String intstring = "16";
        String[] array={"ddd","3333"};
        BigInteger bi= BigInteger.valueOf(100);
        log.info("输出的doubale数据为:"+douparam);
        log.info("平方根："+Math.sqrt(douparam));
        log.info("舍入："+ Math.round(douparam));
        log.info("类型："+Tyle.t_c);
        log.info("String Substring:"+finalparam.substring(2,3));
        log.info("Cast转换："+ ((int) douparam));
//        log.info("Cast转换："+ (((int) intstring)));
        log.info("char at:{}",intstring.charAt(1));
        log.info("offsetbycodepoint:{}",finalparam.offsetByCodePoints(1,2));
        log.info("biginteger:{}",bi);
        for (String i:array) {
            log.info("for输出数组信息{}",i);
        }
        GregorianCalendar   now= new GregorianCalendar();
        int month = now.get(Calendar.MONTH);
        log.info("当前的月为:{}",month);
        log.info("parsit:{}",Integer.parseInt("123"));
    }


    enum Tyle{
        t_g,
        t_c
    }
}
