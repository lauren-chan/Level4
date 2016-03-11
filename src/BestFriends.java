import java.util.HashMap;

public class BestFriends {
	static HashMap<String, String> bffs = new HashMap<String, String>();

	public static void main(String[] args) {
		bffs.put("June", "Spock");
		bffs.put("Uhura", "Uhura's bff");
		bffs.put("Sulu", "Scotty");
		System.out.println(bffs.toString());
		bffs.remove("June");
		System.out.println("\nAfter removing June/Spock \n"+bffs.toString());
		bffs.put("June", "Captain Kirk");
		System.out.println("\nAfter adding June/Captain Kirk\n"+bffs.toString());
		System.out.println("\nUhura's best friend: "+bffs.get("Uhura"));
		bffs.put("Sulu", "Uhura");
		System.out.println("\nAfter setting Sulu's best friend to Uhura: \n"+bffs.toString());
		System.out.println("\n"+checkKirk());
	}
	
	public static boolean checkKirk()
	{
		String friend = bffs.get("Captain Kirk");
		return friend!=null;
	}
}
