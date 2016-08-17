package com.turing.jdev.namingconventions;

import java.awt.Font;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class MyWindow extends Frame{

	public MyWindow(String title){
		super(title);
		setSize(500, 140);
		
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosed(WindowEvent event){
				System.exit(0);
			}
		});
	}
	
	@Override
	public void paint(Graphics grafics){
		super.paint(grafics);
		
		Font sanSenrifLarge = new Font("SansSerif", Font.BOLD, 18);
		Font sanSenrifSmall = new Font("SansSerif", Font.BOLD, 12);
		grafics.setFont(sanSenrifLarge);
		grafics.drawString("Charangueate, llenate de Charanga, anda!!", 60, 60);
		grafics.setFont(sanSenrifSmall);
		grafics.drawString("Tim and La Charanga Habanera", 60, 100);
		
		
		
	}
	
	
	
	
}
