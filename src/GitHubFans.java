import java.util.ArrayList;
import java.util.Random;

public class GitHubFans {
	
	private static String[] usernames = {"lauren-chan","Joelforman","techied","thesimplemango","buskcoin","yuz217"};
	public static void main(String[] args)
	{
		GitHubFans test = new GitHubFans();
		System.out.println(test.getRandom()+"\n\n");	
		int flag = 1;
		while(flag > 0)
		{
			flag = 0;
		for (int i = 0; i < usernames.length-1; i++)
		{
			int comparison = (usernames[i]).compareToIgnoreCase(usernames[i+1]);
			if(comparison < 0)
			{
				String first = usernames[i];
				usernames[i] = usernames[i+1];
				usernames[i+1] = first;
				flag++;
			}
		}
		
		}
		String ret = "";
		for(int i = 0; i < usernames.length-1; i++)
		{
			ret = usernames[i]+" "+ret;
		}
		System.out.println(ret);
		
	}

	public String getRandom()
	{
		Random rand = new Random();
		int random = rand.nextInt(6);
		return "Random username: "+usernames[random];
	}
}
