package Exercice;

import javax.swing.Icon;
import javax.swing.ImageIcon;

public class Joueur {
	
	//1.Donnees membres privees
	
	private int score;
	private Icon icon;
	
	//2.Constructeur
	
	Joueur(String FileName){
		icon = new ImageIcon(FileName);
		score = 0;
	}
	
	//3.Accesseurs donnees membres
	
	public int getScore(){
		return score;
	}//getScore()
	
	public Icon getIcon(){
		return icon;
	}//getIcon()
	
	//4.Accesseurs modification score joueur
	
	public void incrementerScore(){
		++score;
	}//incrementerScore()
	
	public void decrementerScore(){
		--score;
	}//decrementerScore()
	
	private void setScore(int score){
		this.score = score;
	}//setScore()
	
	//5.Declarations statiques
	
	static Joueur BLANC = new Joueur("blanc.png");
	static Joueur NOIR = new Joueur("noir.png");
	static Joueur PERSONNE = new Joueur("vide.png");
	
	//6.Methode suivant()
	
	public Joueur suivant(){
		if(this == NOIR)
			return BLANC;
		else if(this == BLANC)
			return NOIR;
		else
			return PERSONNE;
	}//suivant()
	
	//7.Methodes initialiserScores()
	
	public static void initialiserScores(){
		BLANC.setScore(0);
		NOIR.setScore(0);
	}//initialiserScores
	
}
//Conserver les informations associees à chaque joueur