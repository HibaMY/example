package metier;

import java.util.HashMap;
import java.util.Map;
import models.beans.Etudiant;
import javax.servlet.http.HttpServletRequest;

public class ValidateurEtudiant {
	private Map<String,String> errors = new HashMap<>();
	
	public Map<String, String> getErrors() {
		return errors;
	}
	
	
	public Etudiant validate(HttpServletRequest request) {
		
		String adresse = request.getParameter("adresse");
		String filiere = request.getParameter("filiere");
		String email = request.getParameter("email");
		String nom = request.getParameter("nom");
		String prenom = request.getParameter("prenom");
		String numApp = request.getParameter("numApp");
		String numTel = request.getParameter("numTel");
	
		Etudiant etu = new Etudiant();
		
		etu.setAdresse(adresse);
		etu.setFiliere(filiere);
		etu.setMail(email);
		etu.setNom(nom);
		etu.setPrenom(prenom);
		etu.setTel(numTel);
		
		
		if(numApp != "")
			etu.setNumApp(Integer.parseInt(numApp));
		
		try {
			validateEmail(email);
		} catch (Exception e) {
			errors.put("email",e.getMessage());
		}
		
		try {
			validateAlphabeticString(adresse,"une adresse");
		} catch (Exception e) {
			errors.put("adresse",e.getMessage());
		}
		
		
		try {
			validateAlphabeticString(filiere,"une filiere");
		} catch (Exception e) {
			errors.put("filiere",e.getMessage());
		}
		
		try {
			validateAlphabeticString(nom,"un nom");
		} catch (Exception e) {
			errors.put("nom",e.getMessage());
		}
		
		try {
			validateAlphabeticString(prenom,"un prenom");
		} catch (Exception e) {
			errors.put("prenom",e.getMessage());
		}
		
		try {
			validatePhoneNum(numTel);
		} catch (Exception e) {
			errors.put("tel",e.getMessage());
		}
	
		return etu;
	}
	
	public String filiere(String filiere) {
		
		String var= "Genie"+" "+filiere;
		return var;
	}
	

	private void validateEmail(String mail) throws Exception {
		if(mail != null && mail.trim() != "") {
			if ( !mail.matches( "([^.@]+)(\\.[^.@]+)*@([^.@]+\\.)+([^.@]+)" ) ) {
				throw new Exception( "Merci de saisir une adresse mail valide." );
			}
		} else {
			throw new Exception( "Merci de saisir une adresse mail." );
		}
	}
	
	private void validateAlphabeticString(String str,String type) throws Exception {
		if(str != null && str.trim() != "") {
			if ( !str.matches( "^[a-z']+$" ) ) {
				throw new Exception( "Merci de saisir " + type +" valide." );
			}
		} else {
			throw new Exception( "Merci de saisir " + type +" valide." );
		}
	}
	
	private void validatePhoneNum(String num) throws Exception {
		if(num != null && num.trim() != "") {
			if ( !num.matches( "^[0-9']{10}$" ) ) {
				throw new Exception( "Merci de saisir un numero de telephone valide." );
			}
		} else {
			throw new Exception( "Merci de saisir un numero de telephone." );
		}
	}
}
