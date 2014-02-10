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

import models.Jeu;
import models.Joueur;
import models.Carte;
import models.Case;
import models.Plateau;

public class JeuTest {
	
	@Test
	public void Jeu_(){
		Jeu J = new Jeu();
		assertThat(J!=null);
}
}
