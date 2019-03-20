package com.demoapollo.demoapollo.controller;

import com.demoapollo.demoapollo.config.AppConfig;
import com.demoapollo.demoapollo.config.TestJavaConfigBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {



    @GetMapping(value = "index")
    public String index(){
        String res = "Hello World!";
        return res;
    }

    @GetMapping(value = "test")
    public String test(){
        TestJavaConfigBean testJavaConfigBean = TestJavaConfigBean.getInstance();
        String timeout = String.valueOf(testJavaConfigBean.getTimeout());
        return "TimeOut: "+timeout;
    }
}
