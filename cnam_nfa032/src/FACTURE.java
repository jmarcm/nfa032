
public class FACTURE {
	/*
	Champs :
		- le num�ro de facture (num)
		- le nom de l'article achet� (nom)
		- le prix (prix)
		- le nombre d'exemplaires achet�s (nbre)
	*/
	
	public int num;
	public String nom;
	private int nbre;
	private double prix;
	
	private double montant;
	
	// Le constructeur
	public FACTURE() {
		System.out.print ("Num�ro de facture : ");
		num = Lire.i();
		System.out.print ("Nom de l'article achet� : ");
		nom = Lire.S();
		System.out.print ("Prix : ");
		prix = Lire.d();
		System.out.print ("Nombre d'exemplaires achet�s : ");
		nbre = Lire.i();
	}
	
	/*
	Une m�thode qui
		- calcule le montant de la facture
		- et le retourne
	*/
	
	public double montant () {
		montant = prix * nbre;
		return montant;
	}
}