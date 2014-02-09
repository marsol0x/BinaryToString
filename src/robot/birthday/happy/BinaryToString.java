package robot.birthday.happy;

import javax.swing.JFrame;

public class BinaryToString {

    public static void main(String[] args) {
        JFrame window = new JFrame("Binary to String");
        UI ui = new UI();
        
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        window.add(ui);

        window.pack();
        window.setLocationRelativeTo(null);
        window.setVisible(true);
    }

}
