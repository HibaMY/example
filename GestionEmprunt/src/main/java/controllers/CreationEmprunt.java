package controllers;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import metier.ValidateurEmprunt;
import metier.ValidateurEtudiant;
import models.beans.Emprunt;
import models.beans.Etudiant;

public class CreationEmprunt extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		Etudiant etu = new Etudiant();
		Emprunt emp = new Emprunt();
		request.setAttribute("etudiant", etu);
		request.setAttribute("emprunt", emp);
		this.getServletContext()
		.getRequestDispatcher("/WEB-INF/views/CreerEmprunt.jsp")
		.forward(request, response);
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		ValidateurEmprunt validateurEmp = new ValidateurEmprunt();
		ValidateurEtudiant validateurEtu = new ValidateurEtudiant();
		
		Etudiant etu = validateurEtu.validate(request);
		Emprunt emp = validateurEmp.validate(request);
		String jsp = null;
		
		if( !validateurEmp.getErrors().isEmpty() || !validateurEtu.getErrors().isEmpty()) {
			request.setAttribute("errorsEmprunt", validateurEmp.getErrors());
			request.setAttribute("errorsEtudiant", validateurEtu.getErrors());
			jsp = "/WEB-INF/views/CreerEmprunt.jsp";
		} else {
			jsp = "/WEB-INF/views/FicheEmprunt.jsp";
		}
		
		
		request.setAttribute("etudiant", etu);
		request.setAttribute("emprunt", emp);
		
		this.getServletContext()
		.getRequestDispatcher(jsp)
		.forward(request, response);
	}
	
	

}
