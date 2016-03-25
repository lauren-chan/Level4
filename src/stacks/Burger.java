package stacks;

import java.util.Stack;

public class Burger {
	public enum INGREDIENTS {BREAD, STEAK, LETTUCE, BACON, TOMATOS, ONIONS, PICKLES, AVOCADOS, CHEESE};
	public Stack<INGREDIENTS> burger = new Stack<INGREDIENTS>();
	
	public void addCombo(Combo combo) {
		if(burger.size()>1)
			burger.add(INGREDIENTS.BREAD);
		burger.addAll(combo.getComboStack());
		//TODO
	}
	
	public Burger() {
		burger.add(INGREDIENTS.BREAD);
	}
	
	public void finishBurger() {
		burger.add(INGREDIENTS.BREAD);
	}
	
	@Override
	public String toString() {
		return burger.toString();
	}
	
	public int getNumberOfBread() {
		int total = 0;
		while(burger.size()>0)
		{
			if(burger.pop().equals(INGREDIENTS.BREAD))
			{
				total++;
			}
		}
		return total;
	}
	
	/**public int getNumberOfSteak() {
		int total = 0;
		while(burger.size()>0)
		{
			if(burger.lastElement().equals(INGREDIENTS.STEAK))
			{
				total++;
			}
			burger.pop();
		}
		return total;
	}*/
}
