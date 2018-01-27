package order;

public class Delivery {

	private boolean shipping;
	private int pickupPoint;
	private double cost;
	private String recipient, address, label;
	
	
	public void setDelivery (String recipient, String address){
		this.recipient = recipient;
		this.address = address;
		this.shipping = true;
		this.cost = 20.0;
		this.label = "Ship to:\n" + recipient + "\n" + address;
	}
	
	public void setDelivery (int pickupPoint) {
		this.pickupPoint = pickupPoint;
		this.shipping = false;
		this.cost = 0;
		this.label = "Pickup point no. " + pickupPoint;
	}
	
	public boolean isShipping() {
		return shipping;
	}

	public void setShipping(boolean shipping) {
		this.shipping = shipping;
	}

	public int getPickupPoint() {
		return pickupPoint;
	}

	public void setPickupPoint(int pickupPoint) {
		this.pickupPoint = pickupPoint;
	}

	public double getCost() {
		return cost;
	}

	public void setCost(double cost) {
		this.cost = cost;
	}

	public String getRecipient() {
		return recipient;
	}

	public void setRecipient(String recipient) {
		this.recipient = recipient;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "\nFor shipping: " + shipping + "\t, cost: " + cost + " z³\n\n" + label;
	}
	
	

}