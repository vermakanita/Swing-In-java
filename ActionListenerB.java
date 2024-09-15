import java.awt.event.*;
import javax.swing.*;
class ButtonACLI
{
    public static void main(String args[])
    {
        JFrame f = new JFrame("Button");
        final JTextField tf = new JTextField();
        tf.setBounds(50,50,150,20);
        JButton b= new JButton("click");
        b.setBounds(50,50,150,20);
        b.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                tf.setText("the kanita");
            }
        }
        ) ;
        f.add(b);
        f.add(tf);
        f.setSize(400,400);
        f.setLayout(null);
        f.setVisible(true);

            
        

    }

}
