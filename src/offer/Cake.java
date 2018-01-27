package offer;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public abstract class Cake {
	
// Fields
	protected String name;
	protected double price;
	protected String size;

 	protected List<String> ingredients = new ArrayList<>();

 	protected HashMap<String, Double> sizesPrices = new HashMap<String, Double>();

 // Constructor
 	/*
 	public Cake (){}
 	public Cake (String size){
 		if (!setSize(size)) {
 			throw new IllegalArgumentException("\nRozmiar \"" + size + "\" nie jest dostepny.");
 		}
 	}*/
 	
 	
//Methods for OBJECT
 	public String getSize(){
		return size;
	}
 	
	public boolean setSize(String size){
		if (this.sizesPrices.containsKey(size)){
			this.size = size;
			this.price = this.sizesPrices.get(size);
			return true;
		}
		return false;
	}
	
	public double getPrice(){
		return price;
	}
	
	@Override
	public String toString() {
		return name + " " + size + " \t" + price + " z³/szt.";
	}

	public void printAbout() {
	System.out.println("About Cake " + name + "\n" + ingredients.toString() + "\n EOF");
	}
	
	//byle STATIC Methods
	public String getName(){
		return name;
	}
	
	public String getIngredients(){
		return this.ingredients.toString();
	}
	
	public double getSizePrice(String size){
		if (!this.sizesPrices.containsKey(size))
			return -1.0;
		return this.sizesPrices.get(size);
	}

}
