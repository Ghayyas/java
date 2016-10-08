//Prompt box in java


import javax.swing.JOptionPane;

class Prompt{
    public static void main(String[] args){
   try{
        String fn  = JOptionPane.showInputDialog("Enter first number");
        String sn = JOptionPane.showInputDialog("Enter Second Number");
        
        int num1,num2;
        
        num1 = Integer.parseInt(fn);
        num2 = Integer.parseInt(sn);
        
        int sum =  num1 + num2;
        JOptionPane.showMessageDialog(null,"The Sum is " + sum , "sum ", JOptionPane.PLAIN_MESSAGE);
    }
    
    catch(NumberFormatException e){
        JOptionPane.showMessageDialog(null,"Something Went Wrong please input again");
        System.out.println("Make some noise for the desi boys...");
    }
    
  }
    
}