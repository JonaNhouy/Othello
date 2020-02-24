package Exercice;

import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.JMenuBar;

public class OthelloIHM implements JFrame {
	
	private int TAILLE; //taille de l'othellier
	private StatusBar statusBar; //objet materialisant la barre de statut
	private Othellier othellier; //objet plateau de jeu
	
	//Creation Barre de Menu
	
	private JMenuBar barreDeMenus(){
		
	}//barreDeMenus()
	
	//Constructeur par defaut
	
	OthelloIHM(){
		JFrame fenetre = new JFrame("Othello");
		fenetre.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		fenetre.setLayout(new BorderLayout());
		fenetre.add(barreDeMenus());
		fenetre.add(othellier, BorderLayout.CENTER);
		fenetre.add(statusBar, BorderLayout.SOUTH);
		fenetre.pack();
		fenetre.setVisible(true);
	}
	
	//Mise à jour barre de statut à partir de l'etat courant de l'othellier
	
	public void updateStatus(){
		if(StatusBar.joueurCourant.setPossesseur(Joueur.PERSONNE))
			System.out.println("Fin de partie");
		statusBar.updateStatus();
	}//udapteStatus()
	
	public static void main (String[] args){
		
	}//main()
}
/*Fenetre de jeu avec laquelle les joueurs interagiront 
pour faire une partie à tour de rôle*/