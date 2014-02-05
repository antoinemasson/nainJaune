package models;

import java.util.*;
import javax.validation.*;
import play.data.validation.Constraints.*;

public class Plateau{
    @Required
	private Set<Carte> talon = new TreeSet<Carte>();  
    private Case plat[];
    
    public Plateau(){
        talon=null;
        plat=new Case[5];
        plat[0]= new Case(new Carte("dix","carreaux"),1);
        plat[1]= new Case(new Carte("valet","trefle"),2);
        plat[2]= new Case(new Carte("dame","pique"),3);
        plat[3]= new Case(new Carte("roi","coeur"),4);
        plat[4]= new Case(new Carte("sept","carreaux"),5);
    }
}