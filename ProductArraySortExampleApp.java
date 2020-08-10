package main;

public class ProductArraySortExampleApp {

	public static void main(String[] args) {
		
		Product[] products = {
				new Product("Pizza", 75, 5),
				new Product("Salad", 25, 4),
				new Product("Coffee", 45, 2)
		};
		Product temp;
		
		for(int j = 0; j < products.length - 1; j++) {
		for(int i = 0; i < products.length - 1; i++) {
			if( products[i].getPrice() > products[i+1].getPrice() ) {						
				temp = products[i];
				products[i] = products[i+1];
				products[i+1] = temp;
			} else if 
				(products[i].getRating() < products[i+1].getRating() ) {
					temp = products[i];
					products[i] = products[i+1];
					products[i+1] = temp;
				}
				
		     }	
			
		} 		

 
	
		
		for (Product product : products) {
			System.out.println(product);
		}
	}

}
/////////////////////////
class Product {

	private String name;   // 2 symbols +
	private int price;     // 0..10000
	private int rating;    // 0..5
	
	
	public Product(String name, int price, int rating) {
		this.name = name;
		this.price = price;
		this.rating = rating;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		if(name.length() > 2)
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		if(price >= 0 & price <= 10000)
		this.price = price;
		else
			System.out.println("Wrong price!");
	}
	public int getRating() {
		return rating;
	}
	public void setRating(int rating) {
		if(rating >= 0 & rating <= 5)
		this.rating = rating;
		else
			System.out.println("Wrong rating!");
	}

	@Override
	public String toString() {
		return "Product [" + name + ", " + price + "MDL, " + rating + " *]";
	}
	
}
