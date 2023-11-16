package gui_swing_events;
import javax.swing.*;

class Main {
    public static void main(String[] args) {

        SwingEventWindow s1 = new SwingEventWindow();
        s1.createWindow();


        Excel e1 = new Excel("10 20");
        System.out.println(e1.findTotal());
        System.out.println(e1.findAvg());
        System.out.println(e1.findMax());
        System.out.println(e1.findMin());
    }
}