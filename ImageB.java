 
//import java.awt.event.*;
import javax.swing.*;
public class ImageB 
 {
     
        ImageB (){
        JFrame f = new JFrame("Button");
         
         
        JButton b= new JButton(new ImageIcon("C:\\Users\\Lenovo\\Desktop\\Swing inJava\\Screenshot 2024-09-13 212722.png"));
        b.setBounds(50,50,150,20);
         f.add(b);
        f.setSize(400,400);
        f.setLayout(null);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

            
        

    }
    public static void main(String args[])
    {
        new ImageB();

}}

    

