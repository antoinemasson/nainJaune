package controllers;

import play.*;
import play.mvc.*;
import models.Jeu;
import views.html.*;

public class Application extends Controller {

    public static Result index() {
        return ok(index.render("Your new application is ready."));
    }

    public static Result plat() {
        Jeu j=new Jeu();
        j.donne();
        return ok(plat.render(j));
    }
}
