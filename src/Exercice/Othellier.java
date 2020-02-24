package Exercice;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;

public class Othellier extends JPanel {
	
	//1.Donnees membres privees
	
	private int taille; //taille du plateau
	private Case[][] cases = new Case[taille][taille]; //plateau du jeu
	private Joueur joueurCourant; //tour du joueur
	
	//2.Parcours toutes les cases et affecte  à PERSONNE
	
	private void vider(){
		for(int i=0;i<taille;++i)
			for(int j=0;j<taille;++j){
				cases[i][j].setPossesseur(Joueur.PERSONNE);
			}
	}//vider()
	
	//3.Placement Pions Debut
	
	private void positionnerPionsDebutPartie(){
		cases[taille / 2 - 1][taille / 2 - 1].setPossesseur(Joueur.BLANC);
        cases[taille / 2][taille / 2].setPossesseur(Joueur.BLANC);
        Joueur.BLANC.incrementerScore();
        Joueur.BLANC.incrementerScore();
        
        cases[taille / 2 - 1][taille / 2].setPossesseur(Joueur.NOIR);
        cases[taille / 2][taille / 2 - 1].setPossesseur(Joueur.NOIR);
        Joueur.NOIR.incrementerScore();
        Joueur.NOIR.incrementerScore();
	}//positionnerPionsDebutPartie()
	
	//4.Constructeur public	
	
	public Othellier(int taille){
		this.taille=taille;
		cases=new Case [taille][taille];
		setLayout(new GridLayout(taille, taille));
		for(int i=0;i<taille;i++)
			for(int j=0;j<taille;j++){
				cases[i][j] = new Case(i, j);
                add(cases[i][j]);
			}
		vider();
		positionnerPionsDebutPartie();
	}
	
	//5.Droit ou non poser jetons

	boolean estPositionJouable(){
		if (caseSelectionnee.getPossesseur() != Joueur.PERSONNE)
            return false;
        return !casesCapturable(caseSelectionnee).isEmpty();
	}//estPositionJouable()
	
	//6.Retourne Liste toutes les cases jouables
	
	private List<Case> caseJouables(){
		List<Case> casesJouables = new ArrayList<Case>();
        for (int i = 0; i < taille; i++) {
            for (int j = 0; j < taille; j++) {
                if (cases[i][j].getPossesseur() == Joueur.PERSONNE && !casesCapturable(cases[i][j]).isEmpty()) {
                    casesJouables.add(cases[i][j]);
                }
            }
        }
        return casesJouables;
	}//caseJouables()
	
	//7.Existence cases jouables
	
	public boolean peutJouer(){
		
	}//peutJouer()
	
	//8.Tour suivant
	
	private void tourSuivant(){
		
	}//tourSuivant()
	
	//9.Cases Capturables
	
	private void capturer(Case caseCapturee){
		
	}//capturer()
	
	//Classe auditeur
	
	public class AuditeurCase implements ActionListener{
		public void actionPerformed(ActionEvent evt){
			evt.getSource();
			
		}//actionPerformed()
	}
}
//Plateau de jeu compose des 64 cases