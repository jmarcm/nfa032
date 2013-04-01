
public class ComparerRECTANGLE {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String pmax, smax;
		pmax = "";
		smax = "";
		
		RECTANGLE A = new RECTANGLE();
		RECTANGLE B = new RECTANGLE();
		
		System.out.println ("Rectangle " +A.nom);
		System.out.println ("p�rim�tre : " +A.PERIMETRE());
		System.out.println ("surface : " +A.SURFACE());
		System.out.println ("Rectangle " +B.nom);
		System.out.println ("p�rim�tre : " +B.PERIMETRE());
		System.out.println ("surface : " +B.SURFACE());
	
		if ( A.PERIMETRE() == B.PERIMETRE() ) {
			System.out.println ("Les 2 rectangles " +A.nom +" et " +B.nom +" ont le m�me p�rim�tre");
		} else {
			if ( A.PERIMETRE() > B.PERIMETRE() ) pmax = A.nom;
			if ( A.PERIMETRE() < B.PERIMETRE() ) pmax = B.nom;
			System.out.println ("Le rectangle " +pmax +" a le plus grand p�rim�tre");
			// revoir le commentaire que le prof avait fait sur le test
			
		}//
			
		
		if ( A.SURFACE() == B.SURFACE() ) {
			System.out.println ("Les 2 rectangles " +A.nom +" et " +B.nom +" ont la m�me surface");
		} else {
			if ( A.SURFACE() > B.SURFACE() ) smax = A.nom;
			else smax = B.nom; 
			System.out.println ("Le rectangle " +smax +" a la plus grande surface");
		}
		
		
		/*
			Un rectangle qui a le plus grand p�rim�tre a aussi la plus grande surface
			-> on compare les noms des rectangles "gagnants"
				- si c'est le m�me nom alors OUI celui qui le plus grand p�rim�tre a aussi la plus grande surface
				- si ce n'est pas le m�me nom alors NON
		*/
		
		if ( (pmax !="" ) && (smax != "") ) {
			if (pmax == smax) {
				System.out.print ("OUI le rectangle " +pmax + " qui a le plus grand p�rim�tre a aussi la plus grande surface");
			} else {
				System.out.print ("NON, le rectangle " +pmax + " qui a le plus grand p�rim�tre n'a pas la plus grande surface");
			}
		}
		 
	}

}
