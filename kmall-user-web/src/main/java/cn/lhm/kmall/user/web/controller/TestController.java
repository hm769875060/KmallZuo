package cn.lhm.kmall.user.web.controller;

import cn.lhm.kmall.bean.Member;
import cn.lhm.kmall.service.TestService;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class TestController {
    @Reference
    TestService testService;
    @RequestMapping(value = "/test")
    public List<Member> test(){
        List<Member> test = testService.test();
        return test;
    }

}
