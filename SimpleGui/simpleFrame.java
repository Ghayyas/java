// A simple Swing program.
import javax.swing.*;
 
 class SimpleFrame{
       SimpleFrame(){
           
         JFrame jfm = new JFrame("A simple swing Application");
         jfm.setSize(275,100);
         jfm.setDefaultCloseOperation(jfm.EXIT_ON_CLOSE);
         //text label
         JLabel jlab = new JLabel("Hello world");
         //add lable to pane
         jfm.add(jlab);
         JButton jb = new JButton("Click me"); 
         jfm.add(jb);
          //Display the frame
          jfm.setVisible(true);  
     }
     public static void main(String[] args){
         //Create the Frame on the event dispatching thread
         
         SwingUtilities.invokeLater(new Runnable(){
             public void run(){
                 new SimpleFrame();
             }
         });
     }
 }