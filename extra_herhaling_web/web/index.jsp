<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Veggie</title>
<link rel="stylesheet" href="css/sample.css">
</head>
<body>

	<main>
	<article>
		<h1>Veggie</h1>
		<p><a href="Controller?action=ShowAll">Toon mij alle producten.</a> </p>

		<p>Je bent momenteel <c:out value="${veggindex}"/> vegetarisch.</p>

		<form method="post" action="Controller?action=Cookies">
			Ben je vegetarisch?
			<p>
				<label><input type="radio" name="veggie" value="yes"> Ja</label>
			</p>
			<p>
				<label><input type="radio" name="veggie" value="no"> Neen</label>
			</p>
			<p>
				<input type="submit" value="Send">
			</p>
		</form>
		<p>

				<a href="Controller?action=Show">Toon de gerechten van mijn
				voorkeur.</a>


		</p>
	</article>
	</main>
</body>
</html>