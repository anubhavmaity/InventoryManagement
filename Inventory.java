import java.util.HashMap;
import java.util.Map;

public class Inventory
{
	private Map<Integer, Product> map;
	
	public Inventory()
	{
		this.map = new HashMap<Integer, Product>();
	}

	public boolean addProduct(Product prdct)
	{
		if (this.map.containsKey(prdct.getId()))
		{
			return false;
		}
		this.map.put(prdct.getId(), prdct);
		return true;
	}

	public void removeProduct(int id)
	{
		this.map.remove(id);
	}

	public void decrQntyPrdct(int id, int qnty)
	{
		this.map.get(id).decrQuant(qnty);
	}

	public void incrQntyPrdct(int id, int qnty)
	{
		this.map.get(id).incrQuant(qnty);
	}

	public void decrPricePrdct(int id, double price)
	{
		this.map.get(id).decrPrice(price);
	}

	public void incrPricePrdct(int id, double price)
	{
		this.map.get(id).incrPrice(price);
	}

	public void showInventory()
	{
		System.out.println();
		for (Product prdct: this.map.values())
		{
			System.out.println("Product Id : "+ prdct.getId() + " Product price : "+ prdct.getPrice() + " Product Quantity : "+ prdct.getQuant() + " Total Cost : " + (prdct.getQuant() * prdct.getPrice()));
		}
	}

}