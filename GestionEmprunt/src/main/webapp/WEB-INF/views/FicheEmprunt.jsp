<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>

</head>
<body>
<h2>Emprunt creer avec succes</h2>
<jsp:useBean id="emprunt" class="models.beans.Emprunt" scope="request" />
<jsp:useBean id="etudiant" class="models.beans.Etudiant" scope="request" />

<ul> 
<h2>Etudiant :</h2>
	<li>Num appogee :${etudiant.numApp} </li>
	<li>Nom : ${etudiant.nom}</li>
	<li>Prenom : ${etudiant.prenom} </li>
	<li>Adresse : ${etudiant.adresse}</li>
	<li>Num de telelphone : ${etudiant.tel} </li>
	<li>Email : ${etudiant.mail} </li>
	<li>Filiere : ${etudiant.filiere}</li>
<h2>Emprunt :</h2>
	
	<li>date : ${emprunt.date}</li>
	<li>reference : ${emprunt.refLivre}</li>
	<li>periode : ${emprunt.periode}</li>
</ul>

</body>
</html>