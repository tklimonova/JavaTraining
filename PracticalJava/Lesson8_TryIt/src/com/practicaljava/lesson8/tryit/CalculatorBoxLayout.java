package com.practicaljava.lesson8.tryit;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class CalculatorBoxLayout {
	
	  // Declare all calculator's components.
		static JPanel windowContent;
		private JTextField displayField;
		JButton button0;
		JButton button1;
		JButton button2;
		JButton button3;
		JButton button4;
		JButton button5;
		JButton button6;
		JButton button7;
		JButton button8;
		JButton button9;
		JButton buttonPoint;
		JButton buttonEqual;
		static JPanel p1;

	    public void setDisplayValue(String val){
	        displayField.setText(val);
	    }

	    public String getDisplayValue() {
	        return displayField.getText();
	    } 

		
	      // Constructor  creates the components
	      // and adds the to the frame using Boxlayout

	    public CalculatorBoxLayout(){

		  windowContent= new JPanel();

		 // Set the layout manager for this panel
		  BoxLayout bl = new BoxLayout(windowContent, BoxLayout.Y_AXIS); 
	         windowContent.setLayout(bl);

	       // Create the display field and place it in the   
	       // North area of the window

		  displayField = new JTextField(30);
		  windowContent.add("North",displayField);

	     // Create buttons using constructor of the  
	     // class JButton that takes the label of the 
	     // button as a parameter 

		  button0=new JButton("0");
		  button1=new JButton("1");
		  button2=new JButton("2");
		  button3=new JButton("3");
		  button4=new JButton("4");
		  button5=new JButton("5");
		  button6=new JButton("6");
	      button7=new JButton("7");
	      button8=new JButton("8");
		  button9=new JButton("9");
		  buttonPoint = new JButton(".");
		  buttonEqual=new JButton("=");

		 // Create the panel with the GridLayout with 12 buttons – 
	     //10 numeric ones, period, and the equal sign   

			  p1 = new JPanel();
			  BoxLayout gl =new BoxLayout(p1, BoxLayout.Y_AXIS); 
			  p1.setLayout(gl);

		 //  Add window controls to the panel p1
			  p1.add(button1);
			  p1.add(button2);
			  p1.add(button3);
			  p1.add(button4);
			  p1.add(button5);
			  p1.add(button6);
			  p1.add(button7);
			  p1.add(button8);
			  p1.add(button9);
			  p1.add(button0);
			  p1.add(buttonPoint);
			  p1.add(buttonEqual);
			  
			  
			  CalculatorBoxLayoutEngine calcEngine = new CalculatorBoxLayoutEngine(this);
			  button0.addActionListener(calcEngine);
			  button1.addActionListener(calcEngine);
			  button2.addActionListener(calcEngine);
			  button3.addActionListener(calcEngine);
			  button4.addActionListener(calcEngine);
			  button5.addActionListener(calcEngine);
			  button6.addActionListener(calcEngine);
			  button7.addActionListener(calcEngine);
			  button8.addActionListener(calcEngine);
			  button9.addActionListener(calcEngine);
			  buttonPoint.addActionListener(calcEngine);
	     }
	    
	    public static void createAndShowGUI() {
	    	// Add the panel p1 to the center of the window				          
            windowContent.add("Center",p1);
	        //Create and set up the window.
	        JFrame frame = new JFrame("CalculatorBoxLayout");
	        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	        frame.setContentPane(windowContent);
	 
	        //Display the window.
	        frame.pack();
	        frame.setVisible(true);
	    }


	     public static void main(String[] args) {

		  new CalculatorBoxLayout();
		  createAndShowGUI();
	     
	     }

}
