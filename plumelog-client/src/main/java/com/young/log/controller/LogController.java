package com.young.log.controller;


import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RequestMapping("/index")
@RestController
public class LogController {

    @GetMapping("/log")
    public String log(@RequestParam("param") String param) {
        log.info("this log is info");
        log.warn("this log is warning");
        log.error("this log is error");
        log.info("print log : {}", param);
        return "success";
    }
}
