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

import models.Carte;

public class CarteTest {


    @Test
    public void Carte_() {
	Carte c = new Carte("dix","pique");
	assertThat(c.get_valeur().equals("dix"));
	assertThat(c.get_signe().equals("pique"));
	Carte d = new Carte("neuf","carreaux");
	assertThat(!d.get_valeur().equals("dix"));
	assertThat(!d.get_signe().equals("pique"));
    }
};
