import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.*;
public class Calculator {
	private JFrame fr;
	private JPanel p1, p2, p3, p4, p5;
	private JTextField tf1;
	private JButton bn1, bn2, bn3, bn4, bn5, bn6, bn7, bn8, bn9, bn10, bn11, bn12, bn13, bn14, bn15, bn16;
	public void init() { 
		fr = new JFrame("Calculator");
		fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		fr.setFont(new Font("Dialog", Font.BOLD, 14));
		fr.setLayout(new GridLayout(5, 0));
		p1 = new JPanel();
		p1.setLayout(new GridLayout(1, 1));
		p2 = new JPanel();
		p2.setLayout(new GridLayout(1, 4));
		p3 = new JPanel();
		p3.setLayout(new GridLayout(1, 4));
		p4 = new JPanel();
		p4.setLayout(new GridLayout(1, 4));
		p5 = new JPanel();
		p5.setLayout(new GridLayout(1, 4));
		tf1 = new JTextField("0.0");
		tf1.setHorizontalAlignment(JTextField.RIGHT);
		tf1.setEditable(false);
		bn1 = new JButton("0");
		bn2 = new JButton("1");
		bn3 = new JButton("2");
		bn4 = new JButton("3");
		bn5 = new JButton("4");
		bn6 = new JButton("5");
		bn7 = new JButton("6");
		bn8 = new JButton("7");
		bn9 = new JButton("8");
		bn10 = new JButton("9");
		bn11 = new JButton(".");
		bn12 = new JButton("=");
		bn13 = new JButton("+");
		bn14 = new JButton("-");
		bn15 = new JButton("*");
		bn16 = new JButton("/");
		p1.add(tf1);
		p2.add(bn8);
		p2.add(bn9);
		p2.add(bn10);
		p2.add(bn13);
		p3.add(bn5);
		p3.add(bn6);
		p3.add(bn7);
		p3.add(bn14);
		p4.add(bn2);
		p4.add(bn3);
		p4.add(bn4);
		p4.add(bn15);
		p5.add(bn1);
		p5.add(bn11);
		p5.add(bn12);
		p5.add(bn16);
		fr.add(p1, BorderLayout.NORTH);
		fr.add(p2);
		fr.add(p3);
		fr.add(p4);
		fr.add(p5, BorderLayout.SOUTH);
		fr.pack();
		fr.setVisible(true);
	}
	
	
	public static void main(String[] args) {
		Calculator mm = new Calculator();
		mm.init();
	}
}
