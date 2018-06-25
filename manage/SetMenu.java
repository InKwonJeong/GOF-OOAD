package manage;
import java.util.ArrayList;
import java.util.List;

public class SetMenu extends Menu
{
	private List<Menu> setMenu;
	
	public SetMenu(String menuID, String menuName, double price) 
	{
		super(menuID, menuName, price);
		setMenu = new ArrayList<>();
	}
	
	@Override
	public void addMenuToSet(Menu menu)
	{
		setMenu.add(menu);
	}
	
	@Override
	public void removeMenuFromSet(Menu menu)
	{
		setMenu.remove(menu);
	}
	
	@Override
	public List<Menu> getSetMenu()
	{
		return setMenu;
	}
	
	@Override
	public void displayMenu() 
	{
		System.out.printf("%s %-20s  $ %s\n", menuID, menuName, price);
		System.out.print("( ");
		for(Menu menu : setMenu)
			System.out.printf("%s ", menu.getMenuName());
		System.out.print(")");
		System.out.println();
	}
	
}
