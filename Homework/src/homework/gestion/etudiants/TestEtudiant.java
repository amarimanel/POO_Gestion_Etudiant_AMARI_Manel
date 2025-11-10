package homework.gestion.etudiants;

public class TestEtudiant {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Notation[] notesManel = {
                new Notation(12.5, 2),
                new Notation(15, 3),
                new Notation(8, 1),
                new Notation(10, 2)
            };

            // Création de l’étudiant
            Etudiant etu = new Etudiant("Manel Amari", notesManel);

            // Affichage des informations
            etu.afficher();
        }

}
