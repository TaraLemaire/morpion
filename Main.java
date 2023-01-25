// Votre code est à écrire dans ce fichier Main.java
class Main {

	public static void main(String[] args) {
		morpion();
  }

  public static int[][] creerGrille(int nbreLigne, int nbreColonne) {
    int[][] grille = new int[nbreLigne][nbreColonne];
    return grille;
  }

  public static void afficherGrille(int[][] grille) {
    System.out.print("  ");
    for (int colonne = 0 ; colonne < 3 ; colonne++) {
      System.out.print(colonne + " ");
    }
    System.out.println("  ");
    for (int ligne = 0 ; ligne < 3 ; ligne++) {
      System.out.print(ligne + " ");
      for (int colonne = 0 ; colonne < grille[ligne].length ; colonne++) {
        if (grille[ligne][colonne] == 0) {
          System.out.print("- ");
        }
        else if (grille[ligne][colonne] == 1) {
          System.out.print("x ");
        }
        else if (grille[ligne][colonne] == 2) {
          System.out.print("o ");
        }
      }
      System.out.println();
    }
  }

  public static boolean grilleRemplie(int[][] grille) {
    for (int ligne = 0 ; ligne < grille.length ; ligne++) {
      for (int colonne = 0 ; colonne < grille[ligne].length ; colonne++) {
        if (grille[ligne][colonne] == 0) {
          return false;
        }
      }
    }
    return true;
  }

  public static boolean verifierGrille(int[][] grille, int numLigne, int numColonne) {
    boolean verif = false;
    if (numLigne >= 0 && numLigne < grille.length && numColonne >= 0 && numColonne < grille[numLigne].length) {
      if (grille[numLigne][numColonne] == 0) {
        verif = true;
      }
    }
    return verif;
  }

  public static void remplirCase(int[][] grille, int numLigne, int numColonne, int numJoueur) {
    grille[numLigne][numColonne] = numJoueur;
  }

  public static boolean vainqueur(int case1, int case2, int case3, int numJoueur) {
    boolean joueurVainqueur = false;
    if (case1 == case2 && case2 == case3 && case3 == numJoueur) {
      joueurVainqueur = true;
    }
    return joueurVainqueur;
  }

  public static boolean victoire(int[][] grille, int numJoueur) {
    // 3 symboles identiques sur une des lignes
    for (int ligne = 0 ; ligne < grille.length ; ligne++) {
      if (vainqueur(grille[ligne][0], grille[ligne][1], grille[ligne][2], numJoueur)) {
        return true;
      }
    }
    // 3 symboles identiques sur une des 3 colonnes
    for (int colonne = 0 ; colonne < grille.length ; colonne++) {
      if (vainqueur(grille[0][colonne], grille[1][colonne], grille[2][colonne], numJoueur)) {
        return true;
      }
    }
    // victoire sur une des diagonales
    if (vainqueur(grille[0][0], grille[1][1], grille[2][2], numJoueur) || vainqueur(grille[2][0], grille[1][1], grille[0][2], numJoueur)) {
      return true;
    }
    return false;
  }

  /**
   * Fonction score qui détermine le score entre 2 noeuds
   * @param grilleActuelle état actuelle de la grille
   * @param joueurActuel joueur actuel
   * @param joueurPrecedent joueur précedent
   * @return score du coup : -1 / 0 / +1 si le coup mène à une défaite, un match nul ou une victoire
   * Si dans chaque ligne ou chaque colonne ou chaque diagonale il y a plus de symboles du joueurActuel que du joueurPrecedent alors score = 1
   * Si il y a plus de symbole du joueurPrecedent que du joueurActuel alors score = -1
   * Sinon égalité alors score = 0
   */
  public static int score(int[][] grilleActuelle, int joueurActuel, int joueurPrecedent){
    int score = 0;
    int cptJ1, cptJ2;
    // Parcourir chaque ligne et comparer le nombre de symboles des joueurs
    for (int ligne = 0 ; ligne < grilleActuelle.length ; ligne++) {

      // Parcourir chaque ligne et comparer le nombre de symboles des joueurs
      for (int colonne = 0 ; colonne < grilleActuelle[ligne].length ; colonne++) {
      }
      // Parcourir les diagonales et comparer les symboles des joueurs
    }
    return 0;
  }


  /**
   * Fonction arbre qui détermine le meilleur coup en fonction de la grille actuelle
   * @param grilleActuelle état de la grille actuelle
   * @param numJoueur joueur en cours
   * @return la meilleure solution possible en fonction de l'état de la grille et du joueur actuel
   */
  public static int[][] arbre(int[][] grilleActuelle, int numJoueur){
    int[][] grilleSuivante = creerGrille(3, 3);
    return grilleSuivante;
  }

  // Version morpion Humain VS IA
  public static void humain_contre_ia() {
    int[][] grille = creerGrille(3, 3);
    int joueurActuel = 1;
    boolean jouer = true;
    while (jouer) {
    }
  }

  public static void morpion() {
    int[][] grille = creerGrille(3, 3);
    int joueurActuel = 1;
    boolean jouer = true;
    while (jouer) {
      System.out.println("********** Tour du joueur " + joueurActuel + " ***********");
      int numLigne = -1;
      int numColonne = -1;
      boolean caseValide = false;
      while (!caseValide) {
        System.out.println();
        afficherGrille(grille);
        System.out.println();
				System.out.print("Le joueur " + joueurActuel + " choisit une ligne : ");
				numLigne = Clavier.lireEntier();
				System.out.print("Le joueur " + joueurActuel + " choisit une colonne : ");
				numColonne = Clavier.lireEntier();
				System.out.println();
				caseValide = verifierGrille(grille, numLigne, numColonne);
        if (!caseValide) {
          System.out.println("***************************************");
          System.out.println("La case est invalide.");
          System.out.println("Choisissez-en une libre dans la grille.");
        }
      }
      remplirCase(grille, numLigne, numColonne, joueurActuel);
      if (victoire(grille, joueurActuel)) {
        System.out.println("***************************************");
				System.out.println("");
				afficherGrille(grille);
				System.out.println("");
				System.out.println("Le joueur " + joueurActuel + " a gagné !");
				jouer = false;
			}
      else if (grilleRemplie(grille)) {
				System.out.println("***************************************");
				System.out.println("");
				afficherGrille(grille);
				System.out.println("");
				System.out.println("Égalité !");
        jouer = false;
      }
      else {
        if (joueurActuel == 1) {
          joueurActuel = 2;
        }
        else {
          joueurActuel = 1;
        }
      }
    }
  }
}