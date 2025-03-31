package com.blackman.currentstudy.testthread;

import lombok.extern.slf4j.Slf4j;

@Slf4j(topic = "c.TestThread1")
public class TestThread1 {
    public static void main(String[] args) {
        // 创建线程对象并起别名为 "t1"
        Thread t1 = new Thread("t1") {
            @Override
            public void run() {
                log.debug("run...");
            }
        };
        // 启动线程
        t1.start();
        // main线程打印
        log.debug("run...");
    }
}
