package models;

import java.util.*;
import javax.validation.*;
import play.data.validation.Constraints.*;

public class Joueur{

	@Required
	private Set<Carte> s = new TreeSet<Carte>();
	private String nom;
	private int argent;

	public Joueur(String n){
		argent = 150;
		nom = n;
		s = null;
	}

	public get_argent(){
		return argent;
	}
}
