package com.imooc.sell;

import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @author wuguoqiong
 */
@RunWith(SpringRunner.class)
@SpringBootTest
@Slf4j
public class LoggerTest {
    private String im = "wwwww";
    private String im2 = "wwww222222w";
    @Test
    public void test1(){

        log.debug("debug...");
        log.info("info...");
        log.error("error...");
        log.info("我我我哦我我{}哇哇哇哇{}",im,im2);
    }

}
