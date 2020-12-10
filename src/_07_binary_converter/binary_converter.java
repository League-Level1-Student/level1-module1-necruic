package _07_binary_converter;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class binary_converter implements ActionListener {
JFrame frame = new JFrame();
JPanel panel = new JPanel();
JTextField text = new JTextField();
JLabel label = new JLabel();
JButton button = new JButton();
binary_converter(){
	frame.add(panel);
	panel.add(text);
	panel.add(label);
JTextField answer = new JTextField(20);
	button.addActionListener(this);
}
@Override
public void actionPerformed(ActionEvent e) {
	// TODO Auto-generated method stub
	
}
}
