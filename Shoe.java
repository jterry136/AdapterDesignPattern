/**
 * This class represents a shoe in the context of a product in a store
 * @author Jonathan Terry
 *
 */
public class Shoe implements ShoeListing{
	private String brand;
	private String name;
	private double cost;
	private String description;
	
	/**
	 * A parameterized constructor. Creates a new Shoe object and sets its instance variable values to the corresponding parameters.
	 * @param brand: The brand the shoe belongs to (A String)
	 * @param name: The name of the specific shoe style (A String)
	 * @param cost: the cost of the shoe (a double)
	 * @param description: A description of the shoe's features (A String)
	 */
	public Shoe(String brand, String name, double cost, String description) {
		this.brand = brand;
		this.name = name;
		this.cost = cost;
		this.description = description;
	}
	
	public String toString() {
		return "Shoe: " + this.name +
				"By: " + this.brand + 
				"Details: " + this.description +
				"Cost: " + this.cost + "\n";
	}

}
