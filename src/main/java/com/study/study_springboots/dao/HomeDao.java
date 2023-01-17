package com.study.study_springboots.dao;

import java.util.HashMap;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

@Repository
@Component // 디비연결고리
public class HomeDao { // <mapper namespace="Home">를 연결하기 위한
    @Autowired
    private SqlSessionTemplate sqlSessionTemplate; // myBatis에 연결하기 위한 자원(여기안에서만 사용)
    // HomeMapper.xml를 사용할 수 있음

    public Object getList() {
        String statement = "Home.selectFromANSWERSByQUESTIONS_UID";
        Map parameter = new HashMap();
        parameter.put("QUESTION_UID", "Q2"); // key,value넣어주기
        Object resultset = sqlSessionTemplate.selectList(statement, parameter);
        return resultset;
    }
}
