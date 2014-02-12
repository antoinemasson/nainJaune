package models;

import java.util.*;
import javax.validation.*;
import play.data.validation.Constraints.*;

public class Joueur{

	@Required
	private List<Carte> s;
	private String nom;
	private int argent;

	public Joueur(String n){
		argent = 150;
		nom = n;
		s = new ArrayList<Carte>();
	}

	public int get_argent(){
		return argent;
	}

	public void mise(double mise){
		argent -= mise;
	}

	public void gain(double gain){
		argent += gain;
	}
    
    public void donne(Carte c){
        s.add(c);
    } 
    
    public boolean possede(Carte c){
       return s.contains(c);
    } 
    
    public void jouer(Carte c){
        s.remove(c);
    }
    
    public Carte[] deck(){
        return s.toArray(new Carte[0]);
    }
    
    public int nbCartes(){
        return s.size();
    }
    
    public String getName(){
		return nom;
}
}
