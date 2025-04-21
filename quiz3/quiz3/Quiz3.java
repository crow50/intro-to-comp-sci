package quiz3;

import java.awt.BorderLayout;

import javax.swing.*;

public class Quiz3 extends JFrame  {
	
	Quiz3(){
		JFrame frame = new JFrame("Live Quiz 3");
		frame.setSize(600,800);
		frame.setVisible(rootPaneCheckingEnabled);
		
		JTextArea textArea = new JTextArea();
		
		JPanel panel = new JPanel();
		
		frame.add(textArea, BorderLayout.NORTH);
		textArea.setText("Here comes the game!");
		
		JButton newGame = new JButton("New Game");
		JButton loadGame = new JButton("Load Game");
		JButton saveGame = new JButton("Save Game");
		

		
		panel.setLayout(new BorderLayout());
		panel.add(newGame,BorderLayout.EAST);
		panel.add(saveGame,BorderLayout.CENTER);
		panel.add(loadGame,BorderLayout.WEST);
		frame.add(panel, BorderLayout.CENTER);
		
		
		frame.setLayout(new BorderLayout());
		frame.setDefaultCloseOperation(EXIT_ON_CLOSE);

		
		
	}

	public static void main(String[] args) {
		new Quiz3();
	}
	
	/*@Override
	*public void actionPerformed(ActionEvent e) {
	*	
	*}
*/
}
