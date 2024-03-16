<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
    <%! //declarationtag
        int a=10;
        String name="roopa";
        
        int square()
        {
        	return a*a;
        }
      %>
      
     <%  //scriplettag
        out.println("a : "+a);
        out.println("name : "+name);
        out.println(square());
        
        int b=20;
        if(b<100)
        {
        	out.println("b is smaller than 100");
        }
        else
        {
        	out.println("b is greater than 100");
        }
        	
        for(int i=1; i<5; i++)
        {
        	out.println(i);
        }
        
        //we can also get request parameter
        //String name = request.getParameter("---")
     %>
     
     <%= a %> //expression tag instead of printing out.println();
     <%= name %>
     <%= Math.random() %>
     
     
</body>
</html>