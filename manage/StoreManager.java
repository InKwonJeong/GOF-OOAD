package manage;

public class StoreManager 
{
	private static StoreManager instance;
	
	private StoreManager() {}
	
	public static synchronized StoreManager getInstance()
	{
		if(instance == null)
			instance = new StoreManager();
		
		return instance;
	}
	
	public Menu createMenu(String menuID, String menuName, double price, String type)
	{
		switch(type)
		{
			case "Burger": 
				return new Burger(menuID, menuName, price);
			case "Beverage": 
				return new Beverage(menuID, menuName, price);
			case "Appetizer": 
				return new Appetizer(menuID, menuName, price);
			case "SetMenu": 
				return new SetMenu(menuID, menuName, price);
			default:
				return null;
		}
	}
	
	public Coupon createCoupon(String couponID, Menu menu, double discount, String type)
	{
		switch(type)
		{
			case "Absolute": 
				return new AbsoluteCoupon(couponID, menu, discount);
			case "Percent": 
				return new PercentCoupon(couponID, menu, discount);
			default:
				return null;
		}
	}
	
}
