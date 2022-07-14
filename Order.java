
public class Order {
	String Name;
	double Price;
	
	public Order() {
		
	}
	
	public Order(String Name, double Price) {
		this.Name = Name;
		this.Price = Price;
	}
	

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public double getPrice() {
		return Price;
	}

	public void setPrice(double price) {
		Price = price;
	}
}
