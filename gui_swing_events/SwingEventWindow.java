package gui_swing_events;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class SwingEventWindow extends JFrame implements ActionListener{

    private  JRadioButton rdbtn1;
    private JRadioButton rdbtn2;
    private JRadioButton rdbtn3;
    private JRadioButton rdbtn4;
    private  JButton btn1;
    private JTextField txt1;
    private JTextField txt2;
    public void createWindow() {
        JFrame frame = new JFrame();
        frame.setSize(435, 300);
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
        panel2.add(label2);


        // Create text field (panel2)

        txt1 = new JTextField(18);
        panel2.add(txt1);

        // Create radio buttons (panel3)
        rdbtn1 = new JRadioButton("Auto Sum", true);
        rdbtn2 = new JRadioButton("Average");
        rdbtn3 = new JRadioButton("Maximum");
        rdbtn4 = new JRadioButton("Minimum");

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
        btn1 = new JButton("Calculate");
        panel4.add(btn1);

        // Create Textfield (panel 5)

        JLabel label3 = new JLabel("Results :");
        txt2 = new JTextField(30);
        panel5.add(label3);
        panel5.add(txt2);

        // add panel to mainPanel

        mainPanel.add(panel1);
        mainPanel.add(panel2);
        mainPanel.add(panel3);
        mainPanel.add(panel4);
        mainPanel.add(panel5);

        frame.getContentPane().add(mainPanel);

        // Add listener
        rdbtn1.addActionListener(this);
        rdbtn2.addActionListener(this);
        rdbtn3.addActionListener(this);
        rdbtn4.addActionListener(this);
        txt1.addActionListener(this);
        btn1.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        try {
            Object source = e.getSource();
            if (source == btn1) {
                String output_text = txt1.getText();

                    Excel e1 = new Excel(output_text);

                    if (rdbtn1.isSelected()) {
                        txt2.setText(String.valueOf(e1.findTotal()));
                    } else if (rdbtn2.isSelected()) {
                        txt2.setText(String.valueOf(e1.findAvg()));
                    } else if (rdbtn3.isSelected()) {
                        txt2.setText(String.valueOf(e1.findMax()));
                    } else if (rdbtn4.isSelected()) {
                        txt2.setText(String.valueOf(e1.findMin()));
                    }
                }
        }catch (Exception exp) {
            txt2.setText("Please enter a valid set of number !!");
            System.err.println("Catch error: " + exp.getMessage() + " / " + exp.getClass());
        }

    }

}
