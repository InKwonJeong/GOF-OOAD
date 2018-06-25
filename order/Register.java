package order;

import java.util.Arrays;
import java.util.Map;

import manage.Catalog;
import manage.Coupon;
import manage.Menu;

public class Register 
{
	private Catalog<Menu> menuCatalog;
	private Catalog<Coupon> couponCatalog;
	private Order currentOrder;
	
	public Register(Catalog<Menu> menuCatalog, Catalog<Coupon> couponCatalog)
	{
		this.menuCatalog = menuCatalog;
		this.couponCatalog = couponCatalog;
	}
	
	public void makeOrder()
	{
		currentOrder = new Order();
	}
	
	public void makePayment(String cardNumber)
	{
		currentOrder.makePayment(cardNumber);
	}
	
	public void orderMenu(String menuID, int quantity)
	{
		Menu menu = menuCatalog.find(menuID);
		currentOrder.addOrderMenu(menu, quantity);
	}
	
	public void orderMenu(String couponID)
	{
		Coupon coupon = couponCatalog.find(couponID);
		currentOrder.addOrderMenu(coupon.getMenu(), 1);
	}
	
	public void cancleMenu(String menuID, int quantity)
	{
		Menu menu = menuCatalog.find(menuID);
		currentOrder.removeOrderMenu(menu, quantity);
	}
	
	public void cancleMenu(String couponID)
	{
		Coupon coupon = couponCatalog.find(couponID);
		currentOrder.removeOrderMenu(coupon.getMenu(), 1);
	}
	
	public void displayMenu()
	{
		String category = "";
		Map<String, Menu> catalog = menuCatalog.getCatalog();
		Object[] foods = catalog.values().toArray();
		Arrays.sort(foods);
		for(Object food : foods)
		{
			Menu menu = (Menu)food;
			if(!category.equals(food.getClass().getSimpleName()))
			{
				System.out.println();
				category = menu.getClass().getSimpleName();
				System.out.println(category);
			}
			menu.displayMenu();
		}
	}

	public void setMenuCatalog(Catalog<Menu> menuCatalog) 
	{
		this.menuCatalog = menuCatalog;
	}

	public void setCouponCatalog(Catalog<Coupon> couponCatalog)
	{
		this.couponCatalog = couponCatalog;
	}
	
}
