
public class FaireFACTURE {
	public static void main (String [] args) {
		
		/*
		Une classe principale
			- cr�� trois factures
			- calcul le montant des trois factures
		*/
		
		double total;
		
		FACTURE un = new FACTURE ();
		FACTURE deux = new FACTURE ();
		FACTURE trois = new FACTURE ();
		
		total = un.montant() + deux.montant() + trois.montant();
		
		System.out.print ("Facture n�" +un.num +" nom : " +un.nom);
		System.out.println ( " montant : " +un.montant() +" �" );
		
		System.out.print ("Facture n�" +deux.num +" nom : " +deux.nom);
		System.out.println ( " montant : " +deux.montant() +" �" );
		
		System.out.print ("Facture n�" +trois.num +" nom : " +trois.nom);
		System.out.println ( " montant : " +trois.montant() +" �" );
		
		System.out.print ("Montant total : " +total +" �");
	}
}