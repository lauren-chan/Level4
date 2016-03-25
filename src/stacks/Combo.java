package stacks;

import java.util.Stack;

import stacks.Burger.INGREDIENTS;

public class Combo {
	public Stack<INGREDIENTS> combo = new Stack<INGREDIENTS>();
	
	public Stack<INGREDIENTS> getComboStack() {
		return combo;
	}
	
	public void addIngredient(Burger.INGREDIENTS ingredient) {
		//TODO
		combo.add(ingredient);
	}
	
	@Override
	public String toString() {
		return combo.toString();
	}
}
