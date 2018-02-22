<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
<link rel="stylesheet" href="css/index.css"/> 
<title>Insert title here</title>
</head>
<body>
<div class="login-form">
    <form action="<%=application.getContextPath() %>/RegistrationServlet" method="post">
        <h2 class="text-center">Registration</h2>       
        <div class="form-group">
            <input type="text" name = "uname" class="form-control" placeholder="Username" required="required">
        </div>
        <div class="form-group">
            <input type="email" class="form-control" name="email" placeholder="Email" required="required">
        </div>
        <div class="form-group">
            <input type="password" class="form-control" name="pass" placeholder="Password" required="required">
        </div>
        <div class="form-group">
            <input type="password" class="form-control" name = "repass" placeholder="Confirm Password" required="required">
        </div>
        <div class="form-group">
            <button type="submit" class="btn btn-primary btn-block">Register</button>
        </div>
                
    </form>
    <p class="text-center"><a href="index.jsp">Log in</a></p>
    <%if(request.getAttribute("msg")!=null){ %>
<div id="msg"><span><% out.println(request.getAttribute("msg")); %></span></div>
<%} %>
</div>

</body>
</html>