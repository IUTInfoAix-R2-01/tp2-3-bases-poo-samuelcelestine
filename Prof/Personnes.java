public class Personnes { 
	
	private String Nom;
	private String Prenom;
	
	public Personnes(String Nom, String Prenom) { 
	       this.Nom = Nom;
	       this.Prenom = Prenom;
	   }
	
	public Personnes( String Prenom) {  
		   this.Prenom = Prenom;
		}
	
	public String getNom() {
		  return Nom; 
		}
	   
	public String getPrenom() {
		  return Prenom; 
		}
	
	public String toString() {
		if (Nom == null) {
			return Prenom;
		}
		return Prenom+" "+Nom;
	}
}