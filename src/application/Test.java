package application;

import exercice.ClassComplexe;
import exercice.Eq2Degre;

public class Test {

	public static void main(String[] args) {
		ClassComplexe vt = new ClassComplexe(12.00, 3.00);
		System.out.println(vt);
		ClassComplexe vt1 = new ClassComplexe(21.09,231.94);
		System.out.println(vt1);
	
	     vt.addition(vt1);
	    System.out.println(vt1.multiplication(vt));
	
	    Eq2Degre equation = new Eq2Degre(-2.0,1.0,+3.0);
	    equation.afficheDiscriminant();
	    equation.resoudre();
	    equation.afficheSolutions();
	
	}
			
}
