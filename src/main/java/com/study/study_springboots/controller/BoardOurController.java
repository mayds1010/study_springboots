package com.study.study_springboots.controller;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.study.study_springboots.beans.BoardBean;
import com.study.study_springboots.service.DataInfors;

// * Cast 
// - use bootstrap
// - 항목 : title, content,userName, date
// - CRUD : 
//   + list.jsp(/board)게시판  -> view.jsp(/board_our/view)내 작성게시글보기 -> list.jsp(/board_our/list)게시판
//   + list.jsp(/board)게시판 -> form.jsp(/board_our/form)게시글작성 -> list.jsp(/board_our/save) with Post 작성한 게시글 게시판에 게시
//   + view.jsp(/board_our/view)내 작성게시글보기 -> edit.jsp(/board_our/edit) with Post 게시글 수정-> list.jsp(/board_our/save) with Post 수정된 게시글 확인
@Controller
@RequestMapping(value = "/board_our")
public class BoardOurController { 

    @RequestMapping(value = {"/","/list"}, method = RequestMethod.GET) //"/board_our/"
    public ModelAndView list(){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("firstString", "firstValue");
        DataInfors dataInfors = new DataInfors();
        ArrayList<BoardBean> boardList = dataInfors.getDataListWithBoardBean();
        modelAndView.addObject("boardList", boardList);

        modelAndView.setViewName("board_our/list");
        return modelAndView; //-->Dispatcher Servlet, 리턴하는곳만 영향을 줌 
    }

    @RequestMapping(value = "/view", method = RequestMethod.GET) //"/board_our/"
    public ModelAndView view(ModelAndView modelAndView){ //파라미터로 넘겨줌
        DataInfors dataInfors = new DataInfors();
        BoardBean boardBean = dataInfors.getDataWithMamberBean();
        modelAndView.addObject("boardBean", boardBean);

        modelAndView.setViewName("board_our/view");
        return  modelAndView;
    }

    @RequestMapping(value = "/edit", method = RequestMethod.POST) //"/board_our/edit"
    public ModelAndView edit(ModelAndView modelAndView){
        modelAndView.setViewName("board_our/edit");
        //edit with Post
        return  modelAndView;
    }

    @RequestMapping(value = "/form", method = RequestMethod.GET) //"/board_our/form"
    public ModelAndView form(ModelAndView modelAndView){
        modelAndView.setViewName("board_our/form");
        return modelAndView;
    }

    @RequestMapping(value = "/save", method = RequestMethod.POST) //"/board_our/save"
    public ModelAndView save(ModelAndView modelAndView){
        modelAndView.setViewName("board_our/list");
        //insert biz ,버튼을 누르면 list.jsp로 이동 ,save with POST!!
        return modelAndView;
    }
   
}
