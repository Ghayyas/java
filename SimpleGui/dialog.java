

//Importing packages

import java.awt.*;
import javax.swing.*;


//Parent class

class Dialog{
    JFrame myFrame;  //JFrame variable
    JTextField tf;   //Java Text field
    JButton b1; //Java Button
    
    public void initGui(){   //Method for setting Layout
        //Setup top level container
        myFrame = new JFrame();
        //Component for top level component
        Container c = myFrame.getContentPane();    //Content pane
        //Applying layout
        c.setLayout(new BorderLayout());
        //Create and add component
        JTextField tf = new JTextField("helo",10);   //Text field
        JButton b1 = new JButton("Click me");
        JButton b2 = new JButton("Click 2");
        
        //add them
        c.add(tf,BorderLayout.NORTH);  //adding text filed
        c.add(b1,BorderLayout.SOUTH);  //adding button
        c.add(b2,BorderLayout.WEST);
        //setting size and make them visible
        myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        myFrame.setSize(200,200);
        // myFrame.add(tf);
        // myFrame.add(b1);
        myFrame.setVisible(true);
    }
    public Dialog(){   //Constructor
        initGui();
    }
    public static void main(String[] args){
        Dialog free = new Dialog();
    }
}