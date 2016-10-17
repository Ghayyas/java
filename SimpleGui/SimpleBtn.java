//Simple work with AWT

//importing AWT

// import java.awt.*;

//steps

/*
1. import java.awt
2. call function with name of class
3. make button with variable b
4. set bounds
5. add varible b
6. set size
7. set Layout
8. set visiblity
9. call the main class

*/



// class SimpleBtn extends Frame{    //inheritance
    
//     SimpleBtn(){
//         Button b = new Button("Click me");
//         b.setBounds(30,100,80,30);// setting button position  
//         TextField f = new TextField();
//         f.setBounds(23,34,32,54);
//         add(f);
//         add(b);  //adding the btn
//         setSize(200,200); //setting size
//         setLayout(null); //setting layout
//         setVisible(true);  //setting display
//         // setDefaultCloseOperation(EXIT_ON_CLOSE); //It Gives me Error.. How to close this on cmd?
//     }
    
//     public static void main(String[] args){
//         SimpleBtn btn = new SimpleBtn();
//     }
// }




//ERORR

/*
class SimpleBtn extends Frame{    //inheritance
    
    ClickMe(){
        Button b = new Button("Click me");
        b.setBounds(30,100,80,30);// setting button position  
        
        add(b);  //adding the btn
        setSize(200,200); //setting size
        setLayout(null); //setting layout
        setVisible(true);  //setting display
        // setDefaultCloseOperation(EXIT_ON_CLOSE); //Exit on close
    }
    
    public static void main(String[] args){
    
        ClickMe btn = new ClickMe();
    }
}

*/



//ERORR

/*
class SimpleBtn extends Frame{    //inheritance
    
    ClickMe(){
        Button b = new Button("Click me");
        b.setBounds(30,100,80,30);// setting button position  
        
        add(b);  //adding the btn
        setSize(200,200); //setting size
        setLayout(null); //setting layout
        setVisible(true);  //setting display
        // setDefaultCloseOperation(EXIT_ON_CLOSE); //Exit on close
    }
    
    public static void main(String[] args){
    
        ClickMe btn = new SimpleBtn();
    }
}

*/



// Event lister


import java.awt.*;
import java.awt.event.*;


class MynewEvent extends Frame implements ActionListener{
// class AEvent extends Frame implements ActionListener{  
        TextField tf;

    MynewEvent(){
        
        tf = new TextField();
        // tf.setBounds(100,100,100,100);
       tf.setBounds(60,50,170,20);
       
        // Button b;
        Button b = new Button("Click Me");
        b.setBounds(100,100,100,100);
        b.addActionListener(this);  

        add(b); add(tf);
        
        setSize(300,300);
        setVisible(true);
    
    
    
    
    }
    
    public void addActionListener(ActionListener a){
        // Event();
        tf.setText("Wellcome Here");
    }
    
    //   public void actionPerformed(ActionEvent e){  
    //     tf.setText("Welcome");  
    //     }  
    
    public static void main(String[] args){
        // ActionPerformed ac = new ActionPerformed();
         new MynewEvent();
    }
}


/////////

// import java.awt.*;  
// import java.awt.event.*;  
  
// class MyEvent extends Frame implements ActionListener{  
// TextField tf;  
// MyEvent(){  
  
// tf=new TextField();  
// tf.setBounds(60,50,170,20);  
  
// Button b=new Button("click me");  
// b.setBounds(100,120,80,30);  
  
// b.addActionListener(this);  
  
// add(b);add(tf);  
  
// setSize(300,300);  
// setLayout(null);  
// setVisible(true);  
  
// }  
  
// public void actionPerformed(ActionEvent e){  
// tf.setText("Welcome");  
// }  
  
// public static void main(String args[]){  
// new MyEvent();  
// }  
// }  