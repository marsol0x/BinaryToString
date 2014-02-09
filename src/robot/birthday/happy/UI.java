package robot.birthday.happy;

import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextArea;

@SuppressWarnings("serial")
public class UI extends JPanel implements ActionListener {
    
    private JTextArea input;
    private JTextArea output;
    private JButton convertButton;
    private GridBagConstraints constraints;
    
    public UI() {
        super();
        setLayout(new GridBagLayout());
        
        input = new JTextArea();
        output = new JTextArea();
        output.setEditable(false);
        convertButton = new JButton("Convert");
        
        constraints = new GridBagConstraints();
        constraints.weightx = 1.0;
        constraints.weighty = 1.0;
        constraints.fill = GridBagConstraints.HORIZONTAL;
        
        convertButton.addActionListener(this);

        input.setLineWrap(true);
        input.setWrapStyleWord(true);
        input.setPreferredSize(new Dimension(300, 100));

        output.setEditable(false);
        output.setPreferredSize(new Dimension(300, 100));
        
        constraints.gridx = 0;
        constraints.gridy = 0;
        add(input, constraints);

        constraints.gridx = 0;
        constraints.gridy = 1;
        add(convertButton, constraints);

        constraints.gridx = 0;
        constraints.gridy = 2;
        constraints.ipady = 0;
        add(output, constraints);
    }
    
    private void convert() {
        StringBuilder sb = new StringBuilder();
        String out = input.getText();
        String[] parts = out.split(" ");

        for (String p : parts) {
            if (p.length() < 0) continue;
            sb.append((char) Integer.parseInt(p, 2));
        }
        
        output.setText(sb.toString());
    }
    
    public void actionPerformed(ActionEvent e) {
        convert();
    }
}
