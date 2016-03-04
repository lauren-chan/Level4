
public class CookieOrder {
	private String variety;
	private int numBoxes;

	public CookieOrder(String v, int num) {
		variety = v;
		numBoxes = num;
	}
	
	public String getVariety()
	{
		return variety;
	}
	
	public int getNumBoxes()
	{
		return numBoxes;
	}
	
	public void setVariety(String v)
	{
		variety = v;
	}
	
	public void setNumBoxes(int num)
	{
		numBoxes = num;
	}

}
