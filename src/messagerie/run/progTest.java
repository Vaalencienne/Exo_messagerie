package messagerie.run;

import messagerie.models.utilisateur;

public class progTest{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		utilisateur u = new utilisateur("Mériadec", "Denier", 23);
		u.afficher();
		
		utilisateur u2 = new utilisateur("Dahlke", "Joshua");
		System.out.println(u2);
	}

}
