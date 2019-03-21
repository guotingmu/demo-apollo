package com.demoapollo.demoapollo.config;

import org.springframework.beans.factory.annotation.Value;

public class TestJavaConfigBean {

    private static volatile TestJavaConfigBean testJavaConfigBean;

    private TestJavaConfigBean(){}

    public static TestJavaConfigBean getInstance() {
        if (testJavaConfigBean == null){
            synchronized(TestJavaConfigBean.class){
                if (testJavaConfigBean == null){
                    testJavaConfigBean = new TestJavaConfigBean();
                }
            }
        }
        return testJavaConfigBean;
    }

    @Value("${timeout:100}")
    private int timeout;
    @Value("${batch:200}")
    private int batch;

    public void setBatch(int batch) {
        this.batch = batch;
    }

    public int getTimeout() {
        return timeout;
    }

    public int getBatch() {
        return batch;
    }
}
