package com.study.study_springboots.service;

import java.util.ArrayList;
import java.util.HashMap;

import org.springframework.stereotype.Service;

import com.study.study_springboots.beans.BoardBean;

@Service
public class DataInfors { // service와 같음
    public HashMap<String, String> getSearchFormData() {
        HashMap<String, String> searchForm = new HashMap<String, String>();
        searchForm.put("search_key", "Search Title");
        searchForm.put("name", "요주의랩!");
        searchForm.put("id", "ID0001");
        return searchForm;
    }

    public ArrayList<String> getTablesListWithString() {
        ArrayList<String> tablesListWithString = new ArrayList<String>();
        tablesListWithString.add("@mdo");
        tablesListWithString.add("@fat");
        tablesListWithString.add("@twitter");
        return tablesListWithString;
    }

    public HashMap<String, Object> getBundlesData() {
        DataInfors DataInfors = new DataInfors();
        HashMap<String, String> searchForm = DataInfors.getSearchFormData();
        ArrayList<String> tablesListWithString = DataInfors.getTablesListWithString();

        HashMap<String, Object> bundlesData = new HashMap<>();
        bundlesData.put("searchForm", searchForm);
        bundlesData.put("tablesListWithString", tablesListWithString);

        bundlesData.put("dataWithMamberBean", DataInfors.getDataWithMemberBean());
        bundlesData.put("dataListWithBoardBean",
                DataInfors.getDataListWithBoardBean());

        return bundlesData;
    }

    public BoardBean getDataWithMemberBean() {
        BoardBean boardBean = new BoardBean();
        boardBean.setTitle("Mark");
        boardBean.setContent("Otto");
        boardBean.setUserName("@mdo");
        boardBean.setDate("23.01.12");
        return boardBean; // 첫번째실습 board_our/view.jsp에서 내용이 보여짐
    }

    public ArrayList<BoardBean> getDataListWithBoardBean() { // 두번째 실습 list
        ArrayList<BoardBean> membersList = new ArrayList<>();
        BoardBean boardBean = new BoardBean();
        boardBean.setTitle("Mark");
        boardBean.setContent("Otto");
        boardBean.setUserName("@mdo");
        boardBean.setDate("23.01.13");
        membersList.add(boardBean);

        boardBean = new BoardBean();
        boardBean.setTitle("Jacob");
        boardBean.setContent("Thornton");
        boardBean.setUserName("@fat");
        boardBean.setDate("23.01.13");
        membersList.add(boardBean);

        boardBean = new BoardBean();
        boardBean.setTitle("Larry");
        boardBean.setContent("Bird");
        boardBean.setUserName("@twitter");
        boardBean.setDate("23.01.13");
        membersList.add(boardBean);

        return membersList;
    }

    public ArrayList<BoardBean> getDataListWithBoardBean2() { // 두번째 실습 list
        ArrayList<BoardBean> boardList = new ArrayList<>(); // membersList
        BoardBean boardBean = new BoardBean();
        boardBean.setTitle("Hello");
        boardBean.setContent("안녕하세요");
        boardBean.setUserName("신짱구");
        boardBean.setDate("23.01.13");
        boardList.add(boardBean);

        boardBean = new BoardBean();
        boardBean.setTitle("Thankyou");
        boardBean.setContent("감사합니다");
        boardBean.setUserName("신영만");
        boardBean.setDate("23.01.14");
        boardList.add(boardBean);

        boardBean = new BoardBean();
        boardBean.setTitle("Sorry");
        boardBean.setContent("죄송합니다");
        boardBean.setUserName("봉미선");
        boardBean.setDate("23.01.15");
        boardList.add(boardBean);

        return boardList;
    }

    public BoardBean getDataListViewWithBoardBean(String title) {
        BoardBean boardBean = new BoardBean();
        for (BoardBean boardView : getDataListWithBoardBean2()) {
            if (title.equals(boardView.getTitle())) {
                boardBean.setTitle(boardView.getTitle());
                boardBean.setContent(boardView.getContent());
                boardBean.setUserName(boardView.getUserName());
                boardBean.setDate(boardView.getDate());

                break;
            } else {
                boardBean.setTitle("error");
                boardBean.setContent("error");
                boardBean.setUserName("error");
                boardBean.setDate("error");

            }
        }
        return boardBean;

    }

    public BoardBean paramDataBean(HashMap<String, String> params) {
        String title = params.get("title");
        String content = params.get("content");
        String userName = params.get("userName");
        String date = params.get("date");

        BoardBean boardBean = new BoardBean();
        boardBean.setTitle(title);
        boardBean.setContent(content);
        boardBean.setUserName(userName);
        boardBean.setDate(date);

        return boardBean;
    }
}
