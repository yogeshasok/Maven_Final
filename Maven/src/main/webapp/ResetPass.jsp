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
    <form action="<%=application.getContextPath() %>/ResetServlet" method="post">
        <h2 class="text-center">Password Resetting</h2>
        <div class="form-group">
            <input type="text" name="uname" class="form-control" value="<% out.println(session.getAttribute("uname"));%>" readonly>
        </div>       
        <div class="form-group">
            <input type="password" name="oldpass" class="form-control" placeholder="Old Password" required="required">
        </div>
        <div class="form-group">
            <input type="password" name= "newpass" class="form-control" placeholder="New Password" required="required">
        </div>
        <div class="form-group">
            <input type="password" name="newrepass" class="form-control" placeholder="Confirm Password" required="required">
        </div>
        <div class="form-group">
            <button type="submit" class="btn btn-primary btn-block">Reset</button>
        </div>
        <%if(request.getAttribute("res")!=null){ %>
        <span><% out.println(request.getAttribute("res")); %></span>
           <%} %>    
    </form>
    
</div>
</body>
</html>