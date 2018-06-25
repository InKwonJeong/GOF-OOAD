package order;

import manage.Menu;

public class OrderMenu 
{
	private Menu menu;
	private int quantity;
	
	public OrderMenu(Menu menu, int quantity) 
	{
		this.menu = menu;
		this.quantity = quantity;
	}
	
	public double getSubtotal()
	{
		double subtotal = menu.getPrice() * quantity;
		return subtotal;
	}
	
	public void displayOrderMenu()
	{
		System.out.printf("%-20s %s  $ %.1f\n", menu.getMenuName(), quantity, getSubtotal());
	}
	
	public Menu getMenu() {
		return menu;
	}

	public void setMenu(Menu menu) {
		this.menu = menu;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

}
