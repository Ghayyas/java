//Making simple Calculator Just Demo no Functional


//Import Components

import java.awt.*;
import javax.swing.*;


//steps
/*
1.JFrame
2. JButton
3. JPanel
4. JTextField
5. JLabel;
6. call it new JButton
7. call JTextField
8. add buttons 
9. making Container and get content pane
10. setLayout
11. add container
12. setSize
13. set visibility
*/


//Making simple class

class SimpleCalulator{

    JFrame fCal;
    
    JButton b1,b2,b3,b4,b5,b6,b7,b8,b9,b0;
    JButton bPlus,bMinus,bMul,bPoint,bEqual,bClear;
    
    JPanel pButtons;
    
    JTextField tfAnswer;
    
    JLabel iMyCalc;
    
    public void initCalc(){
        
        fCal = new JFrame();   //make new Frame
        b0 = new JButton("0");
        b1 = new JButton("1");
        b2 = new JButton("2");
        b3 = new JButton("3");
        b4 = new JButton("4");
        b5 = new JButton("5");
        b6 = new JButton("6");
        b7 = new JButton("7");
        b8 = new JButton("8");
        b9 = new JButton("9");
        
        bPlus = new JButton("+");
        bMinus = new JButton("-");
        bMul = new JButton("*");
        bPoint = new JButton(".");
        bEqual = new JButton("=");
        bClear = new JButton("C");
        
        
        tfAnswer = new JTextField();
        iMyCalc = new JLabel("My Calculator");
        
        //Creating Panel object
        
        pButtons = new JPanel(new GridLayout(4,4));
        
        //Adding button component
        
        pButtons.add(b1);
        pButtons.add(b2);
        pButtons.add(b3);
        pButtons.add(b4);
        pButtons.add(b5);
        pButtons.add(b6);
        pButtons.add(b7);
        pButtons.add(b8);
        pButtons.add(b9);
        pButtons.add(b0);
        
        pButtons.add(bPlus);
        pButtons.add(bMinus);
        pButtons.add(bMul);
        pButtons.add(bPoint);
        pButtons.add(bEqual);
        pButtons.add(bClear);
        
        //setting container
        
        Container con = fCal.getContentPane();
        con.setLayout(new BorderLayout());
         
        //adding border to container
        
        con.add(tfAnswer,BorderLayout.NORTH);
        con.add(iMyCalc,BorderLayout.SOUTH);
        // con.add(iMyCalc,BorderLayout.CENTER);
        con.add(pButtons);    

        fCal.setSize(200,200);
        fCal.setVisible(true);
        
        
        
    }
    
    //Calling Default Constructor
    
    public SimpleCalulator(){
        initCalc();
    }
    
    //main Class
    
    public static void main(String args[]){
        SimpleCalulator cal = new SimpleCalulator();
            //   initCalc();
           
   }
}