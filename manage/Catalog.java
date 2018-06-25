package manage;

import java.util.HashMap;
import java.util.Map;

public class Catalog<T>
{
	private Map<String, T> catalog;
	
	public Catalog()
	{
		catalog = new HashMap<>();
	}
		
	public void add(String ID, T entry)
	{
		catalog.put(ID, entry);
	}
	
	public void remove(String ID)
	{
		catalog.remove(ID);
	}
	
	public T find(String ID)
	{
		return catalog.get(ID);
	}

	public Map<String, T> getCatalog() 
	{
		return catalog;
	}

}
