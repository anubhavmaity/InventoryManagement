public class InvntryMngmt
{
	public static void main(String[] args)
	{
		Product p1 = new Product(100, 1, 2);
		Product p2 = new Product(200, 2, 5);
		Product p3 = new Product(10, 3, 7);
		Product p4 = new Product(1000, 4, 7);


		Inventory i = new Inventory();
		i.addProduct(p1);
		i.addProduct(p2);
		i.addProduct(p3);
		i.addProduct(p4);

		i.decrQntyPrdct(p2.getId(), 3);
		i.incrQntyPrdct(p1.getId(), 1);
		i.incrPricePrdct(p3.getId(), 140);
		i.decrPricePrdct(p4.getId(), 500);
		i.removeProduct(p3.getId());



		i.showInventory();
	}
}