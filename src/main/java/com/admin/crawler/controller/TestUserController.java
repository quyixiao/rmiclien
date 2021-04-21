package com.admin.crawler.controller;


import com.admin.crawler.service.XXRMIService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
public class TestUserController {


    @Autowired
    private XXRMIService helloRMIService;

    @RequestMapping("/rmiclient/test")
    public String rmiclienttest() {
        int c = helloRMIService.getAdd(1, 2);
        System.out.println(c);
        return "success";
    }

}
