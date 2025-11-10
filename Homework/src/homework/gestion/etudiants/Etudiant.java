package homework.gestion.etudiants;


public class Etudiant {
	   private String nom;
	    private double moyenne;
	    private String avis;
	    private Notation[] notes;

	    public String getNom() {
			return nom;
		}

		public void setNom(String nom) {
			this.nom = nom;
		}

		public double getMoyenne() {
			return moyenne;
		}


		public void setMoyenne(double moyenne) {
			this.moyenne = moyenne;
		}


		public String getAvis() {
			return avis;
		}


		public void setAvis(String avis) {
			this.avis = avis;
		}


	    public Notation[] getNotes() {
			return notes;
		}

		public void setNotes(Notation[] notes) {
			this.notes = notes;
		}

		
		
		public Etudiant(String nom, double moyenne, String avis, homework.gestion.etudiants.Notation[] notes) {
			super();
			this.nom = nom;
			this.moyenne = moyenne;
			this.avis = avis;
			this.notes = notes;
		}
		
		public Etudiant(String nom, Notation[] notes) {
	        this.nom = nom;
	        this.notes = notes;
	        this.moyenne = calculerMoyenne();
	        this.avis = determinerAvis();
	    }

		private double calculerMoyenne() {
	        double sommeNotes = 0;
	        double sommeCoefs = 0;

	        for (Notation n : notes) {
	            sommeNotes += n.getNote() * n.getCoef();
	            sommeCoefs += n.getCoef();
	        }

	        if (sommeCoefs == 0) return 0;
	        return sommeNotes / sommeCoefs;
	    }


	    private String determinerAvis() {
	        if (moyenne >= 10) {
	            return "Admis";
	        } else if (moyenne >= 8) {
	            return "Rattrapage";
	        } else {
	            return "Ajourné";
	        }
	    }

	
	    public void moyenne() {
	        this.moyenne = calculerMoyenne();
	    }
	    public void avis() {
	        this.avis = determinerAvis();
	    }
	    public void afficher() {
	        System.out.println("=== Informations Étudiant ===");
	        System.out.println("Nom : " + nom);
	        System.out.println("Notes :");
	        for (Notation n : notes) {
	            n.afficher();
	        }
	        System.out.printf("Moyenne : %.2f\n", moyenne);
	        System.out.println("Avis : "+ avis);
	    }
}
