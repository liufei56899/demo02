package com.example.demo.test;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class controller {

    @ResponseBody
    @RequestMapping("/hello")
    public String hello(){
        return "heelo";
       /* synchronized ()
        synchronized ()*/
        //synchronized ()
//        System.out.println();
//        System.err.println();
    }
}
