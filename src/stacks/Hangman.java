package stacks;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.ArrayList;
import java.util.Stack;

public class Hangman implements KeyListener {
	JFrame frame;
	Stack<String> puzzles = new Stack<String>();
	ArrayList<JLabel> labels = new ArrayList<JLabel>();
	JPanel panel;
	String currentWord;
	public static void main(String[] args)
	{
		new Hangman();
	}
	
	public Hangman()
	{
		addPuzzles();
		createUI();
	}
	
	public void createUI()
	{
		frame = new JFrame("Hangman");
		panel = new JPanel();
		frame.setVisible(true);
		frame.setSize(300, 150);
		frame.add(panel);
		frame.addKeyListener(this);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public void playCurrentPuzzle(String puzzle)
	{
		for(int i = 0; i < puzzle.length(); i++)
		{
			JLabel label = new JLabel();
			label.setText("_ ");
			labels.add(label);
			panel.add(label);
		}
	}
	
	public void addPuzzles()
	{
		puzzles.add("hamburger");
		puzzles.add("dancing");
		puzzles.add("umbrellas");
	}
	
	private void updateBoxes(char keyChar)
	{
		String puzzle = currentWord;
		for(int i = 0; i < puzzle.length(); i++)
		{
			if(puzzle.charAt(i)==keyChar)
			{
				labels.get(i).setText(""+keyChar+" ");
			}
		}
	}

	@Override
	public void keyTyped(KeyEvent e) {	

		if(e.getKeyCode()==0)
		{
			currentWord = puzzles.pop();
			playCurrentPuzzle(currentWord);
		}
		else
		{
			updateBoxes(e.getKeyChar());
		}
	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

}
