package models;

import java.util.*;
import javax.validation.*;
import play.data.validation.Constraints.*;

public class Jeu{
        private List<Carte> s;
        private Carte[] fausse=new Carte[52];
        private Joueur[] players= new Joueur[4];
        private Plateau plat;
        
        
        public Jeu(){
            
            s= new ArrayList<Carte>();
            s.add(new Carte("un","carreaux"));
            s.add(new Carte("deux","carreaux"));
            s.add(new Carte("trois","carreaux"));
            s.add(new Carte("quatre","carreaux"));
            s.add(new Carte("cinq","carreaux"));
            s.add(new Carte("six","carreaux"));
            s.add(new Carte("sept","carreaux"));
            s.add(new Carte("huit","carreaux"));
            s.add(new Carte("neuf","carreaux"));
            s.add(new Carte("dix","carreaux"));
            s.add(new Carte("valet","carreaux"));
            s.add(new Carte("dame","carreaux"));
            s.add(new Carte("roi","carreaux"));
            
             s.add(new Carte("un","pique"));
            s.add(new Carte("deux","pique"));
            s.add(new Carte("trois","pique"));
            s.add(new Carte("quatre","pique"));
            s.add(new Carte("cinq","pique"));
            s.add(new Carte("six","pique"));
            s.add(new Carte("sept","pique"));
            s.add(new Carte("huit","pique"));
            s.add(new Carte("neuf","pique"));
            s.add(new Carte("dix","pique"));
            s.add(new Carte("valet","pique"));
            s.add(new Carte("dame","pique"));
            s.add(new Carte("roi","pique"));
            
             s.add(new Carte("un","trefle"));
            s.add(new Carte("deux","trefle"));
            s.add(new Carte("trois","trefle"));
            s.add(new Carte("quatre","trefle"));
            s.add(new Carte("cinq","trefle"));
            s.add(new Carte("six","trefle"));
            s.add(new Carte("sept","trefle"));
            s.add(new Carte("huit","trefle"));
            s.add(new Carte("neuf","trefle"));
            s.add(new Carte("dix","trefle"));
            s.add(new Carte("valet","trefle"));
            s.add(new Carte("dame","trefle"));
            s.add(new Carte("roi","trefle"));
            
            s.add(new Carte("un","coeur"));
            s.add(new Carte("deux","coeur"));
            s.add(new Carte("trois","coeur"));
            s.add(new Carte("quatre","coeur"));
            s.add(new Carte("cinq","coeur"));
            s.add(new Carte("six","coeur"));
            s.add(new Carte("sept","coeur"));
            s.add(new Carte("huit","coeur"));
            s.add(new Carte("neuf","coeur"));
            s.add(new Carte("dix","coeur"));
            s.add(new Carte("valet","coeur"));
            s.add(new Carte("dame","coeur"));
            s.add(new Carte("roi","coeur"));
            
            players[0]= new Joueur("Max");
            players[1]= new Joueur("Tom");
            players[2]= new Joueur("Paul");
            players[3]= new Joueur("Jean");
            plat=new Plateau(); 
            
        }
        
        public Plateau get_plateau(){
            return plat;
        }
        
        
        public double can(int i){
			return plat.can(i);
		}
        
        public Joueur player(int i){
            return players[i];
        }
        
        public void donne(){
            List<Carte> d = new ArrayList<Carte>(s);
            Collections.shuffle(d);
            for(int i=0; i<d.size()-5; i++){
                if(i<12) players[0].donne(d.get(i));
                else if(i<24) players[1].donne(d.get(i));
                else if(i<36) players[2].donne(d.get(i));
                else if(i<48) players[3].donne(d.get(i));                
            }
            plat.mise();
        }
}
