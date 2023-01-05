package com.study.study_springboots.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller //문지기역할,뭐든지 조절(list를 가지고 있음)
public class HomeController {
    @RequestMapping(value = {"", "/", "/main"}) //@RequestMapping()-괄호가 있기때문에 funtion(생성자)  
    public String main(){ 
        int i = 0;
        return "WEB-INF/views/main.jsp";
    }
    @RequestMapping(value = "/home") //http://localhost:8080/home
    public void home(){ 
        int i = 0;   
    }//Check your ViewResolver setup - 경로와 파일이 있는지 확인하기(jsp가 없어서 에러남)
    @RequestMapping(value = "/homejsp") 
    public String homejsp(){ //void를 String으로
        int i = 0;
        return "WEB-INF/views/home.jsp";
    }
    @RequestMapping(value = "/homehtml") 
    public String homehtml(){ //void를 String으로
        int i = 0;
        return "WEB-INF/views/home.html";
    }
}
