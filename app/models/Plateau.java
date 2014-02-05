package models;

import java.util.*;
import javax.validation.*;
import play.data.validation.Constraints.*;

public class Plateau{
    @Required
	private Set<Carte> talon = new TreeSet<Carte>();  
    private Case plat[];
}