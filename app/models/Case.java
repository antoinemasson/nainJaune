package models;

import java.util.*;
import javax.validation.*;
import play.data.validation.Constraints.*;


public class Case {
    @Required
    private Carte prenante;
	private double mise;
	private double cagnotte;
	private boolean prise;

    public Case (Carte p, double m){
	prenante=p;
	mise=m;
	cagnotte=0;
	prise=false;
    }

};
