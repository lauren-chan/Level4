
public class Reverse {
	public static void main(String[] args)
	{
		Reverse rev = new Reverse();
		System.out.println(rev.assertEquals("frab",rev.reverseMe("barf")));
	}
	public String reverseMe(String w)
	{
		String ret = "";
		StringBuilder word = new StringBuilder(w);
		for(int i = word.length()-1;i >= 0; i--)
		{
			ret = ret+word.charAt(i);
		}
		return ret;
	}
	public boolean assertEquals(String reverse, String w)
	{
		if(reverse.equals(w))
		{
			return true;
		}
		return false;
	}

}
