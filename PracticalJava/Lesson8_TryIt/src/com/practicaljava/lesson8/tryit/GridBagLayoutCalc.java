package com.practicaljava.lesson8.tryit;


import javax.swing.*;

import java.awt.*;

public class GridBagLayoutCalc {
	
	// Create an instance of the GridBagConstraints
    // You’ll have to repeat these lines for each component
    // that you’d like to add to the grid cell
	GridBagConstraints constr = new GridBagConstraints(); {
		
		// proportion of horizontal and vertical space taken by this component
		constr.weightx = 1.0;  
        constr.weighty = 1.0;
        
     // fill all space in the cell 
        constr.fill = GridBagConstraints.BOTH;
	}
	
    // Declare all calculator's components.
    JPanel windowContent;
    JTextField displayField;

    JButton[] numbers;
    JButton[] equals;
    JButton[] controllers;

    String[] numbers_name;
    String[] equals_name;
    String[] controllers_name;

    JPanel p1; 
    
    public void setDisplayValue(String val){
        displayField.setText(val);
    }

    public String getDisplayValue() {
        return displayField.getText();
    }

    // Constructor  creates the components
    // and adds them to the frame using GridBagLayout

    GridBagLayoutCalc(){

        windowContent = new JPanel();

        // Set the layout manager for this panel
        GridBagLayout gblwc = new GridBagLayout();
        windowContent.setLayout(gblwc);


        // Create the display field and place it in the
        // North area of the window

        displayField = new JTextField(20);
        gblwc.setConstraints(displayField, constr);
        windowContent.add("0",displayField);
        

        // Create buttons using constructor of the
        // class JButton that takes the label of the
        // button as a parameter

        JButton[] numbers = new JButton[10];
        JButton[] equals = new JButton[1];
        JButton[] controllers = new JButton[4];

        String[] numbers_name = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "0"};
        String[] equals_name = {"="};
        String[] controllers_name = {"+", "-", "*", "/"};

        // Create the panel with the GridBagLayout with 15 buttons
        //10 numeric ones, 4 controllers, and the equal sign

        p1 = new JPanel();
        GridBagLayout gbl =new GridBagLayout();
        p1.setLayout(gbl);

        //  Add window controls to the panel p1
        panelMaker(numbers, numbers_name, p1, Color.BLUE);
        panelMaker(equals, equals_name, p1, Color.BLACK);
        panelMaker(controllers, controllers_name, p1, Color.BLACK);



        // Add the panel p1 to the center of the window
        windowContent.add("Center",p1);

        //Create the frame and set its content pane
        JFrame frame = new JFrame("Calculator");
        frame.setContentPane(windowContent);

        // Set the size of the window to be big enough to accommodate all controls
        frame.pack();

        // Display the window
        frame.setVisible(true);

    }

    private void panelMaker(JButton[] buttons, String[] strings, JPanel panel, Color color) {

        CalculatorGridBagLayoutEngine calcEngine = new CalculatorGridBagLayoutEngine(this);

        for(int i = 0; i < buttons.length; i++){
            buttons[i] = new JButton(strings[i]);
            buttons[i].setForeground(color);
            panel.add(buttons[i]);
            buttons[i].addActionListener(calcEngine);
        }
    }    

        public static void main(String[] args) {

         new GridBagLayoutCalc();

    }

}
