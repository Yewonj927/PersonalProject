package com.study.springboot.test.controller;

import com.study.springboot.test.dto.TestDto;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
    @GetMapping(value = "/hello")
    public String hello() {
        return "hello";
    }

    @GetMapping("/test")
    public TestDto test() {
        TestDto dto = new TestDto();
        dto.setName("홍");
        dto.setAge(10);
        return dto;
    }

}
