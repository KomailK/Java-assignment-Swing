package gui_swing_events;

import javax.swing.*;
import java.awt.event.ActionListener;

public class SwingEventWindow {

    public void createWindow(){
        JFrame frame = new JFrame();
        frame.setSize(1080, 720);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);

        // Create Panels
        JPanel mainPanel = new JPanel();
        JPanel panel1 = new JPanel();
        JPanel panel2 = new JPanel();
        JPanel panel3 = new JPanel();
        JPanel panel4 = new JPanel();
        JPanel panel5 = new JPanel();

        // Create text field (panel1)

        JLabel label1 = new JLabel("Excel functions");
        JLabel label2 = new JLabel("Enter your number separate by spaces");
        panel1.add(label1);
        panel1.add(label2);

        // Create text field (panel2)

        JTextField txt1 = new JTextField(30);
        panel2.add(txt1);

        // Create radio buttons (panel3)
        JRadioButton rdbtn1 = new JRadioButton("Auto Sum", true);
        JRadioButton rdbtn2 = new JRadioButton("Average");
        JRadioButton rdbtn3 = new JRadioButton("Maximum");
        JRadioButton rdbtn4 = new JRadioButton("Minimum");

        ButtonGroup calculGroup = new ButtonGroup();
        calculGroup.add(rdbtn1);
        calculGroup.add(rdbtn2);
        calculGroup.add(rdbtn3);
        calculGroup.add(rdbtn4);

        panel3.add(rdbtn1);
        panel3.add(rdbtn2);
        panel3.add(rdbtn3);
        panel3.add(rdbtn4);

        // Create button (panel4)
        JButton btn1 = new JButton("Calculate");
        panel4.add(btn1);

        // Create Textfield (panel 5)

        JLabel label3 = new JLabel("Results :");
        JTextField txt2 = new JTextField(30);
        panel5.add(txt2);
        panel5.add(label3);

        // add panel to mainPanel

        mainPanel.add(panel1);
        mainPanel.add(panel2);
        mainPanel.add(panel3);
        mainPanel.add(panel4);
        mainPanel.add(panel5);

        frame.getContentPane().add(mainPanel);
    }


}
