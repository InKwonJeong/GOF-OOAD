package manage;

public abstract class Coupon 
{
	protected String couponID;
	protected Menu menu;
	protected double discount;
	
	public Coupon(String couponID, Menu menu, double discount)
	{
		setCouponID(couponID);
		setMenu(menu);
		setDiscount(discount);
		discount();
	}
	
	public void setCouponID(String couponID) {
		this.couponID = couponID;
	}

	public void setMenu(Menu menu) {
		this.menu = new Menu(menu.getMenuID(), menu.getMenuName()+"(c)", menu.getPrice());
	}

	public String getCouponID() {
		return couponID;
	}

	public Menu getMenu() {
		return menu;
	}

	public abstract double getDiscount();

	public abstract void setDiscount(double discount);
	
	public abstract void discount();
	
}
