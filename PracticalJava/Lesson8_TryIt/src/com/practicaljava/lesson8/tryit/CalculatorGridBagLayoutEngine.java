package com.practicaljava.lesson8.tryit;

import java.awt.event.ActionListener; 
import java.awt.event.ActionEvent;

import javax.swing.JButton;

public class CalculatorGridBagLayoutEngine implements ActionListener {

    GridBagLayoutCalc parent; // a reference to the GridBagLayoutCalc

    // Constructor stores the reference to the
    // GridBagLayoutCalc window in  the member variable parent
    CalculatorGridBagLayoutEngine(GridBagLayoutCalc parent){
        this.parent = parent;
    }

	public void actionPerformed(ActionEvent e){
        // Get the source of this action
        JButton clickedButton =  (JButton) e.getSource();

        // Get the existing text from the GridBagLayoutCalc’s
        // display field. Reaching inside another object is bad.
        String dispFieldText = parent.getDisplayValue();

        // Get the button's label
        String clickedButtonLabel = clickedButton.getText();
       	
        parent.setDisplayValue(dispFieldText + 
                                        clickedButtonLabel);
    }
}
