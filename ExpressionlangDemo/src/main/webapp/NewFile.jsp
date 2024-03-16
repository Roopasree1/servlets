<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
  <%
     request.setAttribute("requestname", "Roopa");
     //out.println(request.getAttribute("request_name"));
  %>
  <h3> Hello : ${requestScope.requestname} </h3>
  
  <%
    session.setAttribute("sessionname", "Roopa programmer");
    //out.println(session.getAttribute("sessionname"));
  %>
  <h3> company Name : ${sessionname}</h3>
  
  <form action="output.jsp" method="get">
      <input type="text" name="name1" placeholder="Enter Name" />
      <input type="submit" value="click Me" />
  </form>
</body>
</html>