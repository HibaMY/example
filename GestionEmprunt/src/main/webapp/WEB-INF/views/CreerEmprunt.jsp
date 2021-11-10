<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>

<head>
    <meta charset="utf-8">
    <title>Creer un emprunt</title>
    
</head>

<body>
    <form method="post" action="creationEmprunt">
        <fieldset>
            <jsp:useBean id="etudiant" class="models.beans.Etudiant" scope="request" />
            <jsp:useBean id="emprunt" class="models.beans.Emprunt" scope="request" />
            <%@ page import="java.util.Map, java.util.HashMap" %>
			<% Map<String,String> errorsEmprunt = (HashMap<String,String>) request.getAttribute("errorsEmprunt"); %>
			<% Map<String,String> errorsEtudiant = (HashMap<String,String>) request.getAttribute("errorsEtudiant"); %>
            <legend>Infos etudiants</legend>
            <div>
                <label>Num appogee :</label>
                <input name="numApp" type="number" min="1" value=${etudiant.numApp}>
            </div>
            <p>
            	${empty errorsEtudiant ? "" : (empty errorsEtudiant.get("numApp") ? "" :  errorsEtudiant.get("numApp"))}
            </p>
            

            <div>
                <label for="nom">Nom :</label>
                <input type="text" name="nom" value=${etudiant.nom}>
            </div>
			<p>
            	${empty errorsEtudiant ? "" : (empty errorsEtudiant.get("nom") ? "" :  errorsEtudiant.get("nom"))}
            </p>


            <div>

                <label for="prenom">Prenom :</label>
                <input type="text" name="prenom" value=${etudiant.prenom}>
            </div>
            <p>
            	${empty errorsEtudiant ? "" : (empty errorsEtudiant.get("prenom") ? "" :  errorsEtudiant.get("prenom"))}
            </p>

            <div>

                <label for="adresse">Adresse :</label>
                <input type="text" name="adresse" value=${etudiant.adresse}>
            </div>
            <p>
            	${empty errorsEtudiant ? "" : (empty errorsEtudiant.get("adresse") ? "" :  errorsEtudiant.get("adresse"))}
            </p>

            <div>

                <label for="numTel">Numero de tel :</label>
                <input type="text" name="numTel" value=${etudiant.tel}>
            </div>
            <p>
            	${empty errorsEtudiant ? "" : (empty errorsEtudiant.get("tel") ? "" :  errorsEtudiant.get("tel"))}
            </p>

            <div>

                <label for="email">Email :</label>
                <input type="email" name="email" value=${etudiant.mail}>
            </div>
            <p>
            	${empty errorsEtudiant ? "" : (empty errorsEtudiant.get("mail") ? "" :  errorsEtudiant.get("mail"))}
            </p>

            <div>

                <label for="filiere">Filiere :</label>
                <input type="text" name="filiere" value=${etudiant.filiere}>
            </div>
            <p>
            	${empty errorsEtudiant ? "" : (empty errorsEtudiant.get("filiere") ? "" :  errorsEtudiant.get("filiere"))}
            </p>

        </fieldset>

        <fieldset>

            <legend>Informations emprunt</legend>

            <div>

                <label>Reference :</label>
                <input type="text" name="refLivre" value=${emprunt.refLivre}>
            </div>
            
             <p>
            	${empty errorsEmprunt ? "" : (empty errorsEmprunt.get("refLivre") ? "" :  errorsEmprunt.get("refLivre"))}
            </p>

            <div>

                <label>date</label>
                <input type="text" name="date" value=${emprunt.date}>
            </div>
             <p>
            	${empty errorsEmprunt ? "" : (empty errorsEmprunt.get("date") ? "" :  errorsEmprunt.get("date"))}
            </p>
            <div>

                <label>periode</label>
                <input type="number" name="periode" value=${emprunt.periode}>
            </div>
             <p>
            	${empty errorsEmprunt ? "" : (empty errorsEmprunt.get("periode") ? "" :  errorsEmprunt.get("periode"))}
            </p>

        </fieldset>
        <button type="reset">Remmetre a zero</button>
        <button type="submit">Valider</button>

    </form>
</body>

</html>