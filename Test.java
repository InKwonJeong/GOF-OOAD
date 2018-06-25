import manage.Store;
import order.*;

public class Test {

	public static void main(String[] args) 
	{
		//�����ֹ��ý��� ����
		Store store = new Store();
		
		//���� �޴� ��� �� ���� ���
		store.addMenu("1","CheeseBurger", 10.0, "Burger");
		store.addMenu("2","ChickenBurger", 12.0, "Burger");
		store.addMenu("3","BeefBurger", 15.0, "Burger");
		store.addMenu("4","Coke", 2.0, "Beverage");
		store.addMenu("5","Sprite", 2.0, "Beverage");
		store.addMenu("6","ApplePie", 3.0, "Appetizer");
		store.addMenu("7","FrenchFries", 3.0, "Appetizer");
		store.addMenu("8","CheeseBurger Set", 12.0, "SetMenu");
		store.addMenu("9","ChickenBurger Set", 14.0, "SetMenu");
		store.addMenu("10", "Fanta", 2.0, "Beverage");
		store.addCoupon("11", "1", 5.0, "Absolute");
		store.addCoupon("22", "2", 0.2, "Percent");
		store.addCoupon("33", "9", 0.3, "Percent");
		
		//���� �޴� ���� �� ���� ����
		store.removeMenu("10");
		store.removeCoupon("11");
		
		//��Ʈ �޴��� ���Ե� �޴� ��� �� ����
		store.addMenutoSet("1", "8");
		store.addMenutoSet("4", "8");
		store.addMenutoSet("7", "8");
		store.addMenutoSet("6", "8");
		store.removeMenuFromSet("6", "8");
		
		store.addMenutoSet("2", "9");
		store.addMenutoSet("4", "9");
		store.addMenutoSet("7", "9");

		
		//���� �޴� �����ֱ�
		System.out.print("�޴���");
		Register register = store.getRegister();
		register.displayMenu();
		System.out.println("*********************************");
		
		//�� �ֹ� �� ����
		register.makeOrder();
		register.orderMenu("1", 2);
		register.orderMenu("2", 1);
		register.orderMenu("3", 3);
		register.orderMenu("4", 1);
		register.orderMenu("7", 5);
		register.cancleMenu("7", 2);
		register.orderMenu("22");

		register.makePayment("4239873219");
		System.out.println("*********************************");
		
		//�� �ֹ� �� ����
		register.makeOrder();
		register.orderMenu("2", 1);
		register.orderMenu("3", 2);
		register.orderMenu("4", 4);
		register.orderMenu("8", 2);
		register.orderMenu("9", 1);
		register.cancleMenu("4", 2);
		register.orderMenu("22");
		register.orderMenu("33");

		register.makePayment("231223451236");

	}

}
