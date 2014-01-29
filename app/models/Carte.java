package models;

import java.util.*;
import javax.validation.*;
import play.data.validation.Constraints.*;


public class Carte {
    @Required
	public String valeur;
	public String signe;
	
	public Carte(String val, String sig){
		valeur=val;
		signe=sig;
	}
	

}
