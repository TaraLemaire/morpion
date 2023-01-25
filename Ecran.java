/**
 * Gestion de l'affichage en Console : texte en couleur, clear de l'écran.
 * @author Thomas Raimbault
 * @version 03/2022
 */

public class Ecran {

	/// Permet d'effacer le contenu de la Console, et de repositionner le curseur en haut de la Console.
	static public void effacerConsole() {
		System.out.println(); // pour limiter un décalage possible d'affichage
		System.out.print("\033[H\033[2J"); // effacer la Console
	}

	/// Les couleurs utilisables pour l'affichage de texte en couleur.
	public enum Couleur {ROUGE, VERT, JAUNE, BLEU, VIOLET, CYAN, NOIR, BLANC};

	/**
	 * Changer la couleur d'un texte sur la Console.
	 * @param couleurTexte La couleur de texte à utiliser
	 * @see annulerAffichageCouleur
	 */
	static public void changerCouleurTexte(Couleur couleur) {
		switch(couleur) {
			case NOIR:
				System.out.print(BLACK);
				break;
			case ROUGE:
				System.out.print(RED);
				break;
			case VERT:
				System.out.print(GREEN);
				break;
			case JAUNE:
				System.out.print(YELLOW);
				break;
			case BLEU:
				System.out.print(BLUE);
				break;
			case VIOLET:
				System.out.print(PURPLE);
				break;
			case CYAN:
				System.out.print(CYAN);
				break;
			case BLANC:
				System.out.print(WHITE);
				break;
		}
	}

	/**
	 * Changer la couleur de fond sur la Console.
	 * @param couleurFond La couleur de fond à utiliser
	 * @see annulerAffichageCouleur
	 */
	static public void changerCouleurFond(Couleur couleur) {
		switch(couleur) {
			case NOIR:
				System.out.print(BACKGROUND_BLACK);
				break;
			case ROUGE:
				System.out.print(BACKGROUND_RED);
				break;
			case VERT:
				System.out.print(BACKGROUND_GREEN);
				break;
			case JAUNE:
				System.out.print(BACKGROUND_YELLOW);
				break;
			case BLEU:
				System.out.print(BACKGROUND_BLUE);
				break;
			case VIOLET:
				System.out.print(BACKGROUND_PURPLE);
				break;
			case CYAN:
				System.out.print(BACKGROUND_CYAN);
				break;
			case BLANC:
				System.out.print(BACKGROUND_WHITE);
				break;
		}
	}

	/** Revenir à la couleur par défaut d'affichage de texte et de fond en Console.  
	 * @see changerCouleurTexte
	 * @see changerCouleurFond
	 */
	static public void annulerAffichageCouleur() {
		System.out.print(RESET);
	}


	static final String RESET = "\u001B[0m";

	static final String BLACK = "\u001B[30m";
	static final String RED = "\u001B[31m";
	static final String GREEN = "\u001B[32m";
	static final String YELLOW = "\u001B[33m";
	static final String BLUE = "\u001B[34m";
	static final String PURPLE = "\u001B[35m";
	static final String CYAN = "\u001B[36m";
	static final String WHITE = "\u001B[37m";

	static final String BACKGROUND_BLACK = "\u001B[40m";
	static final String BACKGROUND_RED = "\u001B[41m";
	static final String BACKGROUND_GREEN = "\u001B[42m";
	static final String BACKGROUND_YELLOW = "\u001B[43m";
	static final String BACKGROUND_BLUE = "\u001B[44m";
	static final String BACKGROUND_PURPLE = "\u001B[45m";
	static final String BACKGROUND_CYAN = "\u001B[46m";
	static final String BACKGROUND_WHITE = "\u001B[47m";

	/*
		0 Normal (clear all)
		1 bold
		2 dim
		4 underline
		5 blink
		7 reverse
		8 blank
		9 overstrike
		22 normal intensity (cancel bold and blank)
		24 underline off
		25 blink off
		27 reverse off
		28 blank off
		29 overstrike off
		30 black
		31 red
		32 green
		33 yellow
		34 blue
		35 magenta
		36 cyan
		37 white
		40 black background
		41 red background
		42 green background
		43 yellow background
		44 blue background
		45 magenta background
		46 cyan background
		47 white background	
	*/
}