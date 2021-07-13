package modul10n3;

//Crea una clase Alumne que tingui com a propietats: Nom, edat, curs i nota

public class Alumne {
	
	protected String nom;
	protected int edat;
	protected String curs;
	protected double nota;
	
	public Alumne(String nom, int edat, String curs, double nota) {
		this.nom = nom;
		this.edat = edat;
		this.curs = curs;
		this.nota = nota;
	}
	
	public String getNom() {
		return this.nom;
	}
	
	public String getCurs() {
		return this.curs;
	}
	
	public int getEdat() {
		return this.edat;
	}
	
	public double getNota() {
		return this.nota;
	}

	@Override
	public String toString() {
		return "Nom Alumne: " + nom + ", edat: " + edat + ", curs: " + curs + ", nota: " + nota;
	}
	
	
}
