import java.util.ArrayList;
import java.util.Scanner;

public class LovelyPalindromes {
	private ArrayList<LPWord> words;
	public LovelyPalindromes(String w)
	{
		words = new ArrayList<LPWord>();
		Scanner scan = new Scanner(w);
		while(scan.hasNext())
		{
			LPWord word = new LPWord(scan.next());
			words.add(word);
		}
	}

	public String getPalindromes()
	{
		String pal = "";
		for(int i = 0; i < words.size(); i++)
		{
			if((words.get(i)).equals(words.get(i).getReverse()))
			{
				pal = words.get(i)+"\n"+pal;
			}
		}
		return pal;
	}
	
}
