package exercice;

public class ClassComplexe {
	//propriétés
	private int reel;
	private int img;
	
	//constructeurs vide et initialisé
	public ClassComplexe(){
		reel = 0;
		img = 0;
	}
	public ClassComplexe(int reel, int img){
		this.reel = reel;
		this.img = img;
	}
	
	//accesseurs et mutateurs
	public int getReel(){
		return reel;
	}
	public void setReel(int reel){
		this.reel=reel;
	}
	public int getImg(){
		return img;
	}
	public void setImg(int img){
		this.img = img;
	}
	
	//méthodes
	
}

