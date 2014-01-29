package models;

import java.util.*;
import javax.validation.*;
import play.data.validation.Constraints.*;


public class Carte {
    @Required
	private String valeur;
	private String signe;
	
	public Carte(String val, String sig){
		valeur=val;
		signe=sig;
	}
	
	public String get_valeur(){
		return valeur;
	}

}
