package manage;

import order.Register;

public class Store 
{
	private Register register;
	private Catalog<Menu> menuCatalog;
	private Catalog<Coupon> couponCatalog;
	
	public Store()
	{
		menuCatalog = new Catalog<>();
		couponCatalog = new Catalog<>();
		register = new Register(menuCatalog, couponCatalog);	
	}
	
	public void addMenu(String menuID, String menuName, double price, String type)
	{
		Menu menu = StoreManager.getInstance().createMenu(menuID, menuName, price, type);
		menuCatalog.add(menuID, menu);
		register.setMenuCatalog(menuCatalog);
	}
	
	public void removeMenu(String menuID)
	{
		menuCatalog.remove(menuID);
		register.setMenuCatalog(menuCatalog);
	}
	
	public void addCoupon(String couponID, String menuID, double discount, String type)
	{
		Menu menu = menuCatalog.find(menuID);
		Coupon coupon = StoreManager.getInstance().createCoupon(couponID, menu, discount, type);
		couponCatalog.add(couponID, coupon);
		register.setCouponCatalog(couponCatalog);
	}
	
	public void removeCoupon(String couponID)
	{
		menuCatalog.remove(couponID);
		register.setCouponCatalog(couponCatalog);
	}
	
	public void addMenutoSet(String menuID, String setMenuID)
	{
		Menu menu = menuCatalog.find(menuID);
		Menu setMenu = menuCatalog.find(setMenuID);	
		
		if(setMenu instanceof SetMenu)
			setMenu.addMenuToSet(menu);
	}
	
	public void removeMenuFromSet(String menuID, String setMenuID)
	{
		Menu menu = menuCatalog.find(menuID);
		Menu setMenu = menuCatalog.find(setMenuID);	
		
		if(setMenu instanceof SetMenu)
			setMenu.removeMenuFromSet(menu);
	}
	
	public Register getRegister()
	{
		return register;
	}
}
