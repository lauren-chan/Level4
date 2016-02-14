
public class Money {
	public static void main(String[] args)
	{
		/**int money = 1;
		int count = 0;
		while(money <= 1000000)
		{
			money = money*2;
			count++;
		}
		System.out.println(count+" years");
		*/
		
		/**int cnt = 0;
		while(cnt >= 0)
		{
			if(cnt%2==1)
			{
				System.out.println("white");
			}
			else
			{
				System.out.println("black");
			}
			cnt++;
		}*/
		int slices = 1046;
		int count = 0;
		while(slices > 0)
		{
			slices = slices - (slices/2);
			count++;
		}
		System.out.println(count);
		
	}
}
