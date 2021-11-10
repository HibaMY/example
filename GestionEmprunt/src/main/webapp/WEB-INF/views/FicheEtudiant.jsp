<%@page import="models.beans.Etudiant"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">

<title>Fiche etudiant</title>
</head>
<body>
<% models.beans.Etudiant etudiant = (models.beans.Etudiant) request.getAttribute("etudiant");  %>
<h2>Etudiant cree avec success</h2>
<ul>
	<li>Num appogee : <%= etudiant.getNumApp() %> </li>
	<li>Nom : <%= etudiant.getNom() %></li>
	<li>Prenom : <%= etudiant.getPrenom() %> </li>
	<li>Adresse : <%= etudiant.getAdresse() %> </li>
	<li>Num de telelphone : <%= etudiant.getTel() %> </li>
	<li>Email : <%= etudiant.getMail() %> </li>
	<li>Filiere : <%= etudiant.getFiliere() %> </li>
</ul>	
</body>
</html>