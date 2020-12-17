package _07_binary_converter;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class binary_converter implements ActionListener {
JFrame frame = new JFrame();
JPanel panel = new JPanel();
JTextField text = new JTextField(10);
JLabel label = new JLabel();
JButton button = new JButton("Convert");
binary_converter(){
	frame.add(panel);
	panel.add(text);
	panel.add(label);
	panel.add(button);
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	button.addActionListener(this);
	frame.setVisible(true); 
	frame.pack();
}
@Override
public void actionPerformed(ActionEvent e) {
	// TODO Auto-generated method stub
String result =  text.getText();
String result2 = convert(result); 
label.setText(result2);
frame.pack();
}


String convert(String input) {
    if(input.length() != 8){
        JOptionPane.showMessageDialog(null, "Enter 8 bits, silly!!!");
        return "-";
    }
    String binary = "[0-1]+";//must contain numbers in the given range
    if (!input.matches(binary)) {
        JOptionPane.showMessageDialog(null, "Binary can only contain 1s or 0s, silly!!!");
        return "-";   
    }
    try {
        int asciiValue = Integer.parseInt(input, 2);
        char theLetter = (char) asciiValue;
        return "" + theLetter;
    } catch (Exception e) {
        JOptionPane.showMessageDialog(null, "Enter a binary, silly!!!");
        return "-";
    }
}
}
