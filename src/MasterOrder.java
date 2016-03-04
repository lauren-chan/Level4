import java.util.ArrayList;
public class MasterOrder {
	private ArrayList<CookieOrder> orders;
	
	public MasterOrder()
	{
		orders = new ArrayList<CookieOrder>();
	}
	
	public ArrayList<CookieOrder> getOrders()
	{
		return orders;
	}
	
	public void addOrder(CookieOrder order)
	{
		orders.add(order);
	}
	
	public int getTotalBoxes()
	{
		int totalSum = 0;
		if(orders.size() > 0)
		{
		for(int i = 0; i < orders.size(); i++)
		{
			totalSum = orders.get(i).getNumBoxes()+totalSum;
		}
		}
		return totalSum;
	}
	
	public int removeVariety(String var)
	{
		int numRemoved = 0;
		for(int i = 0; i < orders.size(); i++)
		{
			if(orders.get(i).getVariety().equalsIgnoreCase(var))
			{
				numRemoved = orders.get(i).getNumBoxes()+numRemoved;
				orders.remove(i);			
			}
		}
		return numRemoved;
	}
	
}
