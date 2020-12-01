/**
 * This class describes a generic product in a store. It contains data relevant to 
 * any store product (title, price, description)
 * @author Jonathan Terry
 *
 */
public class Product implements ProductListing{
	private String title;
	private double price;
	private String description;
	
	/**
	 * A parameterized constructor. Creates a new Product object and 
	 * assigns its instance variables the corresponding values from parameters.
	 * @param title: The title, or name, of the product (A String)
	 * @param price: The cost of the product, in dollars (A double)
	 * @param description: The description of the product (A String)
	 */
	public Product(String title, double price, String description) {
		this.title = title;
		this.price = price;
		this.description = description;
	}

	/**
	 * Returns the value of this.title
	 * @return: String
	 */
	public String getTitle() {
		return title;
	}

	/**
	 * Returns the value of this.price
	 * @return: Double
	 */
	public double getPrice() {
		return price;
	}

	/**
	 * Returns the value of this.description
	 * @return: String
	 */
	public String getDescription() {
		return description;
	}
	
	

}
