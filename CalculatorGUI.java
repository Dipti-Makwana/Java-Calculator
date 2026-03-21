import javax.swing.*;
import java.awt.*;

public class CalculatorGUI {
    public static void main(String[] args){
        JFrame window = new JFrame("JAVA CALCULATOR");
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setSize(400, 400);
        window.setLocationRelativeTo(null);
        window.setResizable(false);

        //-------Screen -----
        JTextField screen = new JTextField("0");
        screen.setFont(new Font("Arial", Font.PLAIN, 30));
        screen.setHorizontalAlignment(JTextField.RIGHT);
        screen.setEditable(false);


       //---------keypad--------------
        JPanel keypad = new JPanel();
        keypad.setLayout(new GridLayout(5, 4, 5, 5));

        //adding a button 
        String[] button = { "C", "%", "/", "<=", "7", "8", "9", "*", "4", "5", "6", "-", "1", "2", "3", "+", "+/-", "0", ".", "=" };
    for(String s : button ){
        JButton btn = new JButton(s);
        btn.addActionListener(e -> {
            if (s.equals("C")){
                screen.setText("0");
            }else{
                screen.setText(s);
            } 
        
        });
        keypad.add(btn);
    }

        window.setLayout(new BorderLayout());
        window.add(screen, BorderLayout.NORTH);
        window.add(keypad, BorderLayout.CENTER);

      
        window.setVisible(true);



    }
}
