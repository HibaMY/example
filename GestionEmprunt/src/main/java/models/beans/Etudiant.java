package models.beans;

import java.io.Serializable;

public class Etudiant implements Serializable {

	public Etudiant() {
		super();
		this.nom = "";
		this.prenom = "";
		this.mail = "";
		this.adresse = "";
		this.filiere = "";
		this.tel = "";
	}
	private static final long serialVersionUID = 1;
	private String nom,prenom,mail,adresse,filiere,tel;
	private int numApp;
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public String getMail() {
		return mail;
	}
	public void setMail(String mail) {
		this.mail = mail;
	}
	public String getAdresse() {
		return adresse;
	}
	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}
	public String getFiliere() {
		return filiere;
	}
	public void setFiliere(String filiere) {
		this.filiere = filiere;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	public int getNumApp() {
		return numApp;
	}
	public void setNumApp(int numApp) {
		this.numApp = numApp;
	}
	
	
	

}
