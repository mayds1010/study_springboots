<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
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
    <div> /board/view.jsp(게시글상세페이지)</div>
    <div class="container">
  
    <table class="table">
    <thead>
    <tr>
       <th>Title</th>
       <td>
       ${boardBean.title}
       </td>
       
       <th>UserName</th>
       <td>
       ${boardBean.userName}
       </td>
       
       <th>Date </th>
       <td>
       ${boardBean.date}
       </td>
      
      </tr>
    </thead>
    <tbody>
    <th>Content </th>
    <td> ${boardBean.content}</td>
    </tbody>
      </table>
     
          <%-- <div>title</div>
      <div>content</div>
      <div>userName</div>
      <div>date</div> --%>
    <div>
            <form action="/board/list">
                <button>go list</button>
            </form>
            <form action="/board/edit" method="post">
                <button>edit</button>
            </form>
        </div>
    </div>
    <script
      src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/js/bootstrap.bundle.min.js"
      integrity="sha384-kenU1KFdBIe4zVF0s0G1M5b4hcpxyD9F7jL+jjXkk+Q2h455rYXK/7HAuoJl+0I4"
      crossorigin="anonymous"
    ></script>
  </body>
</html>
