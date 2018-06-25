package order;

public class Payment 
{
	private String cardNumber;
	
	public Payment(String cardNumber)
	{
		this.cardNumber = cardNumber;
	}
	
	public StringBuilder getCardNumber() 
	{
		StringBuilder asterisked = new StringBuilder();
		for(int i=0;i<cardNumber.length();i++)
		{
			char number = cardNumber.charAt(i);
			if(i < cardNumber.length() - 4)
				asterisked.append(number);
			else
				asterisked.append('*');
		}
		return asterisked;
	}

}
