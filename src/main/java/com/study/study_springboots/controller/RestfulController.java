package com.study.study_springboots.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Map;
import java.util.HashMap;

@RestController
public class RestfulController {

    @RequestMapping(value = "/api/v1/helloworld", method = RequestMethod.GET)
    public String helloworld() {
        return "hello world !";
    }

    // params - title: "learn ajax!" , description: "we learn with ajax!"
    @RequestMapping(value = "/api/v1/requestParams", method = RequestMethod.GET)
    public Map requestParams(@RequestParam Map<String, Object> params) { // @RequestParam 브라우저에서 알아서 넘겨 줌
        Map<String, Object> result = new HashMap<String, Object>();
        result.putAll(params);
        result.put("id", "yojulab");
        return result;
    }
}
