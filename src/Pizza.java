
public class Pizza {

	int quantity;
	int price;
	String name;
	public  Pizza(String name, int quantity, int price) {
		super();
		this.name=name;
		this.quantity = quantity;
		this.price = price;
		
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
	
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	
	public float getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
	public void printDetail()
	{
		
		
		System.out.println(getName()+"                     "+getQuantity()+"               "	+getPrice()+"               "	+FindPrice());
		
		
		
	}
	public int FindPrice()
	{
		int total;
		total=(int) (getQuantity()*getPrice());
		return total;
	}
	
	

}
