//Making simple button using AWT Java Library


import java.awt.*;
import java.awt.event.*;
import javax.swing.JOptionPane;


class simpleAwtBtn extends Frame {
  
  simpleAwtBtn(){ 
   
    Button ok =  new Button("ok");
    
    ok.setBounds(10,10,10,10);
     
     
     setSize(100,100);
     add(ok);
     setVisible(true);
     addWindowListener( new WindowAdapter() {
     public void windowClosing(WindowEvent we) {
                int reply = JOptionPane.showConfirmDialog(null, "Are you Really want to close", "Warining", 
                            JOptionPane.YES_NO_OPTION);
                    if (reply == JOptionPane.YES_OPTION) {
                        System.out.println("yes");
                        System.exit(0);
                     }               

                     else {
                        System.out.println("no");
                   }                
            }
        } );
  }
  
    public static void main(String[] args){
         new simpleAwtBtn();
    }
}