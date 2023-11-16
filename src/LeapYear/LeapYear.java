package LeapYear;

import javax.swing.*;

public class LeapYear extends JFrame{
    private JButton btnCheckYear;
    private JLabel InputYear;
    private JPanel panel;
    private JTextField tfYear;

    public LeapYear() {
        LeapYear leap = this;
        btnCheckYear.addActionListener(e -> {
            String year = tfYear.getText();
            int _year = Integer.parseInt(year);

            if (_year % 4 == 0 && _year % 100 != 0 || _year % 400 == 0) {
                JOptionPane.showMessageDialog(null, "Leap year");
            } else {
                JOptionPane.showMessageDialog(null, "Not a leap year");
            }
        });


    }

    public static void main(String[] args) {
        LeapYear app = new LeapYear();
        app.setContentPane(app.panel);
        app.setSize(300, 200);
        app.setDefaultCloseOperation(EXIT_ON_CLOSE);
        app.setVisible(true);
        app.setTitle("leap year Checker");
    }

}
