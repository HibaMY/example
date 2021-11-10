package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import metier.ValidateurEtudiant;
import models.beans.Etudiant;

class TestValidateurEtudiant {
	
	
	public ValidateurEtudiant ValEtud=new ValidateurEtudiant();
	public Etudiant etud=new Etudiant();
	
	

	@Test
	void testValidate() {
		etud.setFiliere("Informatique");
		assertEquals("Genie Informatique", ValEtud.filiere(etud.getFiliere()));
	
		
	}

	
	
}
