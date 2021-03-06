<%@page import="domain.model.Person" %>
<%@page import="java.util.Collection" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
    <meta name="viewport" content="width=device-width, initial-scale=1"/>
    <meta charset="UTF-8">
    <title>Overview</title>
    <link rel="stylesheet" type="text/css" href="css/style.css">
</head>
<body>
<div id="container">
    <header>
        <h1><span>Web shop</span></h1>
        <nav>
            <ul>
                <li><a href="Controller">Home</a></li>
                <li id="actual"><a href="Controller?action=Overview">Overview</a></li>
                <li><a href="Controller?action=SignUp">Sign up</a></li>
                <li><a href="Controller?action=Products">products</a></li>
                <c:if test="${role == 'ADMIN'}">
                    <li><a href="Controller?action=AddProduct">add product</a></li>
                </c:if>
                <li><a href="Controller?action=Cart">show cart</a></li>
                <li><a href="Controller?action=Signin">Sign in</a></li>
            </ul>
        </nav>
        <h2>
            User Overview
        </h2>

    </header>
    <main>
        <table>
            <tr>
                <th>E-mail</th>
                <th>First Name</th>
                <th>Last Name</th>
            </tr>
            <tr>
                <td>jan.janssens@hotmail.com</td>
                <td>Jan</td>
                <td>Janssens</td>
            </tr>
                <c:forEach var ="personen" items = "${personen}" >
                    <tr>
                        <td><c:out value="${personen.email}"/></td>
                        <td><c:out value="${personen.firstName}"/></td>
                        <td><c:out value="${personen.lastName}"/></td>
                        <td><a href="Controller?action=DeletePerson&id=${personen.userid}">delete</a></td>
                        <td><a href="Controller?action=Checkpass&id=${personen.userid}">check</a></td>
                    </tr>
                </c:forEach>
            <caption>Users Overview</caption>
        </table>
    </main>
    <footer>
        &copy; Webontwikkeling 3, UC Leuven-Limburg
    </footer>
</div>
</body>
</html>