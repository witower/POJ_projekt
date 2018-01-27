package order;

import offer.*;

public class OrderItem {
	private Cake cake;
	private int qty;
	private double value;
	
	public OrderItem(Cake cake, String size, int qty){
		if(!cake.setSize(size))
    		throw new IllegalArgumentException("\nRozmiar \"" + size + "\" nie jest dostepny.");
    	else {
			this.cake = cake;		
			setQty(qty);
    	}
	}

	public Cake getCake() {
		return cake;
	}

	public int getQty() {
		return qty;
	}

	public void setQty(int qty) {
		this.qty = qty;
		this.value = cake.getPrice()*qty;
	}

	public double getValue() {
		return value;
	}
	
	@Override
	public String toString() {
		return (cake.toString() + "\t" + qty + "\t" + value + " z³" + "\n\t" + cake.getIngredients());
	}

}
