package com.study.study_springboots.service;

import java.util.ArrayList;
import java.util.HashMap;

import com.study.study_springboots.beans.BoardBean;

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
        ArrayList<BoardBean> membersList = new ArrayList<>();
        BoardBean boardBean = new BoardBean();
        boardBean.setTitle("Hello");
        boardBean.setContent("안녕하세요");
        boardBean.setUserName("신짱구");
        boardBean.setDate("23.01.13");
        membersList.add(boardBean);

        boardBean = new BoardBean();
        boardBean.setTitle("Thankyou");
        boardBean.setContent("감사합니다");
        boardBean.setUserName("신영만");
        boardBean.setDate("23.01.14");
        membersList.add(boardBean);

        boardBean = new BoardBean();
        boardBean.setTitle("Sorry");
        boardBean.setContent("죄송합니다");
        boardBean.setUserName("봉미선");
        boardBean.setDate("23.01.15");
        membersList.add(boardBean);

        return membersList;
    }

    public BoardBean getDataListViewWithBoardBean(String title) {
        BoardBean boardBean = new BoardBean();
        for (BoardBean viewContent : getDataListWithBoardBean2()) {
            if (title.equals(viewContent.getTitle())) {
                boardBean.setTitle(viewContent.getTitle());
                boardBean.setContent(viewContent.getContent());
                boardBean.setUserName(viewContent.getUserName());
                boardBean.setDate(viewContent.getDate());

                break;
            } else {
                boardBean.setTitle("잘못 접근하였습니다");
                boardBean.setContent("잘못 접근하였습니다");
                boardBean.setUserName("잘못 접근하였습니다");
                boardBean.setDate("잘못 접근하였습니다");

            }
        }
        return boardBean;

    }

}
