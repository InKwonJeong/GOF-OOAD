package manage;
import java.util.List;

public class Menu implements Comparable<Menu>
{
	protected String menuID;
	protected String menuName;
	protected double price;
	
	public Menu(String menuID, String menuName, double price)
	{
		this.menuID = menuID;
		this.menuName = menuName;
		this.price = price;
	}
	
	public String getMenuID() {
		return menuID;
	}

	public void setMenuID(String menuID) {
		this.menuID = menuID;
	}

	public String getMenuName() {
		return menuName;
	}

	public void setMenuName(String menuName) {
		this.menuName = menuName;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
	
	public void addMenuToSet(Menu menu)
	{
		throw new UnsupportedOperationException("Not supporting for this object");
	}
	
	public void removeMenuFromSet(Menu menu)
	{
		throw new UnsupportedOperationException("Not supporting for this object");
	}
	
	public List<Menu> getSetMenu()
	{
		throw new UnsupportedOperationException("Not supporting for this object");
	}
	
	public void displayMenu()
	{
		System.out.printf("%s %-20s  $ %.1f\n", menuID, menuName, price);
	}

	@Override
	public int compareTo(Menu other) 
	{
		return other.getClass().getSimpleName().compareTo(getClass().getSimpleName());
	}
}
