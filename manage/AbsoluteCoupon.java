package manage;

public class AbsoluteCoupon extends Coupon
{

	public AbsoluteCoupon(String couponID, Menu menu, double amount) 
	{
		super(couponID, menu, amount);
	}

	@Override
	public void discount() 
	{
		double discountedPrice = menu.getPrice() - discount;
		menu.setPrice(discountedPrice);
	}

	@Override
	public double getDiscount() 
	{
		return discount;
	}

	@Override
	public void setDiscount(double amount) 
	{
		if(amount > menu.getPrice())
			throw new IndexOutOfBoundsException("Discount > Menu Price");
		discount = amount;
	}
	
}
