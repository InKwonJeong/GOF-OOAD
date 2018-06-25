package order;

import java.util.ArrayList;
import java.util.List;

import manage.Menu;

public class Order 
{
	private List<OrderMenu> orders;
	private Payment payment;
	private static int orderNumber = 0;
	
	public Order()
	{
		orders = new ArrayList<>();
		orderNumber++;
	}

	public void makePayment(String cardNumber)
	{
		payment = new Payment(cardNumber);
		printReceipt();
	}
	
	public void addOrderMenu(Menu menu, int quantity) 
	{
		OrderMenu orderMenu = getOrderMenu(menu);
		if(orderMenu == null)
			orders.add(new OrderMenu(menu, quantity));
		else
			orderMenu.setQuantity(orderMenu.getQuantity() + quantity);
	}

	public void removeOrderMenu(Menu menu, int quantity) 
	{
		OrderMenu orderMenu = getOrderMenu(menu);
		int revised = orderMenu.getQuantity() - quantity;
		if(revised > 0)
			orderMenu.setQuantity(revised);
		else
			orders.remove(orderMenu);
	}
	
	public void printReceipt()
	{
		System.out.printf("Order Number: %s\n\n", orderNumber);
		System.out.printf("%-20s    %s\n\n", "Menu", "Price");
		for(OrderMenu order : orders)
			order.displayOrderMenu();
		System.out.println();
		System.out.printf("Total Price: $ %.1f\n", getTotal());
		System.out.printf("Card Number: %s\n\n", payment.getCardNumber());
	}
	
	public double getTotal()
	{
		double total = 0;
		for(OrderMenu order : orders)
			total += order.getSubtotal();
		return total;
	}
	
	private OrderMenu getOrderMenu(Menu menu)
	{
		for(OrderMenu order : orders)
		{
			if(menu.equals(order.getMenu()))
				return order;
		}
		return null;
	}

}
