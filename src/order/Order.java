package order;

import offer.*;
import java.util.ArrayList;
import java.util.List;

public class Order {
	
	public Order(){
		this.items = new ArrayList<OrderItem>();
		this.subTotal = 0.0;
		this.itemsCounter = 0;
		this.delivery = new Delivery();
	}
	
	private List<OrderItem> items;
	private double subTotal, total;
	private int itemsCounter;
	private Delivery delivery;
	
	public void add(String name, String size, int qty) {
		Cake cake = CakeFactory.createCake(name);
		OrderItem orderItem = new OrderItem(cake, size, qty);
		items.add(orderItem);
		subTotal += orderItem.getValue();
		itemsCounter += qty;
	}

	public List<OrderItem> getItems() {
		return items;
	}

	public int getItemsCounter() {
		return itemsCounter;
	}
	

	public double getSubTotal(){
		return subTotal;
	}

	public void updateSubTotal(){
		this.subTotal = 0.0;
		for (OrderItem item : items){
			subTotal += item.getValue();
		}
	}
	
	public void updateTotal(){
		total = subTotal + delivery.getCost();
	}
	
	public Delivery getDelivery(){
		return delivery;
	}
		
	public void setDelivery(int pickupPoint){
		delivery.setDelivery(pickupPoint);
		updateTotal();
	}
	
	public void setDelivery(String recipient, String address){
		delivery.setDelivery(recipient, address);
		updateTotal();
	}
		
	
	@Override
	public String toString() {
		String string = "";
		string += "\n======================================= Order =======================================\n"
				+ "\n # Items:";
		
		int i = 0;
		for (OrderItem item : items){
			string += ("\n" + ++i + ". " + item.toString());
		}
		
		string += "\n\n # Subtotal:\t" + itemsCounter + " sztuk\t\t" + subTotal + " z³\n"
				+ delivery + "\n\n # Total:\t" + total + " z³\n"
				+ "\n=====================================================================================\n";
		return string;
	}
	
	
}
