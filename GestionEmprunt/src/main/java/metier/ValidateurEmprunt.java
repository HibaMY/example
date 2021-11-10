package metier;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import models.beans.Emprunt;

public class ValidateurEmprunt {
	
private Map<String,String> errors = new HashMap<>();
	
	public Map<String, String> getErrors() {
		return errors;
	}
	
	public Emprunt validate(HttpServletRequest request) {
		
		String reference = request.getParameter("refLivre");
		String date = request.getParameter("date");
		String periode = request.getParameter("periode");
		
		Emprunt emp = new Emprunt();
		emp.setDate(date);
		emp.setRefLivre(reference);
		if(periode != "")
			emp.setPeriode(Integer.parseInt(periode));
		
		try {
			validateAlphabeticString(reference, "une reference");
		} catch (Exception e) {
			errors.put("reference", e.getMessage());
		}
		
		try {
			validateDate(date);
		} catch (Exception e) {
			errors.put("date", e.getMessage());
		}
		
		return emp;
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
	
	private void validateDate(String str) throws Exception {
		if(str != null && str.trim() != "") {
			if ( !str.matches( "^(0?[1-9]|[12][0-9]|3[01])[\\/\\-](0?[1-9]|1[012])[\\/\\-]\\d{4}$" ) ) {
				throw new Exception( "Merci de saisir une date valide. format : mois/jour/annee " );
			}
		} else {
			throw new Exception( "Merci de saisir une date." );
		}
	}
	
	

}
