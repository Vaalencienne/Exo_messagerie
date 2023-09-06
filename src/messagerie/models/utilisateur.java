package messagerie.models;

public class utilisateur{
	private String nom="Denier";
	private String prenom="Mériadec";
	private int age=22;
	
	public utilisateur(String nom, String prenom, int age) {
		this.nom=nom;
		this.prenom=prenom;
		this.age=age;
	}
	
	public utilisateur(String nom, String prenom) {
		this(nom, prenom, 0);
	}
	
	public void afficher() {
		System.out.println(prenom+ " " +nom+ " "+age);
	}
	
	@Override
	public String toString() {
		return nom;
	}
}
