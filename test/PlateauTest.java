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
import models.Case;
import models.Plateau;

public class PlateauTest{

	@Test
	public void Plateau_(){
		Plateau p = new Plateau();
		assertThat(p!=null);
		p.mise();

		Carte c = new Carte("trois","pique");
		Carte d = new Carte("roi","coeur");
		assertThat(p.prenante(c)==0);

		p.prenante(d);
		assertThat(p.prise(c)==false);
		assertThat(p.prise(d)==true);
		
		assertThat(p.toDouble(d)==32);


}
}
