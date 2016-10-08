//Button Event


import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class ButtonEvent implements ActionListener{
   
    JLabel jlab;    
    
     ButtonEvent(){
        //JFrame Container
        
        JFrame jfrm = new JFrame("Button Example");
        //Flow Layout
        
        jfrm.setLayout(new FlowLayout());
        
        //Give size of Frame
        int width = 220;
        int height = 100;
        jfrm.setSize(width,height);
        
        //Terminate On Close
        
        jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        //Make two Button
        JButton JBtnUp = new JButton("Up");
        JButton JBtnDN =  new JButton("Down");
        
        
        //Add Action Listener
        
        JBtnUp.addActionListener(this);
        JBtnDN.addActionListener(this);
        
        //Add these Buttons
        
        jfrm.add(JBtnUp);
        jfrm.add(JBtnDN);
        
        //Create Label
        
        jlab = new JLabel("Press a Button");
        
        //Add the lable
        
        jfrm.add(jlab);
        
        //Disply the table
        
        jfrm.setVisible(true);
    }
        //Handel Button Events
        
        public void actionPerformed(ActionEvent ae){
            if(ae.getActionCommand().equals("Up")){
                jlab.setText("You Pressed Up");
            }
            else{
                jlab.setText("You Pressed Down");
            }
        }        
            public static void main(String[] args){
               SwingUtilities.invokeLater(new Runnable() {
                    public void run() {
                          new ButtonEvent();
                       }
            });  
     }
}