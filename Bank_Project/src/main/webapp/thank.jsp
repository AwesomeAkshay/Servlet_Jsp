<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Display Details</title>
</head>
<body>

    <h2>Display Details:</h2>
    <p><strong>Enter Id:</strong> <%= request.getParameter("user_id") %></p>
    <p><strong>Enter Name:</strong> <%= request.getParameter("user_name") %></p>
    <p><strong>Enter Address:</strong> <%= request.getParameter("user_address") %></p>
    <p><strong>Enter Date:</strong> <%= request.getParameter("date") %></p>
    <p><strong>Enter Salary:</strong> <%= request.getParameter("salaryRange") %></p>
    <p><strong>Account Type:</strong> <%= request.getParameter("accountType") %></p>
    <p><strong>Select Gender:</strong> <%= request.getParameter("user_gender") %></p>
    
    
    
</body>
</html>