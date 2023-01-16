<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
    <link
    href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css"
    rel="stylesheet"
    integrity="sha384-rbsA2VBKQhggwzxH7pPCaAqO46MgnOM80zW1RWuH61DGLwZJEdK2Kadq2F9CUG65"
    crossorigin="anonymous"
  />
</head>
<body>
    <div>/board_our/edit</div>
    <div class="container"> 
    <form action="/notice/save" method = "post">
    <%-- 완료페이지가 보여져야 하니까 save를 post로 --%>
      <div>
        <label for="title">title</label>
        <input type="text " class="form-control" name="title" id="title" value="${boardBean.title}"/>
      </div>
      <div>
        <label for="userName">userName</label>
        <input type="text" class="form-control" name="userName" id="userName" value="${boardBean.userName}"/>
      </div>
      <div>
        <label for="content">content</label>
        <input type="text" class="form-control" name="content" id="content" value="${boardBean.content}"/>
      </div>
      <div>
        <label for="date">content</label>
        <input type="date" class="form-control" name="date" id="date" value="${boardBean.date}"/>
      </div>
      <div>
        <button>update</button>
        <%--글을 수정하고 버튼 클릭 시 게시글완료 --%>
      </div>
       </div>
      <script
      src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/js/bootstrap.bundle.min.js"
      integrity="sha384-kenU1KFdBIe4zVF0s0G1M5b4hcpxyD9F7jL+jjXkk+Q2h455rYXK/7HAuoJl+0I4"
      crossorigin="anonymous"
    ></script>
</body>