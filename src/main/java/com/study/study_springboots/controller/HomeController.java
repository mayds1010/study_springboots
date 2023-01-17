package com.study.study_springboots.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.study.study_springboots.dao.HomeDao;

@Controller // 문지기역할,뭐든지 조절(list를 가지고 있음)
public class HomeController {

    @Autowired
    HomeDao homeDao;

    @RequestMapping(value = { "", "/", "/main" }) // @RequestMapping()-괄호가 있기때문에 funtion(생성자)
    public String main() {
        int i = 0;
        return "main";
    }

    @RequestMapping(value = "/home") // http://localhost:8080/home
    public void home() {
        Object result = homeDao.getList();
        int i = 0;
    }// Check your ViewResolver setup - 경로와 파일이 있는지 확인하기(jsp가 없어서 에러남)

    @RequestMapping(value = "/homejsp")
    public String homejsp() { // void를 String으로
        int i = 0;
        return "home";
    }

    @RequestMapping(value = "/homehtml")
    public String homehtml() { // void를 String으로
        int i = 0;
        return "home.html";
    }

    @RequestMapping(value = "/jstlformats")
    public String jstlformats() { // void를 String으로
        int i = 0;
        return "jstl_formats";
    }

}
