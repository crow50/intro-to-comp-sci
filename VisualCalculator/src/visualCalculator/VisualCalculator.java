package visualCalculator;

	import javax.swing.*;
	import java.awt.*;
	import java.awt.event.ActionEvent;
	import java.awt.event.ActionListener;
	


public class VisualCalculator  extends JFrame implements ActionListener{
	
	//Creates calculator frame
	//Comes from swing package
	public JFrame frame;
	
	//Create text field
	//Also comes from sing package
	private JTextField textField;
	private Double num1, num2, result;
	private String operator = "";
	
	//Creating our constructor
	VisualCalculator(){
		frame = new JFrame("Calculator");
		
		textField = new JTextField();
		
		JButton[] numberButtons = new JButton[10];
		
		for (int i = 0; i < 10; i++) {
			numberButtons[i] = new JButton(String.valueOf(i));
			numberButtons[i].addActionListener(this);
		}
		
		//Adding Buttons individually
		JButton divButton = new JButton("/");
		JButton mulButton = new JButton("*");
		JButton subButton = new JButton("-");
		JButton addButton = new JButton("+");
		JButton eqButton = new JButton("=");
		JButton clrButton = new JButton("C");
        JButton decimalButton = new JButton("."); // Add decimal button

		
		divButton.addActionListener(this);
		mulButton.addActionListener(this);
		subButton.addActionListener(this);
		addButton.addActionListener(this);
		eqButton.addActionListener(this);
		clrButton.addActionListener(this);
		decimalButton.addActionListener(this);

		
		JPanel panel = new JPanel();
		panel.setLayout(new GridLayout(5, 4, 10, 10));
		panel.add(clrButton);
		panel.add(numberButtons[7]);
		panel.add(numberButtons[8]);
		panel.add(numberButtons[9]);
		panel.add(divButton);
		panel.add(numberButtons[4]);
		panel.add(numberButtons[5]);
		panel.add(numberButtons[6]);
		panel.add(mulButton);
		panel.add(numberButtons[1]);
		panel.add(numberButtons[2]);
		panel.add(numberButtons[3]);
		panel.add(subButton);
		panel.add(addButton);
		panel.add(numberButtons[0]);
		panel.add(decimalButton);
		panel.add(eqButton);
		
		frame.setLayout(new BorderLayout());
		frame.add(textField, BorderLayout.NORTH);
		frame.add(panel);
		
		
		//Setting frame size, length, width
		frame.setSize(400, 300);
		frame.setLocation(300, 400);
		//Allows you to close a window and exit the application
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//Allowing the frame to be actually visible
		frame.setVisible(true);

		

	}	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new VisualCalculator();
		System.out.println("_________\r\n"
				+ "\r\n"
				+ " \r\n"
				+ "\r\n"
				+ "Go Hatters!!\r\n"
				+ "\r\n"
				+ "Program by: EJ Baker\r\n"
				+ "\r\n"
				+ "_________");
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		String command = e.getActionCommand();
		
		if (command.matches("[0-9]")) {
			textField.setText(textField.getText() + command);
		}
		else if (command.matches("c")) {
			textField.setText("");
			num1 = num2 = result = 0.0;
			operator = "";
		}
		else if (command.matches("=")) {
			num2 = Double.parseDouble(textField.getText());
			try {
				switch (operator) {
				case "+": result = num1 + num2;	break;
				case "-": result = num1 - num2; break;
				case "*": result = num1 * num2; break;
				case "/":
					if (num2==0) {
						textField.setText("Cannot Divide by Zero!");
						return;
					}
					result = num1 / num2;
					break;
				}
			}
			catch (NumberFormatException ex){
				textField.setText("ERROR");
			}
		num1 = result;
		textField.setText(String.valueOf(result));
		}
		else if (command.equals(".")){
            textField.setText(textField.getText() + ".");
		}
		else {
			try {
				num1 = Double.parseDouble(textField.getText());
				operator = command; 	
				textField.setText("");
			}
			catch (NumberFormatException ex) {
				textField.setText("ERROR");
			}
		}
		
		
		
	}

}
