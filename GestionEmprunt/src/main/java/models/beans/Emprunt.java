package models.beans;

import java.io.Serializable;

public class Emprunt implements Serializable {
	private static final long serialVersionUID = 1L;
	private String refLivre;
	private String date;
	private int periode;
	
	public Emprunt() {
		this.refLivre = "";
		this.date = "";
	}
	public String getRefLivre() {
		return refLivre;
	}
	public void setRefLivre(String refLivre) {
		this.refLivre = refLivre;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public int getPeriode() {
		return periode;
	}
	public void setPeriode(int periode) {
		this.periode = periode;
	}
	
	
	
}
