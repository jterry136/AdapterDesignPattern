/**
 * An adapter. This class specifies the Product and ProductListing
 * to a specific item, a shoe
 * @author Jonathan Terry
 *
 */
public class ShoeListingAdapter implements ProductListing{
	private ShoeListing shoe;
	private String title;
	private String brand;
	private double price;
	private String description;
	
	/**
	 * A parameterized constructor. Creates a new ShoeListingAdapter and sets the value of this.shoe
	 * to the parameter value.
	 * @param shoe: The Shoe being represented by the listing (A ShoeListing)
	 */
	public ShoeListingAdapter(ShoeListing shoe) {
		this.shoe = shoe;
	}
	
	/**
	 * Note to self: Need to use substring and indexOf to retireve data
	 */
	public String getTitle() {
		String shoeString = shoe.toString();
		String shoeType =  shoeString.substring(shoeString.indexOf("Shoe: "), shoeString.indexOf("By: "));
		return shoeType.substring(shoeType.indexOf(" "));
	
	}
	
	public double getPrice() {
		String shoeString = shoe.toString();
		String temp = shoeString.substring(shoeString.indexOf("Cost: "));
		return Double.parseDouble(temp.substring(temp.indexOf(" ")));
	}
	
	public String getDescription() {
		String shoeString = shoe.toString();
		String description = shoeString.substring(shoeString.indexOf("Details: "), shoeString.indexOf("Cost: "));
		String brand = shoeString.substring(shoeString.indexOf("By: "), shoeString.indexOf("Details: "));
		return "Created by " + brand.substring(brand.indexOf(" ")) + "," + description.substring(description.indexOf(" "));
	}
	
	
}
