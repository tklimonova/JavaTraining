package com.practicaljava.lesson8.tryit;

import java.awt.Color;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;


public class CalculatorGridBagLayout {
	
	// Creating the buttons and Strings used for the content pane.
    JButton[] numbers = new JButton[10];
    JButton[] controllers = new JButton[4];
    
    String[] numbers_name = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "0"};
    String[] controllers_name = {"+", "-", "*", "/"};

    JTextField displayField;
	
	 public JPanel createContentPanel (){
	
		// Create a panel and set a layout
		JPanel p1 = new JPanel(new GridBagLayout());
		GridBagLayout gb= new GridBagLayout();
		p1.setLayout(gb);
		
		// Create an instance of the GridBagConstraints
		// You’ll have to repeat these lines for each component 
		// that you’d like to add to the grid cell
		GridBagConstraints constr = new GridBagConstraints();
		
		//setting constraints for the Calculator’s displayField:
		
		// x,y coordinate in the grid 
			constr.gridx=0;
			constr.gridy=0;
		
		// this cell has the same height as other cells and width as 6 other ones
			constr.gridheight = 4;
			constr.gridwidth= 6;
			
		// fill all space in the cell 
			constr.fill= GridBagConstraints.BOTH;
		// proportion of horizontal space taken by this 
		// component
			constr.weightx = 1.0;
			
		// proportion of vertical space taken by this component 
			constr.weighty = 1.0;
		// position of the component within the cell 
			constr.anchor=GridBagConstraints.CENTER;
			
			JPanel numbers_panel = new JPanel();
	        panelMaker(numbers, numbers_name, numbers_panel, Color.blue);
	        
	        JPanel controllers_panel = new JPanel();
	        panelMaker(controllers, controllers_name, controllers_panel, Color.green);

	        numbers_panel.setLayout(new GridLayout(4,2));
	        p1.add(numbers_panel);
	        
	        controllers_panel.setLayout(new GridLayout(4,2));
	        p1.add(controllers_panel);
	        
			JTextField displayField = new JTextField();
			// set constrains for this field
			gb.setConstraints(displayField, constr);
			// add the text field to the window 
			p1.add(displayField);
			
			return p1;
	}
	 private void panelMaker(JButton[] buttons, String[] strings, JPanel panel, Color color) {
		 
		 for(int i = 0; i < buttons.length; i++){
			 buttons[i] = new JButton(strings[i]);
			 buttons[i].setForeground(color);
			 panel.add(buttons[i]);
		 }
	}
	private static void createAndShowGUI() {

	        JFrame.setDefaultLookAndFeelDecorated(true);
	        JFrame frame = new JFrame("CalculatorGridBagLayout");

	        CalculatorGridBagLayout demo = new CalculatorGridBagLayout();
	        frame.setContentPane(demo.createContentPanel());
	        
	        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	        frame.pack();
	        frame.setVisible(true);
	    }
		
		public static void main(String[] args) {
			
			new CalculatorGridBagLayout();	
			createAndShowGUI();
		}

}
