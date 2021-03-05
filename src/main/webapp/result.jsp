<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>Mijn huisdieren</title>
<link type="text/css" href="style/style.css" rel="stylesheet" />
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
		<h2>Bevestiging</h2>
		<p>Dank je wel om het formulier in te vullen.</p>
		<p>Je vulde volgende gegevens in:</p>
		<ul>
			<li>Naam: </li>
			<li>Soort:</li>
			<li>Aantal keer eten per dag: </li>
		</ul>
	</main>
	<footer>
		WebOntwikkeling 2 - 2017-2018
	</footer>
	</div>
</body>
</html>