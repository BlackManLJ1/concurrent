package com.blackman.currentstudy.testthread;

import lombok.extern.slf4j.Slf4j;

@Slf4j(topic = "c.TestThread2")
public class TestThread2 {

    public static void main(String[] args) {
        // 创建需要执行的任务对象
        Runnable task1 = new Runnable() {
            @Override
            public void run() {
                log.debug("run....");
            }
        };
        // 创建了线程对象 第一个参数为需要执行的任务 第二个参数为线程名
        Thread t1 = new Thread(task1, "t1");
        // 启动线程
        t1.start();
    }
}
