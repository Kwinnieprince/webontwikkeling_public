<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <meta name="viewport" content="width=device-width, initial-scale=1" />
    <meta charset="UTF-8">
    <title>Check</title>
    <link rel="stylesheet" type="text/css" href="css/style.css">
</head>
<body>
<div id="container">
    <header>
        <h1><span>Web shop</span></h1>
        <nav>
            <ul>
                <li><a href="Controller">Home</a></li>
                <li><a href="Controller?action=Overview">Overview</a></li>
                <li><a href="Controller?action=SignUp">Sign up</a></li>
                <li><a href="Controller?action=Products">products</a></li>
                <c:if test="${role == 'ADMIN'}">
                    <li><a href="Controller?action=AddProduct">add product</a></li>
                </c:if>
                <li><a href="Controller?action=Cart">show cart</a></li>
                <li id="actual"><a href="Controller?action=Signin">Sign in</a></li>
            </ul>
        </nav>
        <h2>
            Login
        </h2>
    </header>
    <form method="post" action="Controller?action=Login" novalidate="novalidate">
        <p><label for="password">Password</label><input type="password" id="password" name="password" required value="" ></p>
        <p><label for="id">id</label><input type="text" id="id" name="id" required ></p>
        <p><input type="submit" id="check" value="check password"></p>
    </form>
    <p>
        <c:if test="${not empty text}">
            <c:out value="${text}">
            </c:out>
        </c:if>
    </p>
</div>
</body>
</html>
