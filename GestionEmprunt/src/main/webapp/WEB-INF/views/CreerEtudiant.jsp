<%@page import="models.beans.Etudiant"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Creer etudiant</title>

</head>
<body>
	<jsp:useBean id="etudiant" class="models.beans.Etudiant"  scope="request" />
	<%@ page import="java.util.Map, java.util.HashMap" %>
	<% Map<String,String> errors = (HashMap<String,String>) request.getAttribute("errors"); %>

	<form method="post" action=creationEtudiant >
		<h4 >Infos etudiants</h4>
		<div>
			<label >Num appogee :</label>
				 <input  
				 value= '<jsp:getProperty property="numApp" name="etudiant"/>'
				 name="numApp" type="number" min="1">
				 <p><%= errors == null ? "" : (errors.get("numApp") == null ? "" :  errors.get("numApp")) %></p>
		</div>
				 
		 		<div>
		 			<label >Nom :</label>
			 		 	<input  
			 		 	value= '<jsp:getProperty property="nom" name="etudiant"/>'
			 		 	type="text" name="nom"> 
			 		 <p><%= errors == null ? "" : (errors.get("nom") == null ? "" :  errors.get("nom")) %></p>
				</div>
				
				<div>
					<label >Prenom :</label>
					 	<input 
				 		 value= '<jsp:getProperty property="prenom" name="etudiant"/>'
				 		 type="text" name="prenom">
				 		<p><%= errors == null ? "" : (errors.get("prenom") == null ? "" :  errors.get("prenom")) %></p>
			 	</div>
			 	
				<div>
					<label >Adresse :</label>
				 	<input  
				 	value= '<jsp:getProperty property="adresse" name="etudiant"/>'
				 	 type="text" name="adresse">
				 	 <p><%= errors == null ? "" : (errors.get("adresse") == null ? "" :  errors.get("adresse")) %></p>
				 </div>
				 
				<div>
				<label >Numero de tel :</label> 
				<input  
				 	value= '<jsp:getProperty property="tel" name="etudiant"/>'
					type="text" name="numTel">
					<p><%= errors == null ? "" : (errors.get("tel") == null ? "" :  errors.get("tel")) %></p>
				</div>
				
				<div>
					<label >Email :</label>
					<input  
					value= '<jsp:getProperty property="mail" name="etudiant"/>'
					type="text" name="email">
					<p><%= errors == null ? "" : (errors.get("mail") == null ? "" :  errors.get("mail")) %></p>
				</div>
				
				<div>
					<label >Filiere :</label> 
					<input  
						value= '<jsp:getProperty property="filiere" name="etudiant"/>'
						type="text" name="filiere">
						<p><%= errors == null ? "" : (errors.get("filiere") == null ? "" :  errors.get("filiere")) %></p>
				</div>
			<button type="reset">Remmetre a zero</button>
    		<button type="submit">Valider</button>
    		
	</form>

</body>
</html>