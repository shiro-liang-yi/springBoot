package org.liang.controller;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@EnableAutoConfiguration
public class SampleController {

    @RequestMapping("/")
    @ResponseBody
    String home(){
        return "Hello World";
    }
    public static void main(String[] args) throws Exception{
        /**
         * @description
         * @author shiro.liang.yi@gmail.com
         * @date 2018-06-13 14:27
         * @param [args]
         * @return void
         */
        SpringApplication.run(SampleController.class,args); //这个是主程序类
    }
}
