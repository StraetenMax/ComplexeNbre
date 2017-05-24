package exercice;

public class ClassComplexe {
	//propriétés
	private double reel;
	private double img;
	
	//constructeurs vide et initialisé
	public ClassComplexe(){
		reel = 0.00;
		img = 0.00;
	}
	public ClassComplexe(double reel, double img){
		this.reel = reel;
		this.img = img;
	}
	
	//accesseurs et mutateurs
	public double getReel(){
		return reel;
	}
	public void setReel(double reel){
		this.reel=reel;
	}
	public double getImg(){
		return img;
	}
	public void setImg(double img){
		this.img = img;
	}
	
	//méthodes
	public String toString(){
		return "le nombre complexe ("+this.getReel()+", "+this.getImg()+")";
	}
	 public void addition(ClassComplexe str){
		 System.out.println((this.getReel()+ str.getReel())+", "+(this.getImg()+str.getImg()));
	 }
	 
	 public String multiplication(ClassComplexe str1){
		 String str2 = this.getReel()*str1.getReel()+" "+this.getImg()*str1.getImg();
		 return str2;
	 }	
}

