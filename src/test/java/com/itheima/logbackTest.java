package com.itheima;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class logbackTest {
    private final static Logger log = LoggerFactory.getLogger(logbackTest.class);

    @Test
    public void testLog() {
        log.debug("开始计算。。。");
        int sum = 0;
        int[] nums = { 1, 3, 5, 6, 7, 7, 8, 3, 343, 53, 643, 65, 78 };
        for (int num : nums) {
            sum += num;
        }
        log.info("计算结果为：" + sum);
        log.debug("计算结束。。。");
    }
}
