package Exercice;

import javax.swing.JButton;

public class Case extends JButton {
	
	//1.Etend classe JButton
	//2.Donnees membres privees
	
	private int ligne;
	private int colonne;
	
	//3.Donnees membres privees Joueur
	
	private Joueur possesseur;
	
	//4.Constructeur
	
	public Case(int ligne, int colonne){
		this.ligne = ligne;
		this.colonne = colonne;
		this.possesseur = Joueur.PERSONNE;
	}
	
	//5.Getters
	
	public Joueur getPossesseur(){
		return possesseur;
	}//getPossesseur
	
	public int getLigne(){
		return ligne;
	}//getLigne()
	
	public int getColonne(){
		return colonne;
	}//getColonne()
	
	//6.Setter
	
	public void setPossesseur(Joueur possesseur){
		this.possesseur = possesseur;
		setIcon(possesseur.getIcon());
	}//setPossesseur()
	
}
//Une case de l'othellier