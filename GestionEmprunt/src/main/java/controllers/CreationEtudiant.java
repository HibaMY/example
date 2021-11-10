package controllers;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import metier.ValidateurEtudiant;
import models.beans.Etudiant;

public class CreationEtudiant extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			/* on envoie un bean etudiants avec des champs vides pour que les valeurs initiales du formulaire
			 * ne soient pas egales a null, et pour ne pas utiliser des operateurs ternaires dans la jsp.
			 * 
			 * le constructeur sans parametres a ete implementer de telle sorte a initialiser les champs
			 * de type string avec une string vide
			 *  */
			Etudiant etu = new Etudiant();
			request.setAttribute("etudiant", etu);
			this.getServletContext()
			.getRequestDispatcher("/WEB-INF/views/CreerEtudiant.jsp")
			.forward(request, response);
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		ValidateurEtudiant validateur = new ValidateurEtudiant();
		Etudiant etu = validateur.validate(request);
		
		String jsp = null;
		if(validateur.getErrors().size() > 0) {
			request.setAttribute("errors", validateur.getErrors());
			jsp = "/WEB-INF/views/CreerEtudiant.jsp";
		} else {
			jsp = "/WEB-INF/views/FicheEtudiant.jsp";
		}
		
		request.setAttribute("etudiant", etu);
		
		this.getServletContext()
		.getRequestDispatcher(jsp)
		.forward(request, response);
		
	}


}
