
public class LPWord {
	
	private String word;
	
	public LPWord(String w)
	{
		word = w;
	}
	
	public String getReverse()
	{
		String reverse = "";
		for(int i = 0; i < word.length(); i++)
		{
			reverse = word.charAt(i)+reverse;
		}
		return reverse;
	}
	
}
