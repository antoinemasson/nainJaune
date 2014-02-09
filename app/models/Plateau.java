package models;

import java.util.*;
import javax.validation.*;
import play.data.validation.Constraints.*;

public class Plateau{
    @Required  
    private Case plat[];
    
    public Plateau(){
        plat=new Case[5];
        plat[0]= new Case(new Carte("dix","carreaux"),1);
        plat[1]= new Case(new Carte("valet","trefle"),2);
        plat[2]= new Case(new Carte("dame","pique"),3);
        plat[3]= new Case(new Carte("roi","coeur"),4);
        plat[4]= new Case(new Carte("sept","carreaux"),5);
    }
    
    public void mise(){
        for( int i=0; i<5; i+=1)
            plat[i].mise(4*plat[i].get_mise());   
    }
    
    public double prenante(Carte c){
        double res=0;
        for( int i=0; i<5; i+=1)
            if(plat[i].get_prenante()==c) res = plat[i].prise();
        return res;
    }
    
    public boolean prise (Carte c){
        Carte a=new Carte("dix","carreaux");
        if(c==a)return true;
        a=new Carte("valet","trefle");
        if(c==a)return true;
        a=new Carte("dame","pique");
        if(c==a)return true;        
        a=new Carte("roi","coeur");
        if(c==a)return true;        
        a=new Carte("sept","carreaux");
        if(c==a)return true;  
        return false;        
    }
    
    public double toDouble(Carte c){
        Carte a=new Carte("dix","carreaux");
        if(c==a){
            plat[0].mise(2*plat[0].get_cagnotte());
            return plat[0].get_cagnotte();
        }
        
        a=new Carte("valet","trefle");
        if(c==a){
            plat[1].mise(2*plat[1].get_cagnotte());
            return plat[1].get_cagnotte();
        }

        a=new Carte("dame","pique");
        if(c==a){
            plat[2].mise(2*plat[2].get_cagnotte());
            return plat[2].get_cagnotte();
        }
       
        a=new Carte("roi","coeur");
        if(c==a){
            plat[3].mise(2*plat[3].get_cagnotte());
            return plat[3].get_cagnotte();
        }
              
        a=new Carte("sept","carreaux");
        if(c==a){
            plat[4].mise(2*plat[4].get_cagnotte());
            return plat[4].get_cagnotte();
        }
       
        return 0;
        }
    

}