package com.blackman.currentstudy.testthread;

import lombok.extern.slf4j.Slf4j;

@Slf4j(topic = "c.TestThread3")
public class TestThread3 {
    public static void main(String[] args) {
        // 使用呢lambda简化代码
        // 方式1
//        Runnable task1 = () -> log.debug("run....");
//        Thread t1 = new Thread(task1, "t1");
//        t1.start();

        // 方式2
        Thread t1 = new Thread(() -> log.debug("run..."));
        t1.start();
    }
}
