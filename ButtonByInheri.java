import javax.swing.*;
public class ButtonByInheri extends JFrame {
    JFrame f;
    ButtonByInheri() {
        JButton b = new JButton("IRIS");
        b.setBounds(130,100,100,90);
        add(b);
        setSize(400,500);
        setLayout(null);
        setVisible(true);
    }
    public static void main (String args[]){
        new ButtonByInheri();
    }

    
    
}
