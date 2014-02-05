import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.databind.JsonNode;
import org.junit.*;

import play.mvc.*;
import play.test.*;
import play.data.DynamicForm;
import play.data.validation.ValidationError;
import play.data.validation.Constraints.RequiredValidator;
import play.i18n.Lang;
import play.libs.F;
import play.libs.F.*;

import static play.test.Helpers.*;
import static org.fest.assertions.Assertions.*;

import models.Joueur;
import models.Carte;

public class JoueurTest {
    
	
	@Test
    public void Joueur() {
    Joueur j = new Joueur("toto");
    assertThat(j!=null);
    assertThat(j.get_argent()==150);
    j.mise(10);
    assertThat(j.get_argent()==140);
    j.gain(110);
    assertThat(j.get_argent()==250);
	Carte c = new Carte("as","pique");
	j.donne(c);
	assertThat(j.possede(c)==true);

	Carte d = new Carte("roi","coeur");
	Carte e = new Carte("2","trefle");
	j.donne(d);
	j.donne(e);

	j.jouer(e);
	assertThat(j.possede(e)==false);

	
	Joueur k = new Joueur("joueur 2");

	Carte f = new Carte("dix","carreaux");
	Carte g = new Carte("valet","trefle");
	Carte h = new Carte("dame","pique");

	k.donne(f);
	k.donne(g);
	k.donne(h);

        Carte[] D = new Carte[3];
        D[0]= f;
        D[1]= g;
        D[2]= h;
	assertThat(k.deck().equals(D));




}
}
