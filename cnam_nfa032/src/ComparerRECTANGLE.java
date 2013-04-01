
public class ComparerRECTANGLE {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String pmax, smax;
		pmax = "";
		smax = "";
		
		RECTANGLE A = new RECTANGLE();
		RECTANGLE B = new RECTANGLE();
		
		System.out.println ("Rectangle " +A.nom);
		System.out.println ("périmètre : " +A.PERIMETRE());
		System.out.println ("surface : " +A.SURFACE());
		System.out.println ("Rectangle " +B.nom);
		System.out.println ("périmètre : " +B.PERIMETRE());
		System.out.println ("surface : " +B.SURFACE());
	
		if ( A.PERIMETRE() == B.PERIMETRE() ) {
			System.out.println ("Les 2 rectangles " +A.nom +" et " +B.nom +" ont le même périmètre");
		} else {
			if ( A.PERIMETRE() > B.PERIMETRE() ) pmax = A.nom;
			if ( A.PERIMETRE() < B.PERIMETRE() ) pmax = B.nom;
			System.out.println ("Le rectangle " +pmax +" a le plus grand périmètre");
			// revoir le commentaire que le prof avait fait sur le test
			
		}//
			
		
		if ( A.SURFACE() == B.SURFACE() ) {
			System.out.println ("Les 2 rectangles " +A.nom +" et " +B.nom +" ont la même surface");
		} else {
			if ( A.SURFACE() > B.SURFACE() ) smax = A.nom;
			else smax = B.nom; 
			System.out.println ("Le rectangle " +smax +" a la plus grande surface");
		}
		
		
		/*
			Un rectangle qui a le plus grand périmètre a aussi la plus grande surface
			-> on compare les noms des rectangles "gagnants"
				- si c'est le même nom alors OUI celui qui le plus grand périmètre a aussi la plus grande surface
				- si ce n'est pas le même nom alors NON
		*/
		
		if ( (pmax !="" ) && (smax != "") ) {
			if (pmax == smax) {
				System.out.print ("OUI le rectangle " +pmax + " qui a le plus grand périmètre a aussi la plus grande surface");
			} else {
				System.out.print ("NON, le rectangle " +pmax + " qui a le plus grand périmètre n'a pas la plus grande surface");
			}
		}
		 
	}

}
