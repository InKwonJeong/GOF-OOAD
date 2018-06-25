package manage;

public class PercentCoupon extends Coupon
{

	public PercentCoupon(String couponID, Menu menu, double rate) 
	{
		super(couponID, menu, rate);
	}

	@Override
	public void discount() 
	{
		double discountedPrice = menu.getPrice() * ( 1 - discount );
		menu.setPrice(discountedPrice);
	}

	@Override
	public double getDiscount() 
	{
		return discount;
	}

	@Override
	public void setDiscount(double rate) 
	{
		if(rate > 1.0)
			throw new IndexOutOfBoundsException("Rate > 1.0");
		discount = rate;
	}
	
}
