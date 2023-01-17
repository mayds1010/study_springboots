package com.study.study_springboots.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.study.study_springboots.dao.CommonCodeDao;

@Controller
@RequestMapping(value = "/commonCode")
public class CommonCodeController {

    @Autowired
    CommonCodeDao commonCodeDao;

    @RequestMapping(value = "/list") // http://localhost:8080/home
    public void list() {
        // Object result = CommonCodeDao.getList();
        int i = 0;
    }
}
