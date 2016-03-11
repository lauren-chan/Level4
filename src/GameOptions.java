import java.util.HashMap;

public class GameOptions {
	static HashMap<String, String> options = new HashMap<String,String>();
	
	public static void addOption(String option, String value)
	{
		options.put(option, value);
	}
	
	public static String getOption(String option)
	{
		return options.get(option);
	}
	
	public static void main(String[] args)
	{
		addOption("Lauren","League of Legends");
		addOption("John","Hearthstone");
		addOption("Emi","Smash");
		System.out.println(getOption("Lauren"));
		System.out.println(getOption("blah").equals(""));
	}

}
