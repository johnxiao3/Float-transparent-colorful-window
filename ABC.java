package com.ABC;

import java.awt.Color;

import javax.swing.JFrame;

public class ABC extends JFrame {
	
	public ABC(){
		this.setTitle("abc");
    	this.setSize(200,200);
    	this.setLocation(0,0);
    	this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    	this.getContentPane().setVisible(false);
    	
    	this.setUndecorated(true);
    	//this.setOpacity(0.5F);
    	com.sun.awt.AWTUtilities.setWindowOpacity(this, 0.5f); 
    	
    	
    	this.setVisible(true);   
    	this.setAlwaysOnTop(true);
    	
    	while(true){
        	this.setBackground(Color.green);
    		this.repaint();
    		try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
    		this.setBackground(Color.red);
    		this.repaint();
    		try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
    	}
    	
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new ABC();
	}
}
