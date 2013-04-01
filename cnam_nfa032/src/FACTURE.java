
public class FACTURE {
	/*
	Champs :
		- le numéro de facture (num)
		- le nom de l'article acheté (nom)
		- le prix (prix)
		- le nombre d'exemplaires achetés (nbre)
	*/
	
	public int num;
	public String nom;
	private int nbre;
	private double prix;
	
	private double montant;
	
	// Le constructeur
	public FACTURE() {
		System.out.print ("Numéro de facture : ");
		num = Lire.i();
		System.out.print ("Nom de l'article acheté : ");
		nom = Lire.S();
		System.out.print ("Prix : ");
		prix = Lire.d();
		System.out.print ("Nombre d'exemplaires achetés : ");
		nbre = Lire.i();
	}
	
	/*
	Une méthode qui
		- calcule le montant de la facture
		- et le retourne
	*/
	
	public double montant () {
		montant = prix * nbre;
		return montant;
	}
}