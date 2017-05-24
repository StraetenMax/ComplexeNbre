package exercice;

public class Eq2Degre {
	//propriétés
	private double r1;
	private double r2;
	private double delta;
	private double a;
	private double b;
	private double c;
	
	//constructeur 
	public Eq2Degre(){
		a = 0.00;
		b = 0.00;
		c = 0.00;
	}
	public Eq2Degre(double x1, double x2, double x3){
		a = x1;
		b = x2;
		c = x3;
	}
	
	//accesseurs et mutateurs
	public double getA(){
		return a;
	}
	public double getB(){
		return b;
	}
	public double getC(){
		return c;
	}
	public void setA(double a){
		this.a = a;
	}
	public void setB(double b){
		this.b = b;
	}
	public void setC(double c){
		this.c = c;
	}
	//méthodes
	public void afficheDiscriminant(){
		delta = b*b - 4.0*a*c;
		System.out.println(delta);
	}
	public void resoudre(){
		r1 = (-b - Math.sqrt(delta)) /(2.0*a);
		r2 = (-b + Math.sqrt(delta))/(2.0*a);
	}
	public void afficheSolutions(){
		System.out.println("La première racine est " + r1);
		System.out.println("La deuxième racine est " + r2);
	}
	}
