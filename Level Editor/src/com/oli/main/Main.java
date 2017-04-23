package com.oli.main;

import java.awt.Container;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;

public class Main extends JFrame {

	private static final long serialVersionUID = -4496194995437650680L;

	File f;
	
	public Main() {
		
		JButton openbutton = new JButton("open");
		JFileChooser filechooser = new JFileChooser();
		Container c = getContentPane();
		
		setTitle("Level Editor");
		setSize(640, 480);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setResizable(false);
		
		c.add(openbutton);
		
		openbutton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				
				int result = filechooser.showOpenDialog(getContentPane());
				f = filechooser.getSelectedFile();
				
			}
			
		});
		
	}
	
	public static void main(String[] args) {
		
		EventQueue.invokeLater(() -> {
			
			Main x = new Main();
			x.setVisible(true);
			
		});

	}

}
