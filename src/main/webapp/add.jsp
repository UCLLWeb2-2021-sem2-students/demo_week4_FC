<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@page import="java.util.ArrayList"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>Voeg een huisdier toe</title>
<link rel="stylesheet" type="text/css" href="style/style.css" />
</head>
<body>
	<div id="container">
	<header>
		<h1>Mijn huisdieren</h1>
		<nav>
			<ul>
				<li><a href="Controller?command=home">Home</a></li>
				<li><a href="add.jsp">Voeg Toe</a></li>
				<li><a href="Controller?command=overview">Overzicht</a></li>
			</ul>
		</nav>
	</header>		
	<main>
		<h2>Voeg je huisdier toe</h2>
		<form method="POST" action="Controller?command=add" novalidate>
			<p>
				<label for="Naam">Naam:</label>
				<input id="naam" name="naam" type="text">
			</p>
			<p>
				<label for="soort">Soort:</label> 
				<input id="soort" name="soort" type="text">
			</p>
			<p>
				<label for="voedsel">Aantal keer eten per dag:</label> 
				<input id="voedsel" name="voedsel" type="number" max="10" min="1">
			</p>
			<p>
				<input type="submit" value="Voeg dier toe" id="submit">
			</p>
			<p class="left">Alle velden zijn verplicht.</p>
		</form>
		</main>
	<footer>
		WebOntwikkeling 2 - 2017-2018
	</footer>
	</div>
</body>
</html>