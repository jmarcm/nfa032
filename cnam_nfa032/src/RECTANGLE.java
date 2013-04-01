
public class RECTANGLE {
	public String nom;
	public double x,y;
	public double l, h;


	// On cr�e un constructeur
	public RECTANGLE () {
		System.out.print ("Nom du rectangle : ");
		nom = Lire.S();
		System.out.print ("Abcisse : ");
		x = Lire.d();
		System.out.print ("Ordonn�e : ");
		y = Lire.d();
		System.out.print ("Largeur : ");
		l = Lire.d();
		System.out.print ("Hauteur : ");
		h = Lire.d();
	}

	/*
		On cr�e une m�thode qui
			- calcule la valeur du p�rim�tre du rectangle
			- retourne cette valeur
	*/
	public double PERIMETRE() {
		double p;
		p = 2*(l + h);
		return p;
	}
	
	/*
		On cr�e une m�thode qui
			- calcule la valeur de la surface du rectangle
			- retourne cette valeur
	*/
	public double SURFACE() {
		double s;
		s = l * h;
		return s;
	}
}
