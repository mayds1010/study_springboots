<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html lang="en">
  <head>
    <meta charset="UTF-8" />
    <meta http-equiv="X-UA-Compatible" content="IE=edge" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
    <title>Document</title>
    <link
      href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css"
      rel="stylesheet"
      integrity="sha384-rbsA2VBKQhggwzxH7pPCaAqO46MgnOM80zW1RWuH61DGLwZJEdK2Kadq2F9CUG65"
      crossorigin="anonymous"
    />
  </head>
  <body>
    <div>board_our/list</div>
 <div>
    <%
       String firstWithRequest = (String)request.getAttribute("firstString");
    %>
        <div>With Request.getAttribute : <%= firstWithRequest %></div>
    </div>
    <div>
        <div>With Get Value on JSP : ${firstString}, ${boardList}</div>
    </div>

    <%-- <div>
        <div>With Get Value on JSTL : <c:out value="${firstString}" /></div>
    </div> --%>
     <%--<div>set Value with Code Block</div>
    <div><% int num = 0; %>set : <%= num %>, ${num}</div> --%>
    
    <%-- <div>set Value with JSTL</div>
    <div><c:set var="num_02" value="2" /> set : <c:out value="${num_02}" /></div> --%>


  <div>jstl if</div>
  <%-- @ if(){}@ 원래 쓰던 방법 - <c:if  > --%>
  <%-- ... --%>
  <%-- @ } 원래 쓰던 방법- </c:if  > --%>
    <c:if test="${firstString eq 'firstValue'}">
      <h3> Matching : firstString eq 'firstValue'</h3>
    </c:if>
    <c:set var="firstString" value="good" />
    <c:if test="${firstString ne 'firstValue'}"> <%-- ne를 eq로 하니까 거짓이므로 출력이 안됨  --%>
    <h3>Not Matching : firstString ne 'good'</h3>
   </c:if>
    <c:set var="num_first" value="5" />
    <c:if test="${num_first gt 5}">
    <h4> greater than 5 </h4>
   </c:if>
   <div>jstl switch</div>
   <c:choose>
    <c:when test="${num_first eq 3}" >
       num_first eq 3이다
    </c:when>
    <c:when test="${num_first eq 5}">
       num_first eq 5이다
    </c:when>
    <c:otherwise>
       num_first  5보다 크다
    </c:otherwise>  <%-- else가 따로 없으니까 switch를 사용하면 됨 --%>
  </c:choose>
  <div>jstl for</div>
   <%-- for(int i = 0; i <boardList.size(); i++){  --%>
  <%-- BoardBean value =  boardList.get(i) --%>
   <%-- } 원래방법 --%>
   <%-- for(BoardBean board : boardList){  --%>
   <%-- board.getTitle() --%>
  <%-- } 아래와 같은 --%>
  <c:forEach var="board" items="${boardList}" varStatus="status">
        <div>${board.title}, ${board.userName} : ${status.count}, ${status.index}, ${status.first}, ${status.last}</div>
    </c:forEach>

    <div class="container"> 
      <table class="table">
        <thead>
            <tr>
                <th scope=>#</th>
                <th scope= class="col-9">Title</th>
                <th scope=>user name</th>
                <th scope=>date</th>
            </tr>
        </thead>
        <tbody>
            <tr>
            <%--Hello를 클릭시 글 작성목록을 볼 수 있는 view페이지로 이동  --%>
                <th scope=>1</th>
                <td><a href="/board_our/view?uid=Hello">Hello</a></td>
                <td>Mark</td>
                <td>22.11.11</td>
            </tr>
            <tr>
            <%--Jacob를 클릭시 글 작성목록을 볼 수 있는 view페이지로 이동  --%>
                <th scope=>2</th>
                <td><a href="/board_our/view?uid=Jacob">Jacob</a></td>
                <td>Jacob</td>
                <td>22.11.11</td>
            </tr>
            <tr>
            <%--Larry를 클릭시 글 작성목록을 볼 수 있는 view페이지로 이동  --%>
                <th scope=>3</th>
                <td><a href="/board_our/view?uid=Larry">Larry</a></td>
                <td>Larry</td>
                <td>22.11.11</td>
            </tr>
        </tbody>
    </table>
<%--form을 클릭시 글을 작성할 수 있는 form페이지로 이동   --%>
<div><form action="/board_our/form"><button>form</button></form><div>
</div>
    <script
      src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/js/bootstrap.bundle.min.js"
      integrity="sha384-kenU1KFdBIe4zVF0s0G1M5b4hcpxyD9F7jL+jjXkk+Q2h455rYXK/7HAuoJl+0I4"
      crossorigin="anonymous"
    ></script>
  </body>
</html>